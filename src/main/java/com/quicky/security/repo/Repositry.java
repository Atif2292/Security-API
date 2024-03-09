package com.quicky.security.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.quicky.security.entity.SignUpEntity;

@Repository
public interface Repositry extends CrudRepository<SignUpEntity,Long> {
	
	

}
