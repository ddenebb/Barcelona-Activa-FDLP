/*El programa demana a l'usuari que introdueixi 3 notes i 
 *  mostra la mitja de les 3 notes per pantalla.
*Les notes que introdueix l'usuari són números enters però la mitja pot tenir decimals.
 */
//import library
import java.util.Scanner;

//create class
public class App  {
	public static void main(String[]args) {
		//Declare variables
		int grade1;
		int grade2;
		int grade3;
		float avg;
		
		//create scanner
		Scanner sc = new Scanner(System.in);
		
		//Ask user to introduce grades
		System.out.print("This program calculates the average of 3 grades introduced...");
		
		System.out.print("Introduce grade number 1");
			grade1 = sc.nextInt();
		System.out.print("Introduce grade number 2");
				grade2 = sc.nextInt();
		System.out.print("Introduce grade number 3");
				grade3 = sc.nextInt();
		//close Scanner
				sc .close();
		avg = (float)(grade1+grade2+grade3)/3;
		
		//print average output
		System.out.print("The average of the 3 grades introduced is " + avg);
	}

}
