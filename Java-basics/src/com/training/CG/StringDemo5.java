package com.training.CG;

public class StringDemo5 {
	public static void main(String args[]) {
		String str1="example";
		String str2="examz";
		StringBuilder sb=new StringBuilder("hi");
		StringBuffer buffer=new StringBuffer("welcome");
		buffer.append("home");
		System.out.println(buffer);
		sb.append("hello");
		System.out.println(sb);
	}

}
