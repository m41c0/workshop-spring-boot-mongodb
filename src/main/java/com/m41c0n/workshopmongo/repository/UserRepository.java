package com.m41c0n.workshopmongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.m41c0n.workshopmongo.domain.User;

@Repository
public interface UserRepository extends MongoRepository<User, String>{

}
