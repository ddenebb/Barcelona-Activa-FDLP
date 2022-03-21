import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
 * Make a program with 4 methods. The "main" program should call the 4 methods and interact with them as follows:

a. Create a no-parameter, no-return method that prints for the "I'm a method" console. Call this method from the main.

Output: I am a method


b. Creates a method that receives an arrayList of numbers as a parameter, prints the largest number per console, 
and returns the index of the arrayList where the smallest number is located. 
Create an arrayList of 5 numbers in the main and use the method you just created to print the smallest number 
in the array.

Output (with these numbers in the arrayList "8, 12, 5, 22, 6":

                Largest number 22 (this is printed by the method itself)

                Smallest number 5 (print this main)

 

c. Creates a method that receives an arrayList of names as a parameter and returns the index of the longest name. 
Create an arrayList with 5 names in the main and use the method you just created to print the longest name in the array.

Exit (with these names inside the "Noah, Peter, Victoria, Dani, Sara" array:

                Longest name: Victoria (print this main)

 

d. Create a method that receives two numbers as parameters and returns an arrayList with all the numbers between 
them. Call the method you just created from the main with the two numbers you want and print the arrayList that 
comes back to you.

Output (with numbers 2 and 10):

               The numbers between 2 and 10 are: 3, 4, 5, 6, 7, 8, 9
 */
public class M6EXTRA1 {
	public static void main(String[] args) {
		 printMessage();
		 
		ArrayList<Integer> numList = new ArrayList<Integer>();
		 numList.add(8);
		 numList.add(12);
		 numList.add(5);
		 numList.add(22);
		 numList.add(6);
		 
		 int firstNumber = processNumbers(numList);
		 System.out.println(firstNumber);
		 
		 /*System.out.println("NumList contains: " + numList.toString());*/
		 
		 //List<Integer> listIntegers = new ArrayList<>(Arrays.asList(28,37,3,42,9));
		 //processNumbers(listIntegers);
		
		 //System.out.println("ArrayIntegers contains: " + listIntegers.toString());
		 
	}
	static void printMessage(){
		System.out.println("I am a method");
	}
	static int processNumbers(ArrayList<Integer>numList){
		 System.out.println("numList contains: " + numList.toString());
		 return numList.get(0);
		
	}
		
}
