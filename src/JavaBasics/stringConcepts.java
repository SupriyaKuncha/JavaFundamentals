package JavaBasics;
import java.util.Scanner;
public class stringConcepts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		String pwd = "Admin123";
//		Scanner sc = new Scanner(System.in);
//		String password = sc.next();
//		if(pwd.equals(password)) {
//			System.out.println("Logged In");
//		}else {
//			System.out.println("Invalid");
//		}
//sc.close();

//String email ="abc@gmail.com";
//if(email.contains("@") && email.endsWith(".com")){
//		System.out.println("Valid Email");
//	} else{
//		System.out.println("Invalid Email");
//	}
//replace() -->text filtering
 	String message ="Java is function oriented language";
//replace function oriented to object oriented
 	String newMessage = message.replace("function", "Object");
 	System.out.println(newMessage);
 	
  //String buffer
 	StringBuffer str = new StringBuffer("Java"); // FSD training is added to original location
	System.out.println(str);
	
	// add some new content -> append() -> combine at end of the string
	str.append("FSD Training");
	System.out.println(str);
	
	//insert at some particular location -> insert()
	str.insert(8, "Day2 ");
	System.out.println(str);
	
	//replace ->
	str.replace(8, 11,"Genpact");
	System.out.println(str);
	
	// delete part of string -> starts with index and deleted till index 1 less than end index
	str.delete(4, 7);
	System.out.println(str);
	
	// reverse()
	str.reverse();
	System.out.println(str);
	//string builder
	StringBuilder sb = new StringBuilder("Strings");
	System.out.println("I am learning: " + sb);
	sb.append(" append");
	System.out.println("This is : " + sb);
	sb.insert(8, "Day2 ");
	System.out.println(sb);
	sb.replace(8, 11,"Genpact");
	System.out.println(sb);
	sb.delete(4, 7);
	System.out.println(sb);
 	
	}

}
