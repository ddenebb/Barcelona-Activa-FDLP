/* You must modify the previous program to add a new functionality: set a maximum number of 5 attempts.
If the user hits the number chosen by the program before these 5 attempts, 
the program displays the following message on the screen: "Congratulations, the number is X and you needed Y to try to get it right."
If you do not hit the number before 5 attempts, the program prints: 
"You have used too many attempts! The number is X".
 */
import java.util.Scanner;
public class M5EX4 {
	public static void main(String[] args) {
	//enter variables
			Scanner input = new Scanner (System.in);
			
			double random;
			int numUser, i;
		
				
			random = (int)Math.ceil ((Math.random () * 10));
			i = 1;
			
			// present program and ask user to enter number
			System.out.println("User has to guess the number between 0 and 10 chosen at random by the program. Enter number");
			numUser = input.nextInt();
			
			//loop checking if number entered belongs to range, otherwise asks for another number
			/*while (numUser < 0 || numUser > 10) {
			System.out.println("Number between 0 and 10. Try again");
			numUser = input.nextInt();
			}*/
			
			// loop checking if number entered is different to random
			while (i < 5) {
				if (numUser != random) { 
					if (numUser < 0 || numUser > 10) {
						System.out.println("Number must be between 0 and 10. Try again");
						//if condition true asks for another try
					
					numUser = input.nextInt();
					} else {
						System.out.println("That´s not correct. Try again");
						numUser = input.nextInt();	
					}
				}
				i++;
			} 
			if (numUser == random) {// if condition false comes out of loop and prints congratulations message
		        	System.out.println("Congratulations you have guessed the number");
				} else { // if condition true comes out of loop and prints fail message
			System.out.println("You have used too many attempts! The number is " + random);
				}
			input.close();			
	}
}
