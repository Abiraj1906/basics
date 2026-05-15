package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class CreatingStreams {

	
	public static void main(String[] args) {
		
		
		List<String> names=Arrays.asList("Abiraj","james","vinoth");
		names.stream().forEach(System.out::println);
		
		
		int[] arr= {1,2,3,45,6,5,8,45,15};
		IntStream array=Arrays.stream(arr);
		array.forEach(System.out::println);
		
		
		Stream<String> fruit_name=Stream.of("Apple","banana","Orange");
		fruit_name.forEach(System.out::println);
		
		
		Stream<String> single_name=Stream.generate(() -> "Hello").limit(2);
		single_name.forEach(System.out::println);
		
		
		Stream<Integer> values=Stream.iterate(5, n->n+2).limit(5);
		values.forEach(System.out::println);
	
		
		
		int[] arr1= {1,1,2,2,3,5,6,8,9,45,54,45};
		IntStream duplicate=Arrays.stream(arr1);
		
		//duplicate.distinct().forEach(System.out::println);	
		duplicate.sorted().forEach(System.out::println);
		
		
		 
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
