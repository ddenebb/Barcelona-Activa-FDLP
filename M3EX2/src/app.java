/*Make a program that asks the user for two integers. 
* At the end, the program prints the following message on the screen:

The result of adding the two numbers is: "value"

The result of subtracting the two numbers is: "value"

The result of multiplying the two numbers is: "value"

The result of dividing the two numbers is: "value".

The modulo is:"value"
*/

import java.util.Scanner;
public class app {
	public static void main(String[]args) {
		//Create variables
		int num1;
		int num2;
		
		Scanner input = new Scanner (System.in);
		
		//ask user to introduce first number
		System.out.println("Introduce an integer");
		num1 = input.nextInt();
		//ask user to introduce second number
		System.out.println("Introduce another integer");
		num2 = input.nextInt();
		
		input.close();
		
		//print results
		System.out.println("The result of adding the two numbers is "+ (num1+num2));
		System.out.println("The result of subtracting the two numbers is: " +(num1-num2));
		System.out.println("The result of multiplying the two numbers is: " +(num1*num2));
		System.out.println("The result of dividing the two numbers is: " +((float)num1/(float)num2));
		System.out.println("The modulo is: " +(num1%num2));
	}
		
		
		
	

}
