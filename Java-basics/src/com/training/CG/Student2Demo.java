package com.training.CG;

public class Student2Demo {
	public static void main(String args[]) {
		Student2 s1=new Student2(100,22);
		Student2 s2=new Student2(100,22);

		Student2 s3=new Student2(-1,-1);
		System.out.println("s1==s2:"+s1.equalTo(s2));
		System.out.println("s1==s3:"+s1.equalTo(s3));
	}

}
