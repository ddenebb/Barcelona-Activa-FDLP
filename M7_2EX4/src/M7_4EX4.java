/*
Run a program where the user enters a number and the program calls a method that 
returns the factorial of the number entered.
The factorial of a number n (integer, non-negative) is the product of all positive 
integers less than or equal to n.
 */
import java.util.Scanner;

public class M7_4EX4 {
	public static void main(String[] args) {
		int n1 = getNumber("This program returns the factorial of the positive integer number entered. Enter number");
		System.out.println(factorialCalc(n1));
		
	}
	
	static int factorialCalc(int n1) {
		int factorial = 1;
		for (int i = 1; i <= n1; i++) {
			factorial = factorial * i;
		}
		return factorial;	
	}
	
	static int getNumber(String message){
		Scanner input = new Scanner(System.in);
		System.out.print(message);
		int numberEntered = input.nextInt();
		return numberEntered;
	}
}
