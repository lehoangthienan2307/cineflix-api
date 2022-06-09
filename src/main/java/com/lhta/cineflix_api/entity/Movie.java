package com.lhta.cineflix_api.entity;


import java.util.Date;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;



@Entity(name = "phim")
public class Movie {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@ManyToOne
	@JoinColumn(name = "id_quocgia")
	private Country country;
	
	@OneToMany(mappedBy = "movie")
	private Set<CategoryMovie> movieListCategoryMovie;
	
	@OneToOne(mappedBy = "movieDetailMovie")
	private MovieDetail movieDetail;
	
    @Column(name = "ten_phim")
	private String movieName;
    @Column(name = "hinh_anh")
	private String movieImage;
    @Column(name = "ngay_tao")
	private Date movieCreatedDate;
    @Column(name = "mo_ta")
	private String movieDsc;
	public Long getId() {
		return id;
	}

	/*
	 * public void setId(int id) { this.id = id; }
	 */
	public Country getCountry() {
		return country;
	}
	public void setCountry(Country country) {
		this.country = country;
	}
	public String getMovieName() {
		return movieName;
	}
	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}
	public String getMovieImage() {
		return movieImage;
	}
	public void setMovieImage(String movieImage) {
		this.movieImage = movieImage;
	}
	public Date getMovieCreatedDate() {
		return movieCreatedDate;
	}
	public void setMovieCreatedDate(Date movieCreatedDate) {
		this.movieCreatedDate = movieCreatedDate;
	}
	public String getMovieDsc() {
		return movieDsc;
	}
	public void setMovieDsc(String movieDsc) {
		this.movieDsc = movieDsc;
	}
    
    
}
