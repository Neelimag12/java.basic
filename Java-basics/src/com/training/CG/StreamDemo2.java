package com.training.CG;

import java.util.List;
import java.util.Arrays;
import java.util.stream.Stream;
public class StreamDemo2 {
public static void main(String args[]) {
	List<Integer>num=Arrays.asList(5,3,8,1,9,7);
	Stream<Integer>stream=num.stream();
	Stream<Integer>stream1=num.stream();
	stream1.sorted().forEach(System.out::println);
}
}
