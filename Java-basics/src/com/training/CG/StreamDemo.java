package com.training.CG;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;
public class StreamDemo {


public static void main(String args[]) {
	List<String>names=Arrays.asList("ram","gani","neelu","sowda","anu");
	//List<Integer>num=Arrays.asList(2,4,9,5,3,7);
//Stream stream=strings.stream();
//stream.filter(str-> !str.equals("")).forEach(name->System.out.println(name));
//System.out.println("Total Empty strings are:"+counter);
	//Optional<Integer>newString= stream1.reduce((a,b)->a+b);
	//newString.ifPresent(System.out::println);
	Stream<String>stream1=names.stream();
	boolean val=stream1.anyMatch(s->s.startsWith("g"));
	System.out.println(val);
}
}
