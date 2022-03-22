package com.training.CG;

import java.util.HashMap;
import java.util.Scanner;

public class EmployeeDemo {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter CTC:");
		double ctc=sc.nextDouble();
		Employee1 emp=new Employee1(ctc);
		HashMap values=emp.calculate();
		System.out.println("CTC:"+values.get("CTC"));
		System.out.println("Basic salary:"+values.get("Basic salary"));
		System.out.println("PF amount:"+values.get("PF amount"));
		
	}

}
