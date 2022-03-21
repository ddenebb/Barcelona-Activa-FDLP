import java.util.Scanner;

public class M7_1EX3 {
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	int num;
	System.out.print("Enter number: ");
	num = getNumber(input);
	if (isEven(num)) { 
	System.out.println("Number " + num + " es even") ;
	} else {
	System.out.println("Number " + num + " is odd");
	}
	input.close();
	} 
	static boolean isEven(int number) {
	boolean result;
	result = (number % 2 == 0) ? true : false;
	return result;
	}
	static int getNumber(Scanner sc){
		int numberEntered = sc.nextInt();
		return numberEntered;
	}
}
