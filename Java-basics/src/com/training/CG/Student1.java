package com.training.CG;
import java.util.*;
import java.util.Collections;
public class Student1 {
	public static void main(String args[]) {
		Student stud1=new Student("Ananya","1A51","VZM");
		Student stud2=new Student("Bhavana","1A52","KVR");
		Student stud3=new Student("Sowdamini","1A53","SKLM");
		Student stud4=new Student("Ester","1A54","PVP");
		Student stud5=new Student("John","1A55","VKP");
		
		stud1.setGrade(72);
		stud2.setGrade(58);
		stud3.setGrade(92);
		stud4.setGrade(64);
		stud5.setGrade(83);
		
		List<Student>allStudents=new LinkedList<Student>();
		allStudents.add(stud1);
		allStudents.add(stud2);
		allStudents.add(stud3);
		allStudents.add(stud4);
		allStudents.add(stud5);
		Collections.sort(allStudents,new Comparator1());
		for(Student s:allStudents) {
			System.out.println("Student Name :"+s.studName);
			System.out.println("Student Id :"+s.studId);
			System.out.println("Student Address :"+s.studAddress);
			System.out.println("Grade :"+s.getGrade());

	}
	}
}
