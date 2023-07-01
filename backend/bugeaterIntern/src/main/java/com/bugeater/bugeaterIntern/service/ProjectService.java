package com.bugeater.bugeaterIntern.service;

import java.util.List;
import com.bugeater.bugeaterIntern.dto.ProjectDTO;
import com.bugeater.bugeaterIntern.exception.BugInternException;

public interface ProjectService {
	public String addProject(ProjectDTO projectDTO);
	public List<ProjectDTO> getAllProjects();
	public ProjectDTO getProjectById(Integer projectId) throws BugInternException;
	public String deleteProjectById(Integer projectId) throws BugInternException;
	public String updateProjectById(Integer projectId, ProjectDTO projectDTO) throws BugInternException;
}
