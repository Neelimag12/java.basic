package com.training.CG;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
		   public static void main(String[] args) { 
		      try {
		         BufferedWriter out = new BufferedWriter (new FileWriter("javatest.txt"));
		         out.write("aString1\n");
		         out.close();
		         boolean success = (new File("javatest.txt")).delete();
		         
		         if (success) {
		            System.out.println("The file has been successfully deleted"); 
		         }
		         BufferedReader in = new BufferedReader(new FileReader("javatest.txt"));
		         String str;
		         
		         while ((str = in.readLine()) != null) {
		            System.out.println(str);
		         }
		         in.close();
		      }catch (IOException e) {
		         System.out.println("exception occoured"+ e);
		         System.out.println("File does not exist or you are trying to read a file that has been deleted");
		      }
}
}
	