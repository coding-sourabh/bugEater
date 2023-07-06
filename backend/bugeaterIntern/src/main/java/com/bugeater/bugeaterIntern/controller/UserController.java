package com.bugeater.bugeaterIntern.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.bugeater.bugeaterIntern.dto.UserDTO;
import com.bugeater.bugeaterIntern.exception.BugInternException;
import com.bugeater.bugeaterIntern.service.UserService;

@RestController
@CrossOrigin
@RequestMapping(value = "user")
public class UserController {
	@Autowired
	UserService userService;
	
	@GetMapping(value = "all")
	ResponseEntity<List<UserDTO>> getAllUsers() {
		List<UserDTO> userDTOs = userService.getAllUsers();
		return new ResponseEntity<List<UserDTO>>(userDTOs, HttpStatus.OK);
	}
	
	@PostMapping(value = "add")
	ResponseEntity<String> addUser(@RequestBody UserDTO userDTO) throws BugInternException {
		String resp = userService.addUser(userDTO);
		return new ResponseEntity<String>(resp, HttpStatus.CREATED);
	}
	
	@GetMapping(value = "{userId}")
	ResponseEntity<UserDTO> getUserById(@PathVariable Integer userId) throws BugInternException {
		UserDTO userDTO = userService.getUserById(userId);
		return new ResponseEntity<UserDTO>(userDTO, HttpStatus.OK);
	}
	
	@PutMapping(value = "update/{userId}")
	ResponseEntity<String> updateUserById(@PathVariable Integer userId, @RequestBody UserDTO userDTO) throws BugInternException {
		String resp = userService.updateUserById(userId, userDTO);
		return new ResponseEntity<String>(resp, HttpStatus.CREATED);
	}
	
	@DeleteMapping(value = "delete/{userId}")
	ResponseEntity<String> deleteUserById(@PathVariable Integer userId) throws BugInternException {
		String resp = userService.deleteUserById(userId);
		return new ResponseEntity<String>(resp, HttpStatus.OK);
	}
}


