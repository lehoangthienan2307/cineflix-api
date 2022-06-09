package com.lhta.cineflix_api.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity(name = "chitietphim")
public class MovieDetail {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "tap")
	private String episode;
	
	@Column(name = "link_phim")
	private String linkMovie;
	
	@OneToOne
	@JoinColumn(name = "id_phim")
	private Movie movieDetailMovie;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getEpisode() {
		return episode;
	}

	public void setEpisode(String episode) {
		this.episode = episode;
	}

	public String getLinkMovie() {
		return linkMovie;
	}

	public void setLinkMovie(String linkMovie) {
		this.linkMovie = linkMovie;
	}

	public Movie getMovieDetailMovie() {
		return movieDetailMovie;
	}

	public void setMovieDetailMovie(Movie movieDetailMovie) {
		this.movieDetailMovie = movieDetailMovie;
	}
	
	
	
}
