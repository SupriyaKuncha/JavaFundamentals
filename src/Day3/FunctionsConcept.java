package Day3;
import java.util.Scanner;
public class FunctionsConcept {
	
	//function adding two numbers
	public static int addNumbers(int a, int b) {
		int sum=0;
		sum = a+b;
		return sum;
	}
	//function to check even or odd
	public static int isEven(int a) {
		int result = 0;
		if(a%2==0) {
			result = 1;
		}
		return result;
		
	}
	//function to greet
	public static String greeting(String name) {
		return name;
	}
	
	//function to calculate cube
	public static double cubeOfNum(double a) {
		double cube = Math.pow(a, 3);
		return cube;
	}
	//function to calculate factorial
	public static int factOfNum(int number) {
		int i,fact=1;
		if(number==0) {
			return fact;
			
		}else if(number>0) {
			for(i=0;i<number;i++) {
				fact= fact*(number-i);
			}
			return fact;
		}
		else {
			return 0;
		}
	}
	
	public static void main(String[] args) {
		//ADD NUMBERS
		System.out.println(addNumbers(1,2));//call function
		//EVEN OR ODD
		if(isEven(2)==1) {
			System.out.println("Even");
		}else {
			System.out.println("Odd");
		}
		//GREETING
		System.out.println("Hello " + greeting("Supriya") + " Welcome to Java Training");
		//Cube of number
		System.out.println(cubeOfNum(3));
		//Factorial 
		System.out.println(factOfNum(5));
		

	}

}
