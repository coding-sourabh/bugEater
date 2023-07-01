package com.bugeater.bugeaterIntern.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bugeater.bugeaterIntern.dto.ProjectDTO;
import com.bugeater.bugeaterIntern.entity.Project;
import com.bugeater.bugeaterIntern.exception.BugInternException;
import com.bugeater.bugeaterIntern.repository.ProjectRepository;

import jakarta.transaction.Transactional;

@Service("projectService")
@Transactional
public class ProjectServiceImpl implements ProjectService {
	@Autowired
	ProjectRepository projectRepository;
	
	@Override
	public String addProject(ProjectDTO projectDTO) {
		Project project = new Project();
		project.setFromDTO(projectDTO);
		projectRepository.save(project);
		return "Project Added Successfully";
	}
	
	@Override
	public List<ProjectDTO> getAllProjects() {
		List<ProjectDTO> projectDTOs = new ArrayList<>();
		Iterable<Project> itr = projectRepository.findAll();
		
		itr.forEach(project -> {
			ProjectDTO projectDTO = new ProjectDTO();
			projectDTO.setFromEntity(project);    // this method make a DTO from an entiry
			projectDTOs.add(projectDTO);
		});
		return projectDTOs;
	}

	@Override
	public ProjectDTO getProjectById(Integer projectId) throws BugInternException {
		Optional<Project> projectOptional = projectRepository.findById(projectId);
		
		Project project = projectOptional.orElseThrow(() -> new BugInternException("Project Id is invalid"));
		ProjectDTO projectDTO = new ProjectDTO();
		projectDTO.setFromEntity(project);
		return projectDTO;
	}

	@Override
	public String updateProjectById(Integer projectId, ProjectDTO projectDTO) throws BugInternException {
		Optional<Project> projectOptional = projectRepository.findById(projectId);
		
		Project project = projectOptional.orElseThrow(() -> new BugInternException("Project Id is invalid"));
		project.setFromDTO(projectDTO);   // sets the value from a project dTO
		projectRepository.save(project);
		return "Project Updated Successfully";
	}
	
	@Override
	public String deleteProjectById(Integer projectId) throws BugInternException {
		projectRepository.deleteById(projectId);
		return "Project Deletion Successfull!";
	}
}
