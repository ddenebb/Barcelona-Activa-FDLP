/*
 * Make a program where the user enters a character and a number on the screen. 
 * The program prints a square on the screen with the size and character entered by the user.
 */
import java.util.Scanner;
public class M7_1EX7 {
	public static void main (String[] args) {
		

		int squareSideLenght = getNumber("Enter number:");
		
		char character  = getChar("Enter character");
		
		printResult(character, squareSideLenght);
		
		}
		static int getNumber(String message){
			Scanner sc = new Scanner(System.in);
			System.out.print(message);
			int numberEntered = sc.nextInt();
			return numberEntered;
		}
		
		static char getChar(String message) {
			Scanner sc = new Scanner (System.in);
			System.out.print(message);
			char charEntered  = sc.next().charAt(0);
			return (charEntered);
		}
		
		static void printResult(char x, int num1) {
			for (int i = 0; i < num1; i++) {
				for (int j = 0; j < num1; j++) {
					System.out.print(x + " ");
				} System.out.print(System.lineSeparator());
			
				
			}
		}
}