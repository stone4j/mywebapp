package com.stone4j.myapp.model;

public class User2 {

	private String id;
	private String userName;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	@Override
	public String toString() {
		return "User2 [id=" + id + ", userName=" + userName + "]";
	}
	
}
