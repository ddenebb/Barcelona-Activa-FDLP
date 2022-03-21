/* User must enter a string and the program must display the string reversed.
Reverse () method cannot be used
 */
import java.util.Scanner;

public class M7_3EX2 {
	public static void main(String[] args) {
		System.out.println(reverseString(getUserStr("Please enter a string:")));
		}
		
	static String getUserStr(String message){
			Scanner input = new Scanner(System.in);
			System.out.print(message);
			String stringEntered = input.nextLine();
			return stringEntered;
	}
	
	static String reverseString(String userStr) {
		String reversed = "";
		char ch;
		for (int i = 0; i < userStr.length(); i++) {
			ch = userStr.charAt(i);
			reversed = ch + reversed;
		}
		return reversed;
	}
}
