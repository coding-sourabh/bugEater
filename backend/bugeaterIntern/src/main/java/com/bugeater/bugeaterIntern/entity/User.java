package com.bugeater.bugeaterIntern.entity;

import com.bugeater.bugeaterIntern.dto.UserDTO;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class User{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer userId;
	private String userName;
	private String userEmail;
	private String userPass;
	private String userImg;
	private String userMobile;
	private Double userExp;
	private String userDesc;
	private String userResume;
	
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserEmail() {
		return userEmail;
	}
	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}
	public String getUserPass() {
		return userPass;
	}
	public void setUserPass(String userPass) {
		this.userPass = userPass;
	}
	public String getUserImg() {
		return userImg;
	}
	public void setUserImg(String userImg) {
		this.userImg = userImg;
	}
	public String getUserMobile() {
		return userMobile;
	}
	public void setUserMobile(String userMobile) {
		this.userMobile = userMobile;
	}
	public Double getUserExp() {
		return userExp;
	}
	public void setUserExp(Double userExp) {
		this.userExp = userExp;
	}
	public String getUserDesc() {
		return userDesc;
	}
	public void setUserDesc(String userDesc) {
		this.userDesc = userDesc;
	}
	public String getUserResume() {
		return userResume;
	}
	public void setUserResume(String userResume) {
		this.userResume = userResume;
	}
	
	public void setFromDTO(UserDTO userDTO) {
		this.setUserId(userDTO.getUserId());
		this.setUserName(userDTO.getUserName());
		this.setUserEmail(userDTO.getUserEmail());
		this.setUserPass(userDTO.getUserPass());
		this.setUserImg(userDTO.getUserImg());
		this.setUserMobile(userDTO.getUserMobile());
		this.setUserResume(userDTO.getUserResume());			
		this.setUserDesc(userDTO.getUserDesc());		
		this.setUserExp(userDTO.getUserExp());
	}
	
}