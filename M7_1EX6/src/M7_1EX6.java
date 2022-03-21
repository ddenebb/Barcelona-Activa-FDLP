/*
 * Multiplication table. The user will enter a number (from 1 to 10) per screen, and using a loop, 
 * the program will show you the multiplication table of that number.
 */
import java.util.Scanner;

public class M7_1EX6 {
	public static void main (String[] args) {
		
		
		int multiplier = getNumber("Enter number from 1 to 10:");
		
		printMultiplicationTable(multiplier);	
	}
	
	static int getNumber(String message){
		Scanner input = new Scanner(System.in);
		System.out.print(message);
		int numberEntered = input.nextInt();
		return numberEntered;
	}
	
	static int multiply (int n1, int n2) {
	int result = n1 * n2;
	return result;
	}
	
	static void printMultiplicationTable(int multiplier){
	
	for (int i = 0; i <= 10; i++) {
		int result = multiply(i, multiplier);
		System.out.println(multiplier + " x " + i + " = " + result);
		}
	}
}
