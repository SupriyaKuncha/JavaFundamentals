package JavaBasics;
import java.util.Scanner;
public class pyramid {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int i,j;
		for(i=0;i<n;i++) {
			//space
			for(j=0;j<n;j++) {
				System.out.print(" ");
			}
			//star
			for(j=i;j>0;j--) {
				System.out.print("* ");
			}
			
			//space
			for(j=0;j<n;j++) {
				System.out.print(" ");
			}
			
			System.out.println();
		}

	}

}
