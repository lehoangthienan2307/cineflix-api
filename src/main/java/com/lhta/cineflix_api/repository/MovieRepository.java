package com.lhta.cineflix_api.repository;

import java.util.List;
import java.util.Map;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.lhta.cineflix_api.entity.Movie;



@Repository
public interface MovieRepository extends JpaRepository<Movie, Long> {
	List<Movie> findAll();
	
	@Query(value = "call GetAllPhimWithId(:id)", nativeQuery = true)
	List<Map<String, ?>> GetAllPhimWithId(@Param("id") Integer id);
	
	@Query(value = "call getAllMovieAndCategory()", nativeQuery = true)
	List<Map<String, ?>> getAllMovieAndCategory();
}
