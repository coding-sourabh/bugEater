package com.bugeater.bugeaterIntern.dto;

import com.bugeater.bugeaterIntern.entity.User;

public class UserDTO{
	
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
	
	public void setFromEntity(User user) {
		this.setUserId(user.getUserId());
		this.setUserName(user.getUserName());
		this.setUserEmail(user.getUserEmail());
		this.setUserPass(user.getUserPass());
		this.setUserImg(user.getUserImg());
		this.setUserMobile(user.getUserMobile());
		this.setUserResume(user.getUserResume());			
		this.setUserDesc(user.getUserDesc());		
		this.setUserExp(user.getUserExp());
	}
}