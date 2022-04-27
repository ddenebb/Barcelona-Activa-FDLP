/* User has to enter a DNI and the program has to say if its letter matches the DNI number. 
 If the letter is incorrect, the program must show the correct letter.
To calculate the DNI letter the program has to take the DNI number to be verified 
and divide it by 23. The rest is replaced by a letter that is already assigned to 
this number using the attached table.
 */
import java.util.Scanner;
public class M7_3EX4 {
	public static void main(String[] args) {
		
		String strEntered = getStr("Enter DNI number (with letter)");
		int dniNumber = getNumberFromStr(strEntered);
		char dniLetter = getLastCharacter(strEntered);
		checkList(dniNumber, dniLetter);
		
	}
	
	static String getStr(String message){
		Scanner input = new Scanner(System.in);
		System.out.println(message);
		String strEntered = input.nextLine();
		return strEntered;
	}
	
	static int getNumberFromStr(String str) {
		   //String result = null;
		   /*if ((str != null) && (str.length() > 0)) {*/
		      String result = str.substring(0, str.length() - 1);
		   /*}*/int dniNumber = Integer.valueOf(result);
				   System.out.println(dniNumber);
		   return dniNumber;
		}
	
	static char getLastCharacter(String str) {
		   char dniLetter = str.charAt(8);
			System.out.println(dniLetter);
		   return dniLetter;
		}

	static void checkList(int dniNumber, char dniLetter){
		
		String charList = "TRWAGMYFPDXBNJZSQVHLCKE";

		int modulo = dniNumber % 23;
		
		if (dniLetter == charList.charAt(modulo)) {
			System.out.println("DNI letter is correct");
		} else {
			System.out.println("DNI letter is not correct");
		}
	}
}




	

	

		




/*public class M7_3EX4 {
	public static void main(String[] args) {
		
        ArrayList<Character> dniLetters = new ArrayList<Character>(); //char

        //dniLetters = ['T','R','W','A','G','M','Y','F','P','D','X','B','N','J','Z','S','Q','V','H','L','C','K','E'];	
        
        getLastCh(getStr("Enter DNI number (with letter)"));
      
        
	}

	static String getStr(String message){
		Scanner input = new Scanner(System.in);
		System.out.println(message);
		String strEntered = input.nextLine();
		return strEntered;
	}
	static char getLastCh(String strEntered) {
		int n = strEntered.length();  
        //System.out.println("Length of the String : " + n);
		char last = strEntered.charAt(n - 1);  
        //System.out.println("Last Character : " + last);
        return last;
	}
	static int getLastTwoDigits(String strEntered) {
	  	char dig1 = strEntered.charAt(6);
	  	char dig2 = strEntered.charAt(7); 
        System.out.println(dig1 + dig2);
        return dig1;
	}
	//static void checkList(char last, ArrayList<Character> dniLetters) {
		//if (last == )
	//}
	
}*/
