/*
 * Displays even numbers between 100 and 0 in descending order on the screen.
 */
public class M7_1EX5 {
	public static void main (String[] args) {
		
		printDescendingEvenNumbers();
	}
	
	static void printDescendingEvenNumbers() {
	for (int i = 100; i >= 0; i = i-2) {
			System.out.print(i + " ");
		}
	}
}
