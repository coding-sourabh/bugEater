package com.bugeater.bugeaterIntern.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bugeater.bugeaterIntern.dto.ProjectDTO;
import com.bugeater.bugeaterIntern.exception.BugInternException;
import com.bugeater.bugeaterIntern.service.ProjectService;

@RestController
@CrossOrigin
@RequestMapping(value = "project")
public class ProjectController {
	@Autowired
	ProjectService projectService;
	
	@GetMapping(value = "all")
	ResponseEntity<List<ProjectDTO>> getAllProjects() {
		List<ProjectDTO> projectDTOs = projectService.getAllProjects();
		return new ResponseEntity<List<ProjectDTO>>(projectDTOs, HttpStatus.OK);
	}
	
	@PostMapping(value = "add")
	ResponseEntity<String> addProject(@RequestBody ProjectDTO projectDTO) throws BugInternException {
		String resp = projectService.addProject(projectDTO);
		return new ResponseEntity<String>(resp, HttpStatus.CREATED);
	}
	
	@GetMapping(value = "{projectId}")
	ResponseEntity<ProjectDTO> getProjectById(@PathVariable Integer projectId) throws BugInternException {
		ProjectDTO projectDTO = projectService.getProjectById(projectId);
		return new ResponseEntity<ProjectDTO>(projectDTO, HttpStatus.OK);
	}
	
	@PutMapping(value = "update/{projectId}")
	ResponseEntity<String> updateProjectById(@PathVariable Integer projectId, @RequestBody ProjectDTO projectDTO) throws BugInternException {
		String resp = projectService.updateProjectById(projectId, projectDTO);
		return new ResponseEntity<String>(resp, HttpStatus.CREATED);
	}
	
	@DeleteMapping(value = "delete/{projectId}")
	ResponseEntity<String> deleteProjectById(@PathVariable Integer projectId) throws BugInternException {
		String resp = projectService.deleteProjectById(projectId);
		return new ResponseEntity<String>(resp, HttpStatus.OK);
	}
}
