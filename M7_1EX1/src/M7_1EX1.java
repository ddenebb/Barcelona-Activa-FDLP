/*
 * Create a program where the user enters three notes and the program calculates the average. 
 * If the average is less than 5, the following message should appear on the screen: 
 * “You have not passed the course. You have to recover ”, 
 * if the average is between 5 and 7 you have to show:“ 
 * Congratulations! You have passed but you should keep practicing ", 
 * if the average is higher than 7 you should show:" 
 * Congratulations! You have passed the course! Go to the next level!
 * 
 */
import java.util.ArrayList;
import java.util.Scanner;
public class M7_1EX1 {
	public static void main(String[] args) {

		Scanner input = new Scanner (System.in);
		float total = numListAccumulator(input, 3);
		float avg = (int)division(total, 3);
		messageSelector ((int)avg);
		
	}
	static float getNumber(Scanner input){
		float numberEntered = input.nextFloat();
		return numberEntered;
	}
	static float numListAccumulator(Scanner input, int n1) {
		float grade;
		float total = 0;
		ArrayList<Float> grades = new ArrayList<Float>();
		for (int i = 0; i < n1; i++) {
			System.out.println("Enter grade");
			grade = getNumber(input);
			grades.add(grade);
			total = (grades.get(i) + total);
			}
		return(total);
		
	}
	static float division(float n1, float n2) { 
		float result = (float) n1/n2;
        return result;
	}
	static void messageSelector (int n1) {
		if (n1 >= 7){
			System.out.println("Congratulations! You have passed the course! Go to the next level!");
		} else if (n1 < 7 && n1 >= 5) {
			System.out.println("Congratulations! You have passed but you should keep practicing");
		} else {
			System.out.println("You have not passed the course. You have to recover");
		}
	}
}
	
