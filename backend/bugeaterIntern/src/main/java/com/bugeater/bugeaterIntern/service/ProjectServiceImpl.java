package com.bugeater.bugeaterIntern.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bugeater.bugeaterIntern.dto.MentorDTO;
import com.bugeater.bugeaterIntern.dto.ProjectDTO;
import com.bugeater.bugeaterIntern.entity.Mentor;
import com.bugeater.bugeaterIntern.entity.Project;
import com.bugeater.bugeaterIntern.repository.ProjectRepository;

import jakarta.transaction.Transactional;

@Service("projectService")
@Transactional
public class ProjectServiceImpl implements ProjectService {
	@Autowired
	ProjectRepository projectRepository;
	
	public List<ProjectDTO> getAllProjects() {
		List<ProjectDTO> projectDTOs = new ArrayList<>();
		Iterable<Project> itr = projectRepository.findAll();
		
		itr.forEach(project -> {
			ProjectDTO projectDTO = new ProjectDTO();
			projectDTO.setProjectId(project.getProjectId());
			projectDTO.setProjectName(project.getProjectName());
			projectDTO.setProjectDesc(project.getProjectDesc());
			projectDTO.setProjectStipend(project.getProjectStipend());
			projectDTO.setProjectVacancy(project.getProjectVacancy());
			projectDTO.setProjectStartDate(project.getProjectStartDate());
			projectDTO.setProjectLocation(project.getProjectLocation());
			projectDTO.setProjectOrg(project.getProjectOrg());
			
			Mentor mentor = project.getMentor();
			MentorDTO mentorDTO = new MentorDTO();

			mentorDTO.setMentorId(mentor.getMentorId());
			mentorDTO.setMentorName(mentor.getMentorName());
			mentorDTO.setMentorEmail(mentor.getMentorEmail());
			mentorDTO.setMentorPass(mentor.getMentorPass());
			mentorDTO.setMentorImg(mentor.getMentorImg());
			mentorDTO.setMentorMobile(mentor.getMentorMobile());
			mentorDTO.setMentorOrg(mentor.getMentorOrg());			
			mentorDTO.setMentorDesc(mentor.getMentorDesc());		
			mentorDTO.setMentorExp(mentor.getMentorExp());
			projectDTO.setMentorDTO(mentorDTO);
			projectDTOs.add(projectDTO);
		});
		return projectDTOs;
	}
}
