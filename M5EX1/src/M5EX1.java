import java.util.ArrayList;
import java.util.Scanner;

/* The program asks how many words the user wants to enter. 
 * User enters the number and then the following message appears: "Enter word".
 * This message is displayed as many times as the number of words the user wanted to enter. 
 * The words are saved in an arrayList and once they are all entered, they are displayed on the screen.
 */

public class M5EX1 {
	public static void main(String[] args) {
		
		//enter variables
		Scanner input = new Scanner (System.in);
		int number;
		
		// ask user to enter number of times for the message to be printed
		System.out.println("How many words do you want to be printed?");
		number = input.nextInt();
		
		ArrayList<String> wordlist = new ArrayList<String>(number);
		
		//wordlist.size(number);
		
		input.nextLine();//clear input buffer
		

		
		//iterate with loop
		for (int i = 0 ; i < number; i++) {
			// ask user to enter message
			System.out.println("Enter word to be printed");
			//String word = input.nextLine();
			wordlist.add(input.nextLine());
		}input.close();
		//System.out.println(wordlist);
		for (int j = 0; j < wordlist.size(); j++) {
			System.out.print(wordlist.get(j) + " ");	
		}
	}
}
