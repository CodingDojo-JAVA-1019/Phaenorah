package com.codingdojo.web.models;

public class Dog extends Animal implements Pet{
	
	public Dog(String name, String breed, Double weight) {
		super(name, breed, weight);
	}
	
	public String showAffection() {
		if(this.getWeight() < 30) {
			return this.getName() + " hops on your lap";
		}else {
			return this.getName() + " curls up next to you";
		}		
	}
}
