package com.training.CG;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamDemo3 {
public static void main(String args[]) {
	List<Integer>integers=Arrays.asList(2,5,24,7,8,9);
	Stream<Integer>stream=integers.stream();
	stream.filter(i->i%2==0).reduce((a,b)->a+b).ifPresent(System.out::println);
}
}
