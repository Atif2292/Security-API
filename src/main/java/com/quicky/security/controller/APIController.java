package com.quicky.security.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.quicky.security.dto.SignInDTO;
import com.quicky.security.dto.SignUpDTO;
import com.quicky.security.service.SignInService;
import com.quicky.security.service.SignUpService;

@Controller
@RequestMapping("")
public class APIController {

	@Autowired
	public SignUpService signUpService;

	// Sign-API
	@Autowired
	public SignInService signInService;
	
	// Sign-API
	@CrossOrigin
	@PostMapping("/register")
	public ResponseEntity<String> registerUser(@RequestBody SignUpDTO dto) {
		signUpService.signUp(dto);
		return new ResponseEntity<>("created", HttpStatus.CREATED);
	}	
	@CrossOrigin
	@GetMapping("/login")
	public ResponseEntity<String> registerUser(@RequestBody SignInDTO signInDTO) {
		signInService.signIn(signInDTO);
		return new ResponseEntity<>("created", HttpStatus.CREATED);
	}

}
