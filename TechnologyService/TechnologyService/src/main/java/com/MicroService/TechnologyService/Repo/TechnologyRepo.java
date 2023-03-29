package com.MicroService.TechnologyService.Repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.MicroService.TechnologyService.Model.Technology;
@Repository
public interface TechnologyRepo extends JpaRepository<Technology, String> {

	
	List<Technology> findByUserId(String userId);
	
	
}
