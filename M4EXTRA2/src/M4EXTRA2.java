
/*Make a program that asks the user for a number between 0 and 99 and shows it written in letters 
 * (could be in English, Catalan or Spanish).

Example: 56 (fifty-six) / 56 (cinquanta-sis) / 56 (cincuenta y seis).
 */
import java.util.Scanner;

public class M4EXTRA2 {
	public static void main(String[] args) {
		int number;
		String word;
		
		Scanner input = new Scanner (System.in);
		
		//ask user to enter number between 0 and 99
		System.out.println("Enter number between 0 and 99");
		number = input.nextInt();
		
		input.close();
		
		if ((number < 0) || (number > 99)) {
			System.out.println("Error!!! number must be between 0 and 99");
		} else {
			word = String.valueOf(number);
			
			System.out.println(word);
		}
		
	}

}
