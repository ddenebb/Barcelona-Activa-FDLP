/* For an array of numbers given, the program should show the sum of all 
 * even numbers and the sum of all odd numbers.
 */
import java.util.ArrayList;
import java.util.Scanner;

public class M7_3EX6 {
	public static void main (String[] args) {
		ArrayList<Integer> numList = new ArrayList<Integer>();
		numList.add(1);
		numList.add(2);
		numList.add(3);
		numList.add(4);
		numList.add(5);
		
		System.out.println("Result of the addition of even numbers in list is " + accEven(numList));
		System.out.println();
		System.out.println("Result of the addition of odd numbers in list is " + accOdd(numList));


	}
	static int getNumber(String message){
		Scanner sc = new Scanner(System.in);
		System.out.print(message);
		int numberEntered = sc.nextInt();
		return numberEntered;
	}
	static int accEven(ArrayList<Integer> numList) {
		int evenNumSum = 0;
		int i = 0;
		while (i < numList.size()) {
		if (numList.get(i) % 2 == 0) {
			evenNumSum = evenNumSum + numList.get(i);
			} i++;
		}
		return evenNumSum;
	}
	static int accOdd(ArrayList<Integer> numList) {
		int oddNumSum = 0;
		int i = 0;
		while (i < numList.size()) {
		if (numList.get(i) % 2 != 0) {
			oddNumSum = oddNumSum + numList.get(i);
			} i++;
		}
		return oddNumSum;
	}
}