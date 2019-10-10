package com.codingdojo.web.models;

public class Cat extends Animal implements Pet{
	
	public Cat(String name, String breed, Double weight) {
		super(name, breed, weight);
	}	
	public String showAffection() {
		return this.getName() + " love in her eyes";
	}	

}
