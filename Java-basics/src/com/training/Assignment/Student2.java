package com.training.Assignment;

//class RangeException extends Exception {
	//public RangeException(String s) {
		//super(s);
	//}

//}
public class Student2 {
	private static String percentage;

	public static void main(String args[]) {
		try {
			String s=args[0];
			int sum=0;
			for(int i=1;i<7;i++) {
				int a=Integer.parseInt(args[i]);
				if(a<0||a>51) {
					throw  new RangeException( "Marks not in range");
					
				}
				else {
					sum+=a;
				}
			}
			double res=sum/6;
			System.out.println(s+":\n Total marks:"+sum+" \n percentage:"+res*100);
		}
		catch(RangeException e) {
			System.out.println("Caught");
			System.out.println(e.getMessage());
		}
	}

}
