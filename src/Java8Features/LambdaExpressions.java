package Java8Features;

import java.util.*;

interface Math {
	int operate(int a, int b);
	
}
public class LambdaExpressions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Math add = (a,b)->a+b;
		System.out.println(add.operate(23, 56));
		Math sub = (a,b)->a-b;
		System.out.println(sub.operate(23, 56));
		List<String> names = Arrays.asList("banana","apple","cabbage");
		
		names.sort((s1,s2)->s1.compareTo(s2));
		System.out.println(names);
		names.forEach(Product::testStatic);
		

	}

}
