package com.quicky.security.service;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.quicky.security.dto.SignUpDTO;
import com.quicky.security.entity.SignUpEntity;
import com.quicky.security.repo.Repositry;

@Service
public class SignUpService {

	@Autowired
	public Repositry signUpRepo;

	@Autowired
	public ModelMapper modelMapper;

	public boolean signUp(SignUpDTO signUpDTO) {
		SignUpEntity signUpEntity = modelMapper.map(signUpDTO, SignUpEntity.class);
		signUpRepo.save(signUpEntity);
		return true;

	}
}
