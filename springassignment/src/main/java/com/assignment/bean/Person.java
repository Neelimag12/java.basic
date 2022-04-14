package com.assignment.bean;

import org.springframework.beans.factory.annotation.Autowired;

public class Person {
	private String name;
	private int age;
	@Autowired
	private Land pet;
	
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
		
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
	public Land getPet() {
		return pet;
	}
	public void setPet(Land pet) {
		this.pet = pet;
	}
	
	public String getAnimalSetails() {
		return this.pet.getDetails();
	}
	
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", pet=" + pet + "]";
	}
	
	
	


}
