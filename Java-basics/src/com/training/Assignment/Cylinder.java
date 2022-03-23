package com.training.Assignment;

public class Cylinder extends Circle implements Volume{
	public double height;
	private double radius;
	Cylinder(String name,double radius,double height){
		
		this.name=name;
		this.radius=radius;
		this.height=height;
	}
	@Override
	public double getvolume() {
		// TODO Auto-generated method stub
		double s;
		s=Math.PI*(radius*radius)*height;
		return s;
	}
}
