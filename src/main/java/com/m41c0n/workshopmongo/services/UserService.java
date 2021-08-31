package com.m41c0n.workshopmongo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.m41c0n.workshopmongo.domain.User;
import com.m41c0n.workshopmongo.repository.UserRepository;

@Service
public class UserService {

	
	@Autowired
	private UserRepository repo;
	
		public List<User> findAll(){
			return repo.findAll();
		}
}
