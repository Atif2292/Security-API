package com.quicky.security.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.quicky.security.entity.SignInEntity;

@Repository
public interface SignInRepo extends CrudRepository<SignInEntity, Long> {

}
