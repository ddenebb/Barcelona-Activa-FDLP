import java.util.Scanner;

/* User must enter numbers until they enter a prime number.
When user enters a prime number, the program should display the following message:
Exactly, the number "x" is prime!
Note: Use the method created in exercise: (M7.2.) Exercise 5
 */
public class M7_2EX6 {
	public static void main(String[] args) {
		int n1 = getNumber("This program indicates whether the number entered is prime or not. Enter number");
		//boolean result = (isPrime(n1));
		printAnswer((isPrime(n1)), n1);
	}
	static boolean isPrime(int n1) {
		boolean result = false;
		int i = 2;
		while (i <= n1 / 2) {
		      // condition for non prime number
		      if (n1 % i == 0) {
		        result = true;
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
	static void printAnswer(boolean result, int n1) {
		while (result == true) {
			n1 = getNumber("Try again");
			result = (isPrime(n1));
		}
			System.out.println(n1 + " is a prime number");
		}
}
	
