package com.MicroService.UserService.Model;

public class Technology {
private String id;
private String technology;
private String userId;
public String getId() {
	return id;
}
public void setId(String id) {
	this.id = id;
}
public String getTechnology() {
	return technology;
}
public void setTechnology(String technology) {
	this.technology = technology;
}
public String getUserId() {
	return userId;
}
public void setUserId(String userId) {
	this.userId = userId;
}
@Override
public String toString() {
	return "Technology [id=" + id + ", technology=" + technology + ", userId=" + userId + "]";
}


}
