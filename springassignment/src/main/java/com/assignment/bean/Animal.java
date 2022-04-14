package com.assignment.bean;

public class Animal {
	private String name;
	private String species;
	private boolean endenger;
	
	public Animal(String name, String species, boolean endenger) {
		this.name = name;
		this.species = species;
		this.endenger = endenger;
	}
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSpecies() {
		return species;
	}

	public void setSpecies(String species) {
		this.species = species;
	}

	public boolean isEndenger() {
		return endenger;
	}

	public void setEndenger(boolean endenger) {
		this.endenger = endenger;
	}
	
	public String getDetails() {
		return this.name+" "+this.species;
	}

	@Override
	public String toString() {
		return "Animal [name=" + name + ", species=" + species + ", endenger=" + endenger + "]";
	}
	
	
	


}
