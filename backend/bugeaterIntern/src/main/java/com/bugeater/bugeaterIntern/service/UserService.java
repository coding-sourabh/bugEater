package com.bugeater.bugeaterIntern.service;

import java.util.List;
import com.bugeater.bugeaterIntern.dto.UserDTO;
import com.bugeater.bugeaterIntern.exception.BugInternException;

public interface UserService {
	public String addUser(UserDTO userDTO);
	public List<UserDTO> getAllUsers();
	public UserDTO getUserById(Integer userId) throws BugInternException;
	public String deleteUserById(Integer userId) throws BugInternException;
	public String updateUserById(Integer userId, UserDTO userDTO) throws BugInternException;
}
