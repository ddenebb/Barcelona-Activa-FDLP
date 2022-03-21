import java.util.Scanner;


/* The program asks for two integers and then calculates the sum of the values ​​between the two numbers, inclusive.

Example: 4 and 10 -> result = 4 + 5 + 6 + 7 + 8 + 9 + 10 = 49
 */

public class M5EX2 {
	public static void main(String[] args) {
		
		//enter variables
		Scanner input = new Scanner (System.in);
		
		int num1, num2, result;
		
		// present program and ask user to enter first number
		System.out.println("The program asks for two integers and then calculates the sum of the values ​​between the two numbers, inclusive. Enter first number");
		num1 = input.nextInt();
		
		System.out.println("Enter second number");
		num2 = input.nextInt();
		result = 0;

		
		input.close();
		
		//iterate with loop
		for (int i = num1; i <= num2; i++) {
			result = result + i;// accumulator: result += i;			
			}
		System.out.println("The result is "+ result);
	}
}
