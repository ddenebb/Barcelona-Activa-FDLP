import java.util.Scanner;

/* User enters a year on the keyboard. The program calls for a method that 
 indicates whether year entered is a leap-year or not.
 */
public class M7_2EX7 {
	public static void main(String[] args) {
		int a = getNumber("This program indicates whether year entered is a leap-year or not. Enter a year");
		IsLeapYear(a);
	}
	static int getNumber(String message){
		Scanner input = new Scanner(System.in);
		System.out.print(message);
		int numberEntered = input.nextInt();
		return numberEntered;
	}
	static void IsLeapYear(int a) {
		if (a % 400 == 0) {
			System.out.println (a + " is a leap-year");
		} else if (((a % 4) == 0) && ((a % 100) != 0)){
			System.out.println (a + " is a leap-year");
		} else {
			System.out.println (a + " is NOT a leap-year");
		}
	}
}
