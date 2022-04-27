import java.util.Scanner;

public class M7_3EX5 {
	public static void main (String[] args) {
		String userStr = getStr("Enter a phrase");
		printResult(containsUpperCaseLetter(userStr), containsLowerCaseLetter(userStr));
	}
		
	static String getStr(String message){
		Scanner sc = new Scanner(System.in);
		System.out.print(message);
		String strEntered = sc.nextLine();
		return strEntered;
	}
	static boolean containsUpperCaseLetter(String userStr) {
			for (int i = 0; i< userStr.length(); i++) {
			if (Character.isUpperCase(userStr.charAt(i))) {
				return true;
				}
		}return false;
	}
	static boolean containsLowerCaseLetter(String userStr) {
			for (int i = 0; i< userStr.length(); i++) {
			if (Character.isLowerCase(userStr.charAt(i))) {
				return true;
				}
		}return false;
	}
	static void printResult(boolean UpperCaseLetter, boolean LowerCaseLetter) {
		if (UpperCaseLetter && !LowerCaseLetter) {
			System.out.println("Phrase contains uppercase letters only");
		} else if (!UpperCaseLetter && LowerCaseLetter) {
				System.out.println("Phrase contains lowercase letters only");
		} else {
				System.out.println("Phrase contains both uppercase and lowercase letters");
		}
			
	}
}


