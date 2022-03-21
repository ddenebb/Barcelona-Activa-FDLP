/* This line of code: Math.ceil ((Math.random () * 10)); Returns a number between 0 and 10 at random.
The exercise is that the user has to guess the number chosen at random by the program.
The program prompts the user for numbers until the user guesses the random number generated by the program.
Once the user has guessed the number, the following message will be displayed on the screen: 
"Congratulations, the number was X"
 */
import java.util.Scanner;
public class M5EX3 {
	public static void main(String[] args) {
	//enter variables
			Scanner input = new Scanner (System.in);
			
			double random;
			int numUser;
				
			random = Math.ceil ((Math.random () * 10));
			
			// present program and ask user to enter number
			System.out.println("User has to guess the number between 0 and 10 chosen at random by the program. Enter number");
			numUser = input.nextInt();
			
			// loop checking if number entered belongs to range, otherwise asks for another number
	
			
			// loop checking if number entered is different to random, if condition true asks for another try
			while (numUser != random) {
				System.out.println("That´s not correct. Try again");
				numUser = input.nextInt();
				if (numUser < 0 || numUser > 10) {
					System.out.println("Number between 0 and 10. Try again");
					numUser = input.nextInt();
			}// if condition false comes out of loop and prints congratulations message
			System.out.println("Congratulations you have guessed the number");
			}input.close();
	}
}



