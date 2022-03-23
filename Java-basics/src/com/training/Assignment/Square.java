package com.training.Assignment;

public class Square extends Shape implements Area {
	public double side;
	
	Square(){
		
	}
	Square(String name,double side){
		this.name=name;
		this.side=side;
	}
	public double getarea() {
		// TODO Auto-generated method stub
		double s;
		s=side*side;
		return s;
	}
}
