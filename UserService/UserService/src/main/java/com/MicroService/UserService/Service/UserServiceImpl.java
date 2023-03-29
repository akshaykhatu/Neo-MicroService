package com.MicroService.UserService.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.MicroService.UserService.Model.Technology;
import com.MicroService.UserService.Model.User;
import com.MicroService.UserService.Repo.UserRepo;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	UserRepo userRepo;

	@Autowired
	private RestTemplate restTemplate;

	private Logger logger = LoggerFactory.getLogger(UserService.class);;

	@Override
	public User saveUser(User user) {
		user.setUserId(UUID.randomUUID().toString());
		return userRepo.save(user);
	}

	@Override
	public List<User> getAllUsers() {
		List<User> userList = userRepo.findAll();
		/*
		 * Technology tech = new Technology(); User u = new User(); ObjectMapper mapper
		 * = new ObjectMapper(); List<Technology> jsonObject =
		 * restTemplate.getForObject("http://localhost:8083/technology",ArrayList.class)
		 * ; List<Technology> technologyList1 = new ArrayList<>();
		 * System.out.println("jsonObject ="+jsonObject); //
		 * System.out.println("jsonObject string="+jsonObject.toString());
		 * //System.out.println("jsonObject string class="+jsonObject.getClass().
		 * toString()); try { Technology obj = (Technology)
		 * mapper.readValue("http://localhost:8083/technology", Technology.class); }
		 * catch (JsonMappingException e) { // TODO Auto-generated catch block
		 * e.printStackTrace(); } catch (JsonProcessingException e) { // TODO
		 * Auto-generated catch block e.printStackTrace(); }
		 * 
		 * System.out.println("Techn0="+technologyList1.toString());
		 * //mapper.readValue(jsonObject, null);
		 * 
		 * 
		 * for (int i = 0; i < userList.size(); i++) { for (int j = 0; j <
		 * technologyList.size(); j++) {
		 * 
		 * if (userList.get(i).getUserId().toString().equals(technologyList1.get(j).
		 * getUserId().toString())) { Technology tech = new Technology();
		 * tech.setId(technologyList.get(j).getId());
		 * tech.setTechnology(technologyList.get(j).getTechnology());
		 * tech.setUserId(technologyList.get(j).getUserId()); technologyList1.add(tech);
		 * u.setTechnology(technologyList1); }
		 * 
		 * // List<Technology> object = //
		 * restTemplate.getForObject("http://localhost:8083/technology/users/"+userList.
		 * get(i).getUserId()+"",ArrayList.class);
		 * 
		 * }
		 * 
		 * }
		 * 
		 * u.setTechnology(technologyList1); userList.add(u);
		 */

		return userList;
	}

	@Override
	public User getUser(String userId) {

		User user = userRepo.findById(userId).orElseThrow();
		List<Technology> object = restTemplate.getForObject("http://localhost:8083/technology/users/"+userId+"",
				ArrayList.class);

		user.setTechnology(object);
		return userRepo.findById(userId).orElseThrow();
	}

}
