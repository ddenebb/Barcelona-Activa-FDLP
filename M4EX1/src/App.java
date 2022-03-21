import java.util.Scanner;

/*
 * Modify Exercise 1 of Module 3. Once the data has been entered, the program should display the following on the screen:

- If the user is 18 years of age or older: "Name Surname, you are of legal age"

- If the user is under the age of 18: "Name Surname, you are a minor".
 */
public class App {
	public static void main(String[] args) {
	//Create variables
			String name;
			String surname;
			int age;
			//Create scanner object
			Scanner input = new Scanner (System.in);
				
			//ask for data String type
			System.out.println("Introduce your name");
			name = input.nextLine();
			//ask for data String type
			System.out.println("Introduce your surname");
			surname = input.nextLine();
			//ask for age int type
			System.out.println("Introduce yor age");
			age = input.nextInt();
			
			input.close();
				
				
			//if/else statements & print results
			if (age > 17) {
				System.out.println(name+" " + surname+ ", you are of legal age");
			} else {
				System.out.println(name+" " + surname+ ", you are a minor");
			}
			
	}

}
