/*
 * The user enters a number by keyboard and the program calls a method that indicates 
 * whether the number is prime or not.
 */

import java.util.Scanner;

public class M7_2EX5 {
	public static void main(String[] args) {
		int n1 = getNumber("This program indicates whether the number entered is prime or not. Enter number");
		printAnswer(isPrime(n1), n1);
		
	}
	
	static boolean isPrime(int n1) {
		boolean result = false;
		int i = 2;
		while (i <= n1 / 2) {
		      // condition for non prime number
		      if (n1 % i == 0) {
		        result = true;
		        break;
		      }
		      i++;
		}
		 return result;
	}
	
	static int getNumber(String message){
		Scanner input = new Scanner(System.in);
		System.out.print(message);
		int numberEntered = input.nextInt();
		return numberEntered;
	}
	static void printAnswer(boolean flag, int n1) {
		if (!flag) {
			System.out.println(n1 + " is a prime number");
		} else {
			System.out.println("Number " + n1 + " is not prime");
		}
	}
}
