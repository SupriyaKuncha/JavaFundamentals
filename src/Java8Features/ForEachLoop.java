package Java8Features;

import java.util.*;
import java.util.stream.Collectors;



public class ForEachLoop {

	public static void main(String[] args) {
		
		List<String> names = new ArrayList<>();
		names.add("Supriya");
		names.add("Alice");
		names.forEach(name->System.out.println(name));
		List<Integer> numbers = List.of(1,2,3,4,5,6,7);
		List<Integer> evenNumbers = numbers.stream()
				                            .filter(n -> n%2==0)
				                            .collect(Collectors.toList());
				                            	
		System.out.println(evenNumbers);
		List<Integer> incrementBy10 = numbers.stream()
                .map(n -> n+10)
                .collect(Collectors.toList());
		System.out.println(incrementBy10);
		
		int resultSum = numbers.stream()
							   .map(n->n*1)
							   .mapToInt(Integer::intValue)
							   .sum();
		System.out.println(resultSum);
		
		names.forEach(String :: length);
		

	}

}
