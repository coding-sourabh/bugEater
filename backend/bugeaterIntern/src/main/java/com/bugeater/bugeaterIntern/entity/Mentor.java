package com.bugeater.bugeaterIntern.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Mentor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer mentorId;
    private String mentorName;
    private String mentorEmail;
    private String mentorPass;
    private String mentorImg;
    private String mentorMobile;
    private String mentorOrg;
    private Double mentorExp;
    private String mentorDesc;
    
	public Integer getMentorId() {
		return mentorId;
	}
	public void setMentorId(Integer mentorId) {
		this.mentorId = mentorId;
	}
	public String getMentorName() {
		return mentorName;
	}
	public void setMentorName(String mentorName) {
		this.mentorName = mentorName;
	}
	public String getMentorEmail() {
		return mentorEmail;
	}
	public void setMentorEmail(String mentorEmail) {
		this.mentorEmail = mentorEmail;
	}
	public String getMentorPass() {
		return mentorPass;
	}
	public void setMentorPass(String mentorPass) {
		this.mentorPass = mentorPass;
	}
	public String getMentorImg() {
		return mentorImg;
	}
	public void setMentorImg(String mentorImg) {
		this.mentorImg = mentorImg;
	}
	public String getMentorMobile() {
		return mentorMobile;
	}
	public void setMentorMobile(String mentorMobile) {
		this.mentorMobile = mentorMobile;
	}
	public String getMentorOrg() {
		return mentorOrg;
	}
	public void setMentorOrg(String mentorOrg) {
		this.mentorOrg = mentorOrg;
	}
	public Double getMentorExp() {
		return mentorExp;
	}
	public void setMentorExp(Double mentorExp) {
		this.mentorExp = mentorExp;
	}
	public String getMentorDesc() {
		return mentorDesc;
	}
	public void setMentorDesc(String mentorDesc) {
		this.mentorDesc = mentorDesc;
	}
}
