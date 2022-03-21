/*This program asks the user the age; depending on this, it will display one of the following messages on the screen:
If the user is 5 years old or younger: Preschool
If the user is between 6 and 11 years old: Primary
If the user is between 12 and 15: ESO
If the user is between 16 and 17: Baccalaureate
If the user is of legal age: Vocational training or University
 */
import java.util.Scanner;

public class App {
	public static void main(String[] args) {
	//Create variable
		int age;
		//Create scanner object
		Scanner input = new Scanner (System.in);
					
		//ask for age int type
		System.out.println("Introduce yor age");
		age = input.nextInt();
		
		input.close();
					
					
		//if/else statements & print results
		if (age < 6) {
			System.out.println("Preschool");
		} else if (age >= 6 && age <= 11){
			System.out.println("Primary");
		} else if (age >= 12 && age <= 15){
			System.out.println("ESO");
		} else if (age >= 16 && age <= 17){
			System.out.println("Baccalaureate");
		} else {
			System.out.println("Vocational training or University");
		}
	}
}
