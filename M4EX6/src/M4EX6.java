/*
 * Make a program that asks the user what day and month he/she was born, with this information the program 
 * shows on the screen the zodiac sign it belongs to.

    Aries-Aries (21.03 - 19.04)
    Taurus-Taurus (20.04 - 20.05)
    Bessons-Gemini (21.05 - 20.06)
    Crab Cancer (21.06 - 22.07)
    Leo-Leo (23.07 - 22.08)
    Verge-Virgo (23.08 - 22.09)
    Libra Libra (23.09 - 22.10)
    Scorpio-Scorpio (23.10 - 21.11)
    Sagittarius-Sagittarius (22.11 - 21.12)
    Capricorn-Capricorn (22.12 - 19.01)
    Aquarium-Aquarium (20.01 - 18.02)
    Pisces-Pisces (19.02 - 20.03)
 */
import java.util.Scanner;

public class M4EX6 {
	public static void main(String[] args) {
		//Create variables int type and String type
		int day;
		
		String month, zodiac_sign;
		
		//Create variable Scanner type and assign scanner object
		Scanner input = new Scanner (System.in);
							
		//ask user to enter day of birth (int type)
		System.out.println("Enter day of birth´s number:");
		day = input.nextInt();
		
		input.nextLine(); //Clean input buffer
		
		//ask user to enter month of birth (String type)
		System.out.println("Enter month of birth´s name:");
		month = input.nextLine();
		
		input.close(); //Close scanner
		
		zodiac_sign = "unknown";
		
		if (month.equalsIgnoreCase("january")){
			if (day < 20) 
				zodiac_sign = "Capricorn";
			else 
				zodiac_sign = "Aquarius";
			}
		else if (month.equalsIgnoreCase("february")){
			if (day < 19) 
				zodiac_sign = "Aquarius";
			else 
				zodiac_sign = "Pisces";
			}
		else if (month.equalsIgnoreCase("march")){
			if (day < 21) 
				zodiac_sign = "Pisces";
			else 
				zodiac_sign = "Aries";
			}
		else if (month.equalsIgnoreCase("april")){
			if (day < 20) 
				zodiac_sign = "Aries";
			else 
				zodiac_sign = "Taurus";
			}
		else if (month.equalsIgnoreCase("may")){
			if (day < 21) 
				zodiac_sign = "Taurus";
			else 
				zodiac_sign = "Gemini";
			}
		else if (month.equalsIgnoreCase("june")){
			if (day < 21) 
				zodiac_sign = "Gemini";
			else 
				zodiac_sign = "Cancer";
			}
		else if (month.equalsIgnoreCase("july")){
			if (day < 23) 
				zodiac_sign = "Cancer";
			else 
				zodiac_sign = "Leo";
		}
		else if (month.equalsIgnoreCase("august")){
			if (day < 23) 
				zodiac_sign = "Leo";
			else 
				zodiac_sign = "Virgo";
		}
		else if (month.equalsIgnoreCase("september")){
			if (day < 23) 
				zodiac_sign = "Virgo";
			else 
				zodiac_sign = "Libra";
		}
		else if (month.equalsIgnoreCase("october")){
			if (day < 23) 
				zodiac_sign = "Libra";
			else 
				zodiac_sign = "Scorpio";
		}
		else if (month.equalsIgnoreCase("november")){
			if (day < 22) 
				zodiac_sign = "Scorpio";
			else 
				zodiac_sign = "Saggitarius";
		}
		else if (month.equalsIgnoreCase("december")){
			if (day < 22) 
				zodiac_sign = "Saggitarius";
			else 
				zodiac_sign = "Capricorn";
		} else {
			System.out.println("Error!!! enter day of birth in format: day:two digits between 00 and 31; month: its name; Example: day:16 / month: February");
			
		}
		System.out.println("Your zodiac sign is " + zodiac_sign);
		
	}

}
/*create switch to print user´s selection case as system output
switch (zodiac) {
  case 1:
    System.out.println("Your zodiac sign is Aries");
    break;
  case 2:
    System.out.println("Your zodiac sign is Taurus");
    break;
  case 3:
    System.out.println("Your zodiac sign is Gemini");
    break;
  case 4:
    System.out.println("Your zodiac sign is Cancer");
    break;
  case 5:
    System.out.println("Your zodiac sign is Leo");
    break;
  case 6:
    System.out.println("JYour zodiac sign is Virgo");
    break;
  case 7:
    System.out.println("Your zodiac sign is Libra");
    break;
  case 8:
	System.out.println("Your zodiac sign is Scorpio");
	    break;
  case 9:
	System.out.println("Your zodiac sign is Saggitarius");
	    break;
  case 10:
	System.out.println("Your zodiac sign is Capricorn");
	    break;
  case 11:
	System.out.println("Your zodiac sign is Aquarius");
	    break;
  case 12:
	System.out.println("Your zodiac sign is Pisces");
	    break;
default:
	System.out.println("Try again: Month number must be between 1 and 12");
	/*if ((month <= 0) || (month >= 13)){
		System.out.println("Try again: Month number must be between 1 and 12");
	}*/
