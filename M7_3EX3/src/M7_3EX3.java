/* User must enter a phrase and the program must tell if the phrase is a palindrome.
 */
import java.util.Scanner;

public class M7_3EX3 {
	public static void main(String[] args) {
		isPalindrome(getUserStr("Please enter a palindrome:"));
		}
		
	static String getUserStr(String message){
			Scanner input = new Scanner(System.in);
			System.out.print(message);
			String stringEntered = input.nextLine();
			return stringEntered;
	}
	
	static void isPalindrome(String userStr) {
		String reversed = "";
		char ch;
		userStr = userStr.replaceAll("[^A-Za-z]+","");
		for (int i = 0; i < userStr.length(); i++) {
			ch = userStr.charAt(i);
			//if (Character.isLetterOrDigit(ch)) {
			reversed = ch + reversed;
			}
		//System.out.println(userStr);
		//System.out.println(reversed);
		if(userStr.equalsIgnoreCase(reversed)) {
			System.out.println("Yes, phrase entered is a palindrome.");
		} else {
			System.out.println("No, phrase entered is not a palindrome.");	

		}
	}
}
