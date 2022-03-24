package com.training.Assignment;

import java.util.Scanner;

public class thea extends BookMyShow{
	
		private int no_of_tickets;
		    void th() {
		        System.out.println("**the theaters available are** \n 1.karunya th \n 2.anna th");
		        int k;
		        int an;
		        Scanner sc = new Scanner(System.in);
		        int n = sc.nextInt();
		        if (n == 1) {
		            System.out.println("**karunya theater**");
		            System.out.println("**select a movie**");
		            System.out.println("movie available are \n 1.BheemlaNayak\n 2.RRR ");
		            Scanner a = new Scanner(System.in);
		            int o = a.nextInt();
		            if (o == 1) {
		                System.out.println("BheemlaNayak movie @ kaurnya theater");
		                System.out.println("enter the number of tickets to be booked");
		                Scanner j = new Scanner(System.in);
		                int r = j.nextInt();
		                int left= no_of_tickets-r;
		                int amount=40*r;
		                System.out.println("to continue to book for this movie prees 1");
		                Scanner d = new Scanner(System.in);
		                int h = d.nextInt();
		                System.out.println("\n\n\n");
		                if (h == 1) {
		                    System.out.println("******************");
		                    System.out.println("theater ------------------- karunya theater");
		                    System.out.println("movie --------------------- shreak");
		                    System.out.println("cost ---------------------- Rs."+amount);
		                    System.out.println("******************");
		                }

		            }
		            if (o == 2) {
		                System.out.println("RRR @karunya theater");
		                 System.out.println("enter the number of tickets to be booked");
		                Scanner j = new Scanner(System.in);
		                int r = j.nextInt();
		                int left= no_of_tickets-r;
		                int amount=50*r;
		                System.out.println("to continue to book for this movie prees 1");
		                Scanner d = new Scanner(System.in);
		                int h = d.nextInt();
		                System.out.println("\n\n\n");
		                if (h == 1) {
		                    System.out.println("******************");
		                    System.out.println("theater ------------------- karunya theater");
		                    System.out.println("movie --------------------- staurt little");
		                    System.out.println("cost ---------------------- Rs"+amount);
		                    System.out.println("******************");
		                }

		            }
	}
		    
	        if (n == 2) {
	            System.out.println("**anna theater**");
	            System.out.println("**select a movie**");
	            System.out.println("movie available are \n 3.Evil Dead movie \n 4.Jurassic World movie");
	            Scanner b = new Scanner(System.in);
	            int p = b.nextInt();
	            Scanner a = new Scanner(System.in);
	            int o = a.nextInt();
	            if (o == 3) {
	                System.out.println("Evil Dead movie @ anna theater");
	                 System.out.println("enter the number of tickets to be booked");
	                Scanner j = new Scanner(System.in);
	                int r = j.nextInt();
	                int left= no_of_tickets-r;
	                int amount=60*r;
	                System.out.println("to continue to book for this movie prees 1");
	                Scanner d = new Scanner(System.in);
	                int h = d.nextInt();
	                System.out.println("\n\n\n");
	                if (h == 1) {
	                    System.out.println("******************");
	                    System.out.println("theater ------------------- anna theater");
	                    System.out.println("movie --------------------- game movie");
	                    System.out.println("cost ---------------------- Rs."+amount);
	                    System.out.println("******************");
	                }

	            }
	            if (o == 4) {
	                System.out.println("Jurassic World @anna theater");
	                 System.out.println("enter the number of tickets to be booked");
	                Scanner j = new Scanner(System.in);
	                int r = j.nextInt();
	                int left= no_of_tickets-r;
	                int amount=70*r;
	                System.out.println("to continue to book for this movie prees 1");
	                Scanner d = new Scanner(System.in);
	                int h = d.nextInt();
	                System.out.println("\n\n\n");
	                if (h == 1) {
	                    System.out.println("******************");
	                    System.out.println("theater ------------------- anna theater");
	                    System.out.println("movie --------------------- fun movie");
	                    System.out.println("cost ---------------------- Rs."+amount);
	                    System.out.println("******************");
	                }

	            }
	        }

	    

		    }
	
}
