package com.training.Assignment;

public class Sphere extends Circle implements Volume{
	Sphere(){
	}
	
	Sphere(String name,double radius){
		
		this.name=name;
		this.radius=radius;
	}
	@Override
	public double getvolume() {
		// TODO Auto-generated method stub
		double s;
		s=(4/3)*Math.PI*(radius*radius);
		return s;
	}
}
