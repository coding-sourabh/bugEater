package com.bugeater.bugeaterIntern.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bugeater.bugeaterIntern.dto.ProjectDTO;
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
}
