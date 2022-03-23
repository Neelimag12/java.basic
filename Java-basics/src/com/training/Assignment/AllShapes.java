package com.training.Assignment;

import java.util.Scanner;

public class AllShapes {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the side:");
		double side=sc.nextDouble();
		System.out.println("Enter the radius:");
		double radius=sc.nextDouble();

		System.out.println("Enter the height:");
		double height=sc.nextDouble();
		
		Circle c=new Circle("Circle",radius);
		double cl=c.getarea();
		System.out.println("Area of Circle is:"+cl);
		
		Square s=new Square("Square",side);
		double sq=s.getarea();
		System.out.println("Area of Square is:"+sq);

		Cylinder cy=new Cylinder("Cylinder",radius,height);
		double cy1=cy.getarea();
		System.out.println("Volume of Cylinder is:"+cy1);

		Sphere sp=new Sphere("Sphere",radius);
		double sp1=sp.getarea();
		System.out.println("Volume of Sphere is:"+sp1);
		
		Cube cb=new Cube("Cube",side);
		double cbl=cb.getarea();
		System.out.println("Volume of Cube is:"+cbl);

		Glome g=new Glome("Glome",radius);
		double gl=c.getarea();
		System.out.println("Volume of Glome is:"+gl);



	}

}
