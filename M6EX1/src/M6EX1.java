import java.util.ArrayList;
import java.util.Scanner;

public class M6EX1 {
	public static void main(String[] args) {
		
		
		System.out.println(getMessage(0));
		char num1 = getChar();
		System.out.println(getMessage(1));
		char operator = getChar();
		System.out.println(getMessage(2));
		char num2 = getChar();
		
	int result = operation(num1, operator, num2);
	System.out.println(result);
	}
	
	static char getChar() {
		Scanner input = new Scanner (System.in);
		char UserData  = input.next().charAt(0);
		return (UserData);
}
	static String getMessage(int i) {
		ArrayList<String> messageList = new ArrayList<String>();
		messageList.add("Enter first number");
		messageList.add("Enter operator");
		messageList.add("Enter second number");
		return messageList.get(i);
}
	static char operation(char num1, char op, char num2) {
		
		int n1 = Character.getNumericValue(num1);
		int n2 = Character.getNumericValue(num2);
		
		int result = 0;
		
		if(op == '/' && n2 == 0){
			System.out.println("Error: number 0 can´t be a divisor!");	
		} else {
		
		switch(op) {
		case '+':
			result = (n1 + n2);
		    break;
		case '-':
			result = (n1 - n2);
		    break;
		case '*':
			result = (n1 * n2);	
		    break;
		case '/':
			result = (n1 / n2);
		    break;
		case '%':
			result = (n1 % n2);
		    break;
		default:
			System.out.println("Try again: operator must be one of the following characters:(+, -, *, /, %)");
			}		
		}return (char)result;
	}
}
