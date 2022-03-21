/* A language school grants scholarships to prospective students if they meet a number of requirements.
Students are awarded a scholarship if they are of legal age and have a university degree. 
Or he or she will be awarded a scholarship if the student is unemployed.
The program asks for all three details per screen and at the end shows whether the student has the scholarship or not. 
 */

import java.util.Scanner;

public class App {
	public static void main(String[] args) {
	//Create variable
		String legalAge;
		String UnivGrad;
		String unemployed;
	//Create scanner object
		Scanner input = new Scanner (System.in);
		
		
	//ask user for 3 pieces of information
		System.out.println("Are you of legal age? (yes/no)");
		legalAge = input.nextLine();
		
		System.out.println("do you have a university degree? (yes/no)");
		UnivGrad = input.nextLine();
		
		System.out.println("Are you currently unemployed ? (yes/no)");
		unemployed = input.nextLine();
		
		input.close();
		
		if ((legalAge.equalsIgnoreCase("yes")) && (UnivGrad.equalsIgnoreCase("yes")) || (unemployed.equalsIgnoreCase("yes"))){
			System.out.println("You have the right to a scholarship");
		} else {
			System.out.println("Sorry you don´t have the right to a scholarship");
		}
			
	}
}
