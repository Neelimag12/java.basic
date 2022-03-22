package com.training.CG;

import java.util.function.Predicate;

public class LambdaDemo2 {
public static void main(String args[]) {
	//DemoInterface1 d=(a)->{
		//for(int i=0;i<a.length;i++) {
		//	System.out.println("num is:"+a[i]);
		//}
//	};
	//int num[]= {2,5,4,7};
	//d.show(num);
	Predicate<Integer>p=(b)->{
		if(b>5) {
			return true;
		}
		else {
		return false;
		}
	};
	boolean pass=p.test(4);
	System.out.println(pass);
	
}
}
