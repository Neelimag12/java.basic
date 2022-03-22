package com.training.CG;
import java.util.List;
import java.util.Arrays;
import java.util.stream.Stream;
public class StreamDemo1 {


public static void main(String args[]) {
	List<Integer>num=Arrays.asList(1,3,2,5,4,8,13);
	Stream<Integer>stream=num.stream();
	Stream<Integer>stream1=num.stream();
           stream.filter(odd->odd%2!=0)
               .forEach(val->System.out.println(val));
        stream1.map(i->i*i).forEach(data->System.out.println(data));
System.out.println("------");
for(int a:num) {
	System.out.println(a);
}
}
}
