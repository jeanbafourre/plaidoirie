package com.plaidoirie.api.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table (name="justiciable")
public class Justiciable extends User {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;

	@OneToMany(mappedBy = "justiciable")
	private List<Post> posts;
	
	@OneToMany(mappedBy = "justiciable")
	private List<Post> pieces;
	
	@OneToMany(mappedBy = "justiciable")
	private List<Dossier> dossiers;
	
	public Justiciable() {}

	
	public Justiciable(Long idJusticiable) {
		this.id = idJusticiable;
	}


	public Long getId() {
		return id;
	}

	public void setId(Long idJusticiable) {
		this.id = idJusticiable;
	}
	
	public List<Post> getPosts() {
		return posts;
	}


	public void setPosts(List<Post> posts) {
		this.posts = posts;
	}


	public List<Post> getPieces() {
		return pieces;
	}


	public void setPieces(List<Post> pieces) {
		this.pieces = pieces;
	}


	public List<Dossier> getDossiers() {
		return dossiers;
	}


	public void setDossiers(List<Dossier> dossiers) {
		this.dossiers = dossiers;
	}

}
