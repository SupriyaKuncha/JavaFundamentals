package MultithreadingSer;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializationApp {
	
	public static void main (String [] args) {
		Person objP = new Person("Supriya", 1234);
		
		//file IO exception
		try {
			FileOutputStream file = new FileOutputStream("person.ser");
			ObjectOutputStream out = new ObjectOutputStream(file);
			
			out.writeObject(objP);
			out.close();
			file.close();
		}catch(IOException e) {
			System.out.println("Exception caught: " + e.getMessage());
			
		}
		System.out.println("Object is serialized");
		
		
	}

}
