package com.training.CG;

import java.util.Scanner;

public class BoxDemo {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
			int l=sc.nextInt();
			int b=sc.nextInt();

			int h=sc.nextInt();
			Box b1=new Box(l,b,h);
			Box b2=new Box(b1);
			System.out.println("Volume:"+b2.volume());
		}

	}


