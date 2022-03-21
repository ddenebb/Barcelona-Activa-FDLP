import java.util.Scanner;

public class App {
	public static void main(String[] args) {
		
		float avg;
		int sum = 0;
		
		Scanner input = new Scanner (System.in);
		System.out.println("Enter number of people");
		
		int numOfPeople = enterNumbers(input);
	
		sum = sumOfAges(numOfPeople, sum);
		avg = averageAge(sum, numOfPeople);
		System.out.println("Average age is " + avg);
	}
	
	static int enterNumbers(Scanner input){
		int result = input.nextInt();
		return result;
	}
	
	static int sumOfAges(int numOfPeople, int sum) {
		Scanner input = new Scanner (System.in);
		int i = 0;
		int age;
		while (i < numOfPeople) {
			System.out.println("Enter your age");
			age = enterNumbers(input);
			if (age < 0 || age > 120) {
				System.out.println("Error! age outside range");
			} else {
			sum = sum + age;
			i++;
			}
		}
		return sum;
	}
	
	static float averageAge(int sumOfAges, int numOfPeople) { 
		float result = (float) sumOfAges/numOfPeople;
        return result;
    }
}
