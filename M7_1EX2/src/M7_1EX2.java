import java.util.ArrayList;
import java.util.Scanner;

/* A teacher wants to calculate the averages of the grades for the whole class. 
 Create an application where the user will enter a number per screen 
 (the number corresponds to the number of notes they want to enter) and the program 
 will ask you to enter the grades of all students.

Once the notes have been entered, the program returns the following:

If the average grade is less than 5: 
"The average grade of the class is suspended. Students should ask their questions and work harder."

If the grade is less than 7: 
"The average grade in the class is good, but students should improve their personal work."

For all other cases, the message should be: 
"Congratulations! The average grade for the class corresponds to the effort made."
 Grades must be between 0 and 10.
 */
public class M7_1EX2 {
	public static void main(String[] args) {

		
		float numberOfGrades = getNumber("Enter number of grades to be averaged");
		float total = gradesListAccumulator((int) numberOfGrades);
		int avg = (int)division(total, numberOfGrades);
		messageSelector (avg);
}
	
	
	static float getNumber(String message){
		Scanner input = new Scanner (System.in);
		System.out.println(message);
		float numberEntered = input.nextFloat();
		return numberEntered;
	}
	static float gradesListAccumulator(int n1) {
		float grade;
		float total = 0;
		ArrayList<Float> grades = new ArrayList<Float>();
		for (int i = 0; i < n1; i++) {//while
			grade = getNumber("Enter grade");
			//if (grade > 0 && grade < 10)
			grades.add(grade);
			total += grades.get(i);
			}
		return(total);
		
	}
	static float division(float n1, float n2) { 
		float result = n1/n2;
        return result;
	}
	static void messageSelector (int n1) {
		if (n1 < 5){
			System.out.println("The average grade of the class is suspended. Students should ask their questions and work harder."
);
		} else if (n1 < 7) {
			System.out.println("The average grade in the class is good, but students should improve their personal work.");
		} else {
			System.out.println("Congratulations! The average grade for the class corresponds to the effort made.");
		}

	}
}
