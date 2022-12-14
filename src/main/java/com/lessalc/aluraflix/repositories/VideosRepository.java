package com.lessalc.aluraflix.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lessalc.aluraflix.entities.Videos;

@Repository
public interface VideosRepository extends JpaRepository<Videos, Long>{

	
	public List<Videos> findByTituloContainingIgnoreCase(String titulo);
}
