package com.training.Assignment;
public class Student {
	public void Calculate(String name,int[] marks) throws RangeException{
		float avg=0;
		for(int i=0;i<6;i++) {
			if(marks[i]>50||marks[i]<0)
				throw new RangeException();
			else {
				avg+=marks[i];
			}
		}
		System.out.println("Total Marks:"+avg);
		System.out.println("Percentage:"+avg/6);
	}
	public static void main(String args[]) {
		String name=args[0];
		int[]marks=new int[6];
		for(int i=0;i<6;i++) {
			marks[i]=Integer.parseInt(args[i+1]);
		}
		Student s=new Student();
		try {
			s.Calculate(name, marks);
		}
		catch(RangeException e) {
			e.printStackTrace();
		}
	}
}
