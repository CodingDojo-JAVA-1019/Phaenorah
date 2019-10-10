package com.codingdojo.web.models;

public class Player {
	private String first_name;
	private String last_name; 
	private int age;
	
	public Player() {		
	}
	public Player(String first_name, String last_name, int age) {
		this.first_name = first_name;
		this.last_name = last_name; 
		this.age = age;
	}
	public String getFirstName() {
		return first_name;
	}
	public void setFirstName(String first_name) {
		this.first_name = first_name;
	}
	public String getLastName() {
		return last_name;
	}
	public void setlastName(String last_name) {
		this.last_name = last_name;
	}
	public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

}
