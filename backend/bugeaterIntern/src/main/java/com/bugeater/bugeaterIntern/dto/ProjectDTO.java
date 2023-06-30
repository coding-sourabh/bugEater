package com.bugeater.bugeaterIntern.dto;

import java.util.Date;

public class ProjectDTO {
	private Integer projectId;
	private String projectName;
	private String projectDesc;
	private Integer projectDuration;
	private Double projectStipend;
	private Integer projectVacancy;
	private Date projectStartDate;
	private String projectLocation;
	private String projectOrg;
	private MentorDTO mentorDTO;
	
	public Integer getProjectId() {
		return projectId;
	}
	public void setProjectId(Integer projectId) {
		this.projectId = projectId;
	}
	public String getProjectName() {
		return projectName;
	}
	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}
	public String getProjectDesc() {
		return projectDesc;
	}
	public void setProjectDesc(String projectDesc) {
		this.projectDesc = projectDesc;
	}
	public Integer getProjectDuration() {
		return projectDuration;
	}
	public void setProjectDuration(Integer projectDuration) {
		this.projectDuration = projectDuration;
	}
	public Double getProjectStipend() {
		return projectStipend;
	}
	public void setProjectStipend(Double projectStipend) {
		this.projectStipend = projectStipend;
	}
	public Integer getProjectVacancy() {
		return projectVacancy;
	}
	public void setProjectVacancy(Integer projectVacancy) {
		this.projectVacancy = projectVacancy;
	}
	public Date getProjectStartDate() {
		return projectStartDate;
	}
	public void setProjectStartDate(Date projectStartDate) {
		this.projectStartDate = projectStartDate;
	}
	public String getProjectLocation() {
		return projectLocation;
	}
	public void setProjectLocation(String projectLocation) {
		this.projectLocation = projectLocation;
	}
	public String getProjectOrg() {
		return projectOrg;
	}
	public void setProjectOrg(String projectOrg) {
		this.projectOrg = projectOrg;
	}
	public MentorDTO getMentorDTO() {
		return mentorDTO;
	}
	public void setMentorDTO(MentorDTO mentorDTO) {
		this.mentorDTO = mentorDTO;
	}
	
	
}
