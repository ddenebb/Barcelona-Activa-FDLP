
/*
 * The user enters a month per screen and activates a switch for 12 months of the year, the program calculates the days of the month and displays the following:

Example: If the number entered is 1, the keys will appear on the screen: “January has 31 days”
 */
import java.util.Scanner;

public class M4EX4 {
	public static void main(String[] args) {
	
	//Create variable int type
	int month;
	
	//Create variable Scanner type and assign scanner object
	Scanner input = new Scanner (System.in);
						
	//ask for month number int type
	System.out.println("Introduce month number:");
	month = input.nextInt();
	
	input.close();
	
	//create switch to print user´s selection case as system output
		switch (month) {
		  case 1:
		    System.out.println("Januay has 31 days");
		    break;
		  case 2:
		    System.out.println("February has 28 days");
		    break;
		  case 3:
		    System.out.println("March has 31 days");
		    break;
		  case 4:
		    System.out.println("April has 30 days");
		    break;
		  case 5:
		    System.out.println("May has 31 days");
		    break;
		  case 6:
		    System.out.println("June has 30 days");
		    break;
		  case 7:
		    System.out.println("July has 31 days");
		    break;
		  case 8:
			System.out.println("August has 31 days");
			    break;
		  case 9:
			System.out.println("September has 30 days");
			    break;
		  case 10:
			System.out.println("October has 31 days");
			    break;
		  case 11:
			System.out.println("November has 30 days");
			    break;
		  case 12:
			System.out.println("December has 31 days");
			    break;
		default:
			System.out.println("Try again: Month number must be between 1 and 12");
			/*if ((month <= 0) || (month >= 13)){
				System.out.println("Try again: Month number must be between 1 and 12");
			}*/
		}
	}

}
