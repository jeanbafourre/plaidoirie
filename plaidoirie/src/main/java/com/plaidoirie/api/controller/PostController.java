package com.plaidoirie.api.controller;

import org.hibernate.mapping.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.plaidoirie.api.repository.PostRepository;

@CrossOrigin("http://localhost:4200")
@RestController
@RequestMapping("/plaidoirie/post")
public class PostController {
	
	// Déclaration du repository
	@Autowired
	private PostRepository postRepo;
	
	// obtenir tous les posts
	@CrossOrigin
	@GetMapping("/all")
	public List<Post> getPosts() {
		return postRepo.findAll();
	}
}
