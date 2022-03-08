package com.training.CG;

public class InheritanceDemo {
public static void main(String args[]) {
	Cat cat1=new Cat();
	cat1.name="doll";
	cat1.type="mammal";
	cat1.age=2;
	cat1.haircolor="brown";
	System.out.println(cat1.getInfo());
}
}
