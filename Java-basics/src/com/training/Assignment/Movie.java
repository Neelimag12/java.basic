package com.training.Assignment;

import java.util.Scanner;

public class Movie{


	public static void main(String[] args) {
	        BookMyShow ob = new BookMyShow();

	        BookMyShow[] moviename = new BookMyShow[2];
	        moviename[0] = ob;
	        thea a=new thea();
	        moviename[1] =a;

	        System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\n");
	        System.out.println("---------1.list of movies and their prices--------- \n-------2.acces and book tickets through theaters---");

	        System.out.println("\n@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
	        Scanner d = new Scanner(System.in);
	        int h = d.nextInt();
	        switch (h) {
	            case 1: { 
	                ob.movies();
	                break;
	            }
	            case 2: {
	             
	               a.th();
	            }
	        }

	    }

	}


