/* The user must enter two numbers, the program will return "One of the two numbers is negative" 
 * only if one of the two numbers is negative.
 */
import java.util.Scanner;
public class M7_1EX4 {
	public static void main (String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter first number: ");
		double num1 = getNumber(input);
		System.out.print("Enter second number: ");
		double num2 = getNumber(input);
		if (isNegative(num1, num2) == true) { 
		System.out.println("One of the two numbers is negative");
		} else {
		System.out.println("Both numbers are either zero, positive or negative");	
		}
		input.close();
		} 
	
		static boolean isNegative(double n1, double n2) {
		boolean result = (n1 < 0 && n2 < 0) || (n1 >= 0 && n2 >= 0);
				return result;
			}
		
		static double getNumber(Scanner sc){
			double numberEntered = sc.nextInt();
			return numberEntered;
		}
	}
