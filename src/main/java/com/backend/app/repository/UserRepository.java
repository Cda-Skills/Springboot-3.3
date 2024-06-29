package com.backend.app.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.backend.app.model.User;

@Repository
public interface UserRepository extends CrudRepository<User, Integer>{

}
