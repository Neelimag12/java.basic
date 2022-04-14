package com.assignment.bean;

public class Water extends Animal{
	private String inhabitant;

public Water(String name, String species, boolean endenger, String inhabitant) {
	super(name, species, endenger);
	this.inhabitant = inhabitant;
}

public String getInhabitant() {
	return inhabitant;
}

public void setInhabitant(String inhabitant) {
	this.inhabitant = inhabitant;
}

public String getDetails() {
	return this.getName()+" "+this.getSpecies();
}

@Override
public String toString() {
	return "WaterAnimal [inhabitant=" + inhabitant + ", getName()=" + getName() + ", getSpecies()=" + getSpecies()
			+ ", isEndenger()=" + isEndenger() + ", toString()=" + super.toString() + "]";
}






}
