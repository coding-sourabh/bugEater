package com.bugeater.bugeaterIntern.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bugeater.bugeaterIntern.dto.UserDTO;
import com.bugeater.bugeaterIntern.entity.User;
import com.bugeater.bugeaterIntern.repository.UserRepository;

import com.bugeater.bugeaterIntern.exception.BugInternException;
import jakarta.transaction.Transactional;

@Service
@Transactional
public class UserServiceImpl implements UserService{

	@Autowired
	UserRepository userRepository;
	
	@Override
	public String addUser(UserDTO userDTO) {
		User user = new User();
		user.setFromDTO(userDTO);
		userRepository.save(user);
		return "User Added Successfully";
	}
	
	@Override
	public List<UserDTO> getAllUsers() {
		List<UserDTO> userDTOs = new ArrayList<>();
		Iterable<User> itr = userRepository.findAll();
		
		itr.forEach(user -> {
			UserDTO userDTO = new UserDTO();
			userDTO.setFromEntity(user);     // this method make a DTO from an entity
			userDTOs.add(userDTO);
		});
		return userDTOs;
	}
	
	@Override
	public UserDTO getUserById(Integer userId) throws BugInternException {
		Optional<User> userOptional = userRepository.findById(userId);
		
		User user = userOptional.orElseThrow(() -> new BugInternException("User Id is invalid"));
		UserDTO userDTO = new UserDTO();
		userDTO.setFromEntity(user);
		return userDTO;
	}
	
	@Override
	public String updateUserById(Integer userId, UserDTO userDTO) throws BugInternException {
		Optional<User> userOptional = userRepository.findById(userId);
		
		User user = userOptional.orElseThrow(() -> new BugInternException("User Id is invalid"));
		user.setFromDTO(userDTO);     // sets the value from a user dTO
		userRepository.save(user);
		return "User Updated Successfully";
	}
	
	@Override
	public String deleteUserById(Integer userId) throws BugInternException {
		userRepository.deleteById(userId);
		return "User Deleted Successfully";
	}
}