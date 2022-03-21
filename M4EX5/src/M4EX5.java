/*Make a program that asks for two numbers and an operator (+, -, *, /).

At the end, the program should print the result of the operation that contains the operator variable.*/


//import utility
import java.util.Scanner;

public class M4EX5 {
	public static void main(String[] args) {
		//Create variables int type + char type
		int num1, num2;
		char operator;
		
		//Create variable Scanner type and assign scanner object
		Scanner input = new Scanner (System.in);
		
		//ask user for first number int type
		System.out.println("Enter first number:");
		num1 = input.nextInt();
		
		input.nextLine(); //Clean input buffer
		
		//ask user for first number String type
		System.out.println("Enter operator: (+, -, *, /)");
		operator = input.nextLine().charAt(0);
				
		//ask user for first number int type
		System.out.println("Enter second number:");
		num2 = input.nextInt();
		
		input.close();
		
		if(operator == '/' && num2 == 0){
			System.out.println("Error: number 0 can´t be a divisor!");	
		} else {
		
		switch(operator) {
		case '+':
			System.out.println("Result of adding the two numbers is: " + (num1+num2));
		    break;
		case '-':
			System.out.println("Result of subtracting the two numbers is: " + (num1+num2));
		    break;
		case '*':
			System.out.println("Result of multyplying the two numbers is: " + (num1*num2));
		    break;
		case '/':
			System.out.println("Result of dividing the two numbers is: " + (num1/(float)num2));
		    break;
		default:
			System.out.println("Try again: operator must be one of the following characters:(+, -, *, /)");
		}
		}		

	}

}
