package com.training.CG;

public class ObjectPassDemo {
	int a,b;
	ObjectPassDemo(int i,int j){
		this.a=i;
		this.b=j;
	}
	boolean equalTo(ObjectPassDemo o) {
		return(o.a==a&&o.b==b);
		
	}

}
