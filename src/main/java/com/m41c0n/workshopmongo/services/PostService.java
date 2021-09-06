package com.m41c0n.workshopmongo.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.m41c0n.workshopmongo.domain.Post;
import com.m41c0n.workshopmongo.domain.User;
import com.m41c0n.workshopmongo.repository.PostRepository;
import com.m41c0n.workshopmongo.services.exception.ObjectNotFoundException;

@Service
public class PostService {

	
	@Autowired
	private PostRepository repo;
	
	public Post findById(String id) {
		Optional<Post> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado"));
	}
	

	
	
}