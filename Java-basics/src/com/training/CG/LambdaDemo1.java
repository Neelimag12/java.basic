package com.training.CG;
import java.util.function.Consumer;
import java.util.function.Function;
public class LambdaDemo1 {
public static void main(String args[]) {
	String name="juliejohn";
	Function<String,String>function=LambdaDemo1::show;
	System.out.println(function.apply("john"));
	Supplier<Boolean>boolsupplier=()->name.length()==10;
	Supplier<Integer>intsupplier=()->name.length()-2;
	Supplier<String>supplier=()=>name.toUpperCase();
	System.out.println(boolsupplier.get());
	System.out.println(intsupplier.get());
	System.out.println(supplier.get());
Consumer<Double>consumer=i-> System.out.println(i+20.0);

}
}
