/*Make a program that asks the user two integers which you will call dividend and divisor respectively.
The divisor must be between 2 and 7.
Otherwise, the program should display an error message.
 * If the divisor is correct (2-7) shows on the screen whether the dividend is a multiple of the divisor or not.
 */
import java.util.Scanner;

public class M4EXTRA1 {
	public static void main(String[] args) {
	int dividend, divisor;
		
		Scanner input = new Scanner (System.in);
		
		//ask user to introduce dividend
		System.out.println("Enter dividend");
		dividend = input.nextInt();
		//ask user to introduce divisor
		System.out.println("Enter divisor");
		divisor = input.nextInt();
		
		input.close();
		
		if ((divisor < 2) || (divisor > 7)) {
			System.out.println("Error!!! Divisor must be between 2 and 7");
		}
		else if ((dividend % divisor) != 0){
			System.out.println("Dividend is NOT a multiple of the divisor");
		} else {
			System.out.println("Dividend is a multiple of the divisor");
		}
		
	}

}
