package com.training.Assignment;

public class Cube extends Square implements Volume{

	Cube(String name,double side){
		
		this.name=name;
		this.side=side;
	}
	@Override
	public double getvolume() {
		// TODO Auto-generated method stub
		double s;
		s=side*side*side;
		return s;
	}
}
