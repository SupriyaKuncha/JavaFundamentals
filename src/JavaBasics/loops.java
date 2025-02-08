package JavaBasics;
import java.util.Scanner;
public class loops {

	public static void main(String[] args) {
		
//		int sum=0;
//		for(int i=1;i<=20;i++) {
//			if(i%2==0) {
//				sum=sum+i;
//			}	
//		}
//		System.out.println(sum);
//		//factorial
//		System.out.println("Enter the number: ");
		Scanner sc = new Scanner(System.in);
//		int number = sc.nextInt();
//		int i,fact=1;
//		if(number==0) {
//			System.out.println("1");
//			
//		}else if(number>0) {
//			for(i=0;i<number;i++) {
//				fact= fact*(number-i);
//				
//			}
//			System.out.println(fact);
//		}else {
//			System.out.println("Enter Positive number");
//		}
//		
	
	//while loops
		
	//sum of first 10 numbers
	int result=0;
	int j=1;
	while(j<=10) {
		result=result+j;
		j++;	
	}
	System.out.println(result);
	
	//sum of even numbers
	j=2;
	int evenSum=0;
	while(j<=20) {
		evenSum=evenSum+j;
		j=j+2;
	}
	System.out.println(evenSum);
	
	//factorial
	System.out.println("Enter the number: ");
	int factnumber = sc.nextInt();
	int factorial=1;
	int i=0;
	if(factnumber==0) {
		System.out.println("1");
		
	}else if(factnumber>0) {
		while(i<factnumber) {
			factorial= factorial*(factnumber-i);
			i++;
		}
		System.out.println(factorial);
	}else {
		System.out.println("Enter Positive number");
	}
	
	
	sc.close();	
	}
	

}
