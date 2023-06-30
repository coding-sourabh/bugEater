package com.bugeater.bugeaterIntern.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.bugeater.bugeaterIntern.dto.ProjectDTO;

import jakarta.transaction.Transactional;

public interface ProjectService {
	public List<ProjectDTO> getAllProjects();
}
