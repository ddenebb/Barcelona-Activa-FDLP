/*
 * A group of friends have stayed to make a fideuà, the main ingredients will be: 
 * noodles, prawns and squid. They know that for every four people they have 
 * to use half a kilo of noodles, 400 grams of squid and 200 grams of prawns. 
 * There should be a program that asks on the screen the price per kilo 
 * of each ingredient and the number of friends that will be for lunch. 
 * The program must calculate the necessary quantities of each ingredient, 
 * the price per person and the the fideuà's final price.
 */
import java.util.ArrayList;
import java.util.Scanner;

public class M7_3EX7 {
	public static void main (String[] args) {
	float noodlesPrice = getNumber("Enter noodles' price in € per kg.: ");
	float squidPrice = getNumber("Enter squid's price in € per kg.: ");
	float prawnPrice = getNumber("Enter prawn's price in € per kg.: ");
	int numOfPeople = (int)getNumber("Enter number of people");
	 
	
	System.out.println("Each person pays: " + pricePerPerson(noodlesPrice, squidPrice, prawnPrice));
	System.out.println("Total price of fideuà is " + multiply(pricePerPerson(noodlesPrice, squidPrice, prawnPrice), numOfPeople));

}
	static float getNumber(String message){
		Scanner sc = new Scanner(System.in);
		System.out.print(message);
		float numberEntered = sc.nextFloat();
		return numberEntered;
	}
	static float pricePerPerson(float noodlesPrice, float squidPrice, float prawnPrice) {
		
		float eachPersonPays = (float) ((0.5 * noodlesPrice) + (0.4 * squidPrice) + (0.2 + prawnPrice));
		return eachPersonPays;
	}
	static float multiply (float n1, int n2 ) {
		float result = n1 *(float)n2;
		return result;
	}

}
