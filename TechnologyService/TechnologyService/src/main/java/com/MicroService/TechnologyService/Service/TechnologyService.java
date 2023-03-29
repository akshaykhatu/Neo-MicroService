package com.MicroService.TechnologyService.Service;

import java.util.List;

import com.MicroService.TechnologyService.Model.Technology;

public interface TechnologyService {
	Technology saveTechnology(Technology user);

	List<Technology> getAllTechnology();

	Technology getTechnology(String userId);
	
	List<Technology> findByUserId(String userId);
}
