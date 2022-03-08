package com.training.CG;

public class StaticExample {
public void StaticExample(){
	System.out.println("Inside Constructor");
}
static {
	System.out.println("Inside static block1 ");
}
static void method1() {
	System.out.println("Inside method1");
}
static {
	System.out.println("Inside static block2");
}
}
