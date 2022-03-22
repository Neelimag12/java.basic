package com.training.CG;

import java.util.Scanner;
import java.util.Random;5

public class Firstcode {

public static void main(String[] args) {
	int answer,guess;
	final int MAX=10;
	int count=1;
	Scanner in=new Scanner(System.in);
	Random rand=new Random();
	boolean correct=false;
	answer=rand.nextInt(MAX)+1;
	for(int count=1;count<=10;count++) {
		System.out.println("Guess your lucky number between 1 to 10");
		guess=in.nextInt();
		if(guess>answer) {
			System.out.println("Not Really!!try again");
		}
			else {
				System.out.println("Congrats!! you guessed it right);
				correct=true;
		
			}
		}
System.exit(0);
}
}
