package com.bugeater.bugeaterIntern.entity;

import java.util.Date;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

@Entity
public class Project {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer projectId;
	private String projectName;
	private String projectDesc;
	private Integer projectDuration;
	private Double projectStipend;
	private Integer projectVacancy;
	private Date projectStartDate;
	private String projectLocation;
	private String projectOrg;
	
	@OneToOne(cascade = CascadeType.MERGE)
	@JoinColumn(name = "mentor_id", unique = true)
	private Mentor mentor;

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

	public Mentor getMentor() {
		return mentor;
	}

	public void setMentor(Mentor mentor) {
		this.mentor = mentor;
	}
	
	
}
