package JavaBasics;
import java.util.Scanner;
public class ExceptionHandling {

	public static void main(String[] args) {
		int a, b;
		int [] arr = {10,20,30,40};
		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
		b = sc.nextInt();
		try {
			int result = a/b;
			System.out.println(result);
			System.out.println(arr[4]);
			}
		catch(ArithmeticException d) {
			System.out.println("Caught error: " + d.getMessage());
		}
		catch(ArrayIndexOutOfBoundsException c) 
		{
			System.out.println("Caught error: " + c.getMessage());
			
		}			
		catch(Exception e) {
			System.out.println("Caught error: " + e.getMessage());
		}

		finally{
			System.out.println("Final block executed");
			sc.close();
		}
		
		

	}

}
