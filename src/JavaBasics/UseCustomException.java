package JavaBasics;
import java.io.IOException;
import java.io.FileReader;
class InvalidAgeException extends Exception {
	
	public InvalidAgeException(String message) {
		super(message);
	}
}

//Use

class UseCustomException {
	
	static void validateAge(int age) throws InvalidAgeException{
		if (age < 18) {
			throw new InvalidAgeException("Age must be greater than 18 o open a Bank Account");
		}
		else {
			System.out.println("Valid Age. Account can be opened.");
		}
	}
	
	public static void main(String[] args) {
		
		try {
			validateAge(22);
		}
		catch (InvalidAgeException e) {
			System.out.println("Exception Caught : "+e.getMessage());
		}
		
	}
}
