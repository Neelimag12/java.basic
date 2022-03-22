package com.training.CG;

public class StringDemo6 {
	public static void main (String args[]) {
		StringBuffer sb=new StringBuffer("ObjectorientedProgramming");
		System.out.println(sb.append("java"));

		System.out.println(sb.insert(1,"java"));
		System.out.println(sb.insert(1,"java"));
		System.out.println(sb.replace(1,3,"java"));
		System.out.println(sb.delete(1,3));
		System.out.println(sb.reverse());
		System.out.println(sb.capacity());
		System.out.println(sb.indexOf("a"));
		System.out.println(sb.indexOf("a",2));
		System.out.println(sb.charAt(3));
		
		StringBuilder sb1=new StringBuilder("ObjectorientedProgramming");
		System.out.println(sb1.append("java"));

		System.out.println(sb1.insert(1,"java"));
		System.out.println(sb1.insert(1,"java"));
		System.out.println(sb1.replace(1,3,"java"));
		System.out.println(sb1.delete(1,3));
		System.out.println(sb1.reverse());
		System.out.println(sb1.capacity());
		System.out.println(sb1.indexOf("a"));
		System.out.println(sb1.indexOf("a",2));
		System.out.println(sb1.charAt(3));

	}

}
