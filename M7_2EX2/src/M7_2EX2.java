/*Make a program that displays the following on the screen:
* * * * * *

* * * * *

* * * *

* * *

* *

*
*/
public class M7_2EX2 {
	public static void main(String[] args) {
			
		char character = '*';
		int rows = 6;
		printResult(character,rows);
		
			
	}
	static void printResult(char character, int rows) {
		for (int i = rows; i >= 1; i--) {
			for (int j = 1; j <= i; j++) {
				System.out.print(character + " ");
			}
			System.out.println();
		}
	}
}
