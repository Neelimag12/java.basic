package com.training.CG;

public class LambdaDemo {

private static int[] average;

public static void main(String args[]) {
	//Addition add=new Addition();
DemoInterface d=(a) -> {
	double arr[]= {2,3,5,9,8};
	double total=0;
		for(int i=0;i<arr.length;i++) {
			total=total+arr[i];
			System.out.println("The total of array is:"+total);
		}
		double average=total/arr.length;
		System.out.println("The average is:"+average);

};

d.show(average);
}
}
