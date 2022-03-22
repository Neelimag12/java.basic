package com.training.CG;
import java.util.Comparator;
public  class Comparator1 implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {
		// TODO Auto-generated method stub
		if(o1.getGrade()>o2.getGrade()) {
		return 1;
		}
		return -1;
	}
}
	