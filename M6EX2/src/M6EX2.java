/* This program calculates the average age of a number of people entered by keyboard.
A function should be created to ask the user for ages and to calculate the average age.
The function will receive as a parameter the number of people to whom to ask the age.
The age of the people will only be valid if they are between 0 and 120 years old.
The average age entered must be returned by the function (return).
*/
import java.util.Scanner;

public class M6EX2 {
	public static void main(String[] args) {
		
		float avg;
		int numOfPeople;
		int sum = 0;
		
		Scanner input = new Scanner (System.in);
		
		System.out.println("Enter number of people");
		numOfPeople = input.nextInt();
		
		sum = sumOfAges(numOfPeople, sum);
		avg = averageAge(sum, numOfPeople);
		System.out.println("Average age is " + avg);
		
	}
	
	static int sumOfAges(int numOfPeople, int sum) {
		Scanner input = new Scanner (System.in);int i = 0;
		while (i < numOfPeople) {
			int age;
			System.out.println("Enter your age");
			age = input.nextInt();
			if (age < 0 || age > 120) {
				System.out.println("Error! age outside range");
			} else {
			sum = sum + age;
			i++;
			}
		}
		return sum;
	}
	
	static float averageAge(int age, int numOfPeople) { 
		float result = (float)age/numOfPeople;
        return result;
    }
}
