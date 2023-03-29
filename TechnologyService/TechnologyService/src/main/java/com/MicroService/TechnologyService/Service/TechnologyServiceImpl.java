package com.MicroService.TechnologyService.Service;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.MicroService.TechnologyService.Model.Technology;
import com.MicroService.TechnologyService.Repo.TechnologyRepo;
@Service
public class TechnologyServiceImpl implements TechnologyService{

	@Autowired
	TechnologyRepo repo;
	
	@Override
	public Technology saveTechnology(Technology user) {
		// TODO Auto-generated method stub
		user.setTechnologyId(UUID.randomUUID().toString());
		return repo.save(user);
	}

	@Override
	public List<Technology> getAllTechnology() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	@Override
	public Technology getTechnology(String userId) {
		// TODO Auto-generated method stub
		return repo.getById(userId);
	}

	@Override
	public List<Technology> findByUserId(String userId) {
		// TODO Auto-generated method stub
		return repo.findByUserId(userId);
	}

}
