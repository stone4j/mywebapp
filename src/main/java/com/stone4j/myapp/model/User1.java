package com.stone4j.myapp.model;

public class User1 {
	private String id;
	private String nick_name;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getNick_name() {
		return nick_name;
	}
	public void setNick_name(String nick_name) {
		this.nick_name = nick_name;
	}
	@Override
	public String toString() {
		return "User1 [id=" + id + ", nick_name=" + nick_name + "]";
	}
	

}
