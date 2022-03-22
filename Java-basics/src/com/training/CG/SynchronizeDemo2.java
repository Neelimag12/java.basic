package com.training.CG;

public class SynchronizeDemo2 extends Thread{
	public static Object Lock1=new Object();
	public static Object Lock2=new Object();
	public void run() {
		synchronized(Lock2) {
			System.out.println("Thread1: holding lock 2..");
			try {
				Thread.sleep(2000);
			}
			catch(InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("Thread1:waiting for lock2..");
			synchronized(Lock2) {
				System.out.println("Thread1:holding lock 1 and lock 2");
			}
		}

		
	}
	}


