package com.MicroService.UserService.Model;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Transient;

@Entity
@Table(name = "User")

public class User {
	@Id
	@Column(name = "id")
	private String userId;
	@Column(name = "name")
	private String name;
	@Column(name = "city")
	private String city;
	@Transient
	private List<Technology> Technology = new ArrayList<>();
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public List<Technology> getTechnology() {
		return Technology;
	}
	public void setTechnology(List<Technology> technology) {
		Technology = technology;
	}
	@Override
	public String toString() {
		return "User [userId=" + userId + ", name=" + name + ", city=" + city + ", Technology=" + Technology + "]";
	}

}
