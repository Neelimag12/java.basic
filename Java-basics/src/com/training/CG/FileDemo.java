package com.training.CG;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileDemo {

	private static String file;

	public static void main(String args[]) throws IOException {
		char[]arr=new char[25];
		File file=new File("C:\\Users\\Neelima\\Desktop\\java\\javatest.txt");
		//FileReader input=null;
		BufferedWriter output=null;
		BufferedReader br=null;
		try {
		//input=new FileReader("C:\\Users\\Neelima\\Desktop\\java\\javatest.txt");
		FileWriter fw=new FileWriter(file);
		
		 output = new BufferedWriter(fw);
		
		output.write("This input is from the java code");

		//BufferedReader br=new BufferedReader(new FileReader(file));
		//br.lines().forEach(System.out::println);
		//input.read(arr);
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		finally {
			br.close();
		}
	}
}

		//System.out.println("File is Reading....");
	//	System.out.println(arr);
		//if(val) {
			//System.out.println("File created successfully..");
		//}
		//else {
			//System.out.println("File creation failed...");
		
	


