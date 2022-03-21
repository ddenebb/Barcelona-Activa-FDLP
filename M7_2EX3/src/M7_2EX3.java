/*Make a program that displays the following on the screen:
*

* *

* * *

* * * *

* * * * *

* * * * * *

* * * * *

* * * *

* * *

* *

*


The line with the most "*" will be given by a number that the user will enter per console.
Condition: There can only be two * in the entire program code 
Also, if possible, do not use any method such as repeat () or substring () of the String class
*/
public class M7_2EX3 {
	public static void main(String[] args) {
		
		char character = '*';
		int rows = 6;
		printResult(character,rows);		
	}
	
	static void printResult(char character, int rows) {
		for (int i = 1; i < rows; i++) {
		      for (int j = 1; j <= i; j++) {
		        System.out.print(character + " ");
		      }
		      System.out.println();
		    }
		for (int i = rows; i >= 1; i--) {
			for (int j = 1; j <= i; j++) {
				System.out.print(character + " ");
			}
			System.out.println();
		}
	}
}
