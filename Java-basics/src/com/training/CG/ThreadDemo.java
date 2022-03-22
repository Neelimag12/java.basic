package com.training.CG;

public class ThreadDemo {
	private static NewThread t1;

	public static void main (String args[]) {
		//MyThread t1=new MyThread("thread1");
	//	t1.go();
		NewThread t1=new NewThread("thread-1");
		t1.go();
	}

}
