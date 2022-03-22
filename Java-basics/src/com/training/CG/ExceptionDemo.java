package com.training.CG;
import java.util.*;

public class ExceptionDemo {
public static void main(String args[]) {

	Grade grade=new Grade();
	try {
		grade.setGrade();
		System.out.println("The Grade is"+grade.getGrade());
	
	}
	catch(Exception e) {
		System.out.println("Grade value not allowed");
		System.out.println(e.getMessage());
	}
}
}
