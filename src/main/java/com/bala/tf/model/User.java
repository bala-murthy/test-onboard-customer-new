package com.bala.tf.model;

public class User {
	
	private String userId;
	private String name;
	private int age;

	public User(String userID) {
		this.setUserId(userID);
		this.name = "Testname";
		this.age = 20;
	}

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

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	

}
