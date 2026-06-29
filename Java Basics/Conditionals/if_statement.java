/*Make a Calculator. Take 2 numbers (a & b) from the user and an operation as follows : 
	1 : + (Addition) a + b
2 : - (Subtraction) a - b
3 : * (Multiplication) a * b
4 : / (Division) a / b
5 : % (Modulo or remainder) a % b
Calculate the result according to the operation given and display it to the user.*/


import java.util.Scanner;
public class if_statement{
	public static void main(String args[]){
		Scanner s=new Scanner(System.in);
		char ch;
		double n1,n2;
		System.out.println("Enter 2 numbers : ");
		n1=s.nextDouble();
		n2=s.nextDouble();
		System.out.println("Enter which operation do you want to perform :");
		ch=s.next().charAt(0);
	
		switch(ch){
			case '+':
			System.out.println("Addition = "+(n1+n2));
			break;
			case '-':
			System.out.println("Subtraction = "+(n1-n2));
			break;
			case '*':
			System.out.println("Multiplication = "+(n1*n2));
			break;
			case '/':
			System.out.println("Division = "+(n1/n2));
			break;
			case '%':
			System.out.println("Remainder = "+(n1%n2));
			break;
			default:
				System.out.println("Invalid Operation ");
		}
		
	}
}