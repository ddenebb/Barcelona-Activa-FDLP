import java.util.Scanner;

/* User enters a number per keypad and the program calls a method that must show the Fibonacci sequence.
Example:
If user enters number 10, result should be:
0,1,1,2,3,5,8,13,21,34
 */
public class M7_2EX8 {
	public static void main(String[] args) {
		int term = getNumber("This program prints Fibonacci series up to the index entered. Enter a number");
		
		printFibonacciSeries(term);
		
		
	}
	static int getNumber(String message){
		Scanner input = new Scanner(System.in);
		System.out.print(message);
		int numberEntered = input.nextInt();
		return numberEntered;
	}
	static int fibonacci (int term) {
		int value;
		if (term == 0 || term == 1) {
			value = term;
		} else {
			value = fibonacci(term -1) + fibonacci(term -2);
		}
		return value;
	}
	static void printFibonacciSeries(int term) {
		for (int i = 0; i< term; i++) {
			System.out.print(fibonacci(i) + ",");
		}
	}
}
	
