 /* A language school grants scholarships to prospective students if they meet a number of requirements.
Students are awarded a scholarship if they are of legal age and have a university degree. 
Or he or she will be awarded a scholarship if the student is unemployed.
The program asks for all three details per screen and at the end shows whether the student 
has the scholarship or not.
The program will ask for student data until these 5 scholarships are awarded. Once the program has awarded 
the 5 scholarships, the names of the 5 scholarship students must be displayed on the screen.
 */

import java.util.Scanner;
import java.util.ArrayList;

public class M5EX5a{
	public static void main(String[] args) {
	//Create variables
		//int i;
		String fullName;
		String legalAge;
		String UnivGrad;
		String unemployed;
		ArrayList<String> awardedList = new ArrayList<String>();
	//Create scanner object
		Scanner input = new Scanner (System.in);
		
		
	//ask user for 4 pieces of information

		do {
		System.out.println("Enter your full name");
		fullName = input.nextLine();
		
		System.out.println("Are you of legal age? (y/no)");
		legalAge = input.nextLine();
		
		System.out.println("do you have a university degree? (y/no)");
		UnivGrad = input.nextLine();
		
		System.out.println("Are you currently unemployed ? (y/no)");
		unemployed = input.nextLine();
		
		if ((legalAge.equalsIgnoreCase("y")) && (UnivGrad.equalsIgnoreCase("y")) || (unemployed.equalsIgnoreCase("y"))){
			awardedList.add(fullName);
			} else {
			} 
		}
		
		while (awardedList.size() < 5);
		
		for (int i = 0; i < awardedList.size(); i++) {
			System.out.println(awardedList.get(i) + " ");
			}
		input.close();
	}
}