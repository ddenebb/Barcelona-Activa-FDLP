//Fer un programa que li demani a l’usuari: El nom, el cognom i l’edat.
//Un cop l’usuari hagi acabat d’introduir les dades, aquestes s’han de mostrar per pantalla

import java.util.Scanner;

public class App {
	public static void main(String[]args) {
		//Create variables
		String name;
		String surname;
		int age;
		
		Scanner input = new Scanner (System.in);
		
		//ask for data String type
		System.out.println("Introduce your name");
		name = input.nextLine();
		//ask for data String type
		System.out.println("Introduce your surname");
		surname = input.nextLine();
		//ask for age int type
		System.out.println("Introduce yor age");
		age = input.nextInt();
		
		
		//print results
		System.out.println(name);
		System.out.println(surname);
		System.out.println(age);
	
	
		

		
		
	}

}
