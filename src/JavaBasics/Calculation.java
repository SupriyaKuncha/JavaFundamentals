package JavaBasics;

public class Calculation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1=567;
		int num2=7000;
		int sum,sub,mul,divi;
		sum=num1+num2;
		sub=num1-num2;
		mul=num1*num2;
		divi=num1/num2;
		System.out.println("The addition is:" + sum);
		System.out.println("The subtraction is:" + sub);
		System.out.println("The multiplication is:" + mul);
		System.out.println("The division is:" + divi);
		int greater = (num1>num2) ? num1 : num2;
		System.out.println("Greater is " + greater);

	}

}
