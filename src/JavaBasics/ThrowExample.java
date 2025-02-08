package JavaBasics;

import java.io.IOException;
import java.io.FileReader;
public class ThrowExample {
	
	
	//throw
	static void checkAge(int age) {
		if(age<18) {
			throw new ArithmeticException("Not eligible to Bank Account");
		}
		System.out.println("Eligible to create bank account");
		
		
	}
	static void readFile()  throws IOException{
		FileReader file = new FileReader("xyz.txt");
	}

	public static void main(String[] args) {
		checkAge(22);
		try {
			readFile();
		}catch(IOException e) {
			System.out.println("Error" + e.getMessage());
		}
		

	}
	

}
