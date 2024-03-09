package com.quicky.security.service;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.quicky.security.dto.SignInDTO;
import com.quicky.security.entity.SignInEntity;
import com.quicky.security.repo.SignInRepo;

@Service
public class SignInService {

	@Autowired
	public SignInRepo signInRepo;

	@Autowired
	public ModelMapper modelMapper;

	public boolean signIn(SignInDTO signInDTO) {
//		SignInEntity signInEntity = modelMapper.map(signInDTO, SignInEntity.class);
//		signInRepo.save(signInEntity);
		return true;

	}

}
