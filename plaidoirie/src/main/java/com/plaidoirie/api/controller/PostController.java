package com.plaidoirie.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin("http://localhost:4200")
@RestController
@RequestMapping
public class PostController {
	
	// Déclaration du repository
	@Autowired
	private PostRepository postRepo;
	@Autowired
	private 
}
