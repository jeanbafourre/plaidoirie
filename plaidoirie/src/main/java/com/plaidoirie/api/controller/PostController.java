package com.plaidoirie.api.controller;

// import org.hibernate.mapping.List;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.plaidoirie.api.model.Post;

import com.plaidoirie.api.repository.PostRepository;

@CrossOrigin("http://localhost:4200")
@RestController
@RequestMapping("/plaidoirie")
public class PostController {
	
	// Injection de dépendances issues de Repository dans le controller (pour faire le lien entre controller & Repository)
	@Autowired
	// Déclaration du postRepo
	private PostRepository postRepo;
	
	
	PostController(PostRepository postRepo){
		this.postRepo = postRepo;
	}
	
	// obtenir tous les posts
	@CrossOrigin
	@GetMapping("/all")
	public List<Post> getPosts() {
		return postRepo.findAll();
	}
}
