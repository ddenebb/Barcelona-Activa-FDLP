import java.util.ArrayList;
import java.util.Scanner;

public class App {

static ArrayList<Hotel> hotelList = new ArrayList<Hotel>();

	
	public static void main(String[] args) {
		
		int userChoice = getNumber("This program helps you register, unregister, modify and check hotel data. "
				+ "Enter choice: "
				+ "\n"
				+ "1.- Check hotel data"
				+ "\n"
				+ "2.- Modify hotel data"
				+ "\n"
				+ "3.- Register new hotel"
				+ "\n"
				+ "4.- Unregister hotel"
				+ "\n"
				+ "0.- Exit program");
		
				
				
				while(userChoice > 0) {
					String name = (getStr("enter hotel name"));
					int index = evaluateHotelName(name);
					hotelSelectorlDataInput(userChoice, name, index);
					userChoice = getNumber("\n" + "Do another operation or press 0 to exit program");
						
				}System.out.println("Exiting program...Bye!!!");
	}

	static int getNumber(String message){
		Scanner input = new Scanner(System.in);
		System.out.println(message);
		int numberEntered = input.nextInt();
		return numberEntered;
	}
	
	static String getStr(String message){
		Scanner input = new Scanner(System.in);
		System.out.println(message);
		String StrEntered = input.nextLine();
		return StrEntered;
	}
	
	static int evaluateHotelName(String name) {
		int i = 0;
		int index = -1;
		boolean found = false;
		if (hotelList.isEmpty() == false) {
			String dbname = hotelList.get(0).getName();
		
			while(i < hotelList.size()){
				dbname = hotelList.get(i).getName();
				if(dbname.equals(name) && found == false){
				index = i ;
				found = true;
			}i++;
			}
		}
		return index;
	}
	
	static void printAttributes(int index) {
		if (index != -1){	
			Hotel H1 = hotelList.get(index);
		System.out.println(H1.getRoomNum());
		System.out.println(H1.getFloorNum());
		System.out.println(H1.getAreaSqM());
		System.out.println(H1.calcMaintenance());
		}
	}
	
	static void viewHotels(int index){
		if (index != -1) {
			printAttributes(index);
		} else {
			System.out.println("Hotel not present in database");
		}
	}

	static void modifyHotels(int index) {
		if (index != -1) {
				modifyHotelsMenu(index);	
		} else {
			System.out.println("Hotel not present in database");
		}
	}
	
	static void createHotels(String name, int roomNum, int floorNum, int areaSqM, int index){
		if (index == -1) {
		Hotel h1 = new Hotel(name, roomNum, floorNum, areaSqM);
		hotelList.add(h1);
		System.out.println("Hotel " + name + " has been registered");
		} else {
			System.out.println("Hotel already present in database");
		}
	}
	
	static void removeHotels(int index){
		if (index != -1){
		hotelList.remove(index);
		System.out.println("Hotel selected has been removed");
		} else {
			System.out.println("Hotel not present in database");
		}
	}
	
	static void hotelSelectorlDataInput(int userChoice, String name, int index) {
		if (userChoice != 0) {
		}	
		switch (userChoice) {
				case (1):
					viewHotels(index);
					break;
				case (2):
					modifyHotels(index);
					break;
				case (3):
					int roomNum = (getNumber("enter number of rooms"));
					int floorNum = (getNumber("enter number of floors")); 
					int areaSqM = (getNumber("enter area in Sq m"));
					createHotels(name, roomNum, floorNum, areaSqM, index);
					break;
				case (4):
					removeHotels(index);
					break;
				default:
					getNumber("Error: enter number between 1 and 4....Or enter 0 to get out of the program ");
			}
		}
	
	static void modifyHotelsMenu(int index) {
		if (index != -1){
		Hotel H1 = hotelList.get(index);
		int userChoice = getNumber("Menu for modifying hotel data. "
				+ "Enter choice: "
				+ "\n"
				+ "1.- Modify hotel's name"
				+ "\n"
				+ "2.- Modify hotel's  number of rooms"
				+ "\n"
				+ "3.- Modify hotel's  number of floors"
				+ "\n"
				+ "4.- Modify hotel's area in sq m"
				+ "\n"
				+ "0.- Exit Modify menu");
			
		if (userChoice != 0) {
			if(userChoice < 0 || userChoice > 4) {
				userChoice = (getNumber("Error: enter number between 1 and 4....Or enter 0 to get out of the Modify menu "));	
			}
		switch (userChoice) {
				case (1):
					String newName = (getStr("Enter hotel´s new name"));
					H1.setName(newName);
					System.out.println("Hotel´s name has been modified");
					break;
				case (2):
					int roomNum = (getNumber("Enter hotel´s new number of rooms"));
					H1.setRoomNum(roomNum);
					System.out.println("Hotel´s number of rooms has been modified");	
					break;
				case (3):
					int floorNum = (getNumber("Enter hotel´s new number of floors")); 
					H1.setFloorNum(floorNum);
					System.out.println("Hotel´s number of floors has been modified");
					break;
				case (4):
					int areaSqM = (getNumber("Enter hotel´s new area in Sq m"));
					H1.setAreaSqM(areaSqM);
					System.out.println("Hotel´s area in sq m has been modified");
					break;
				default:
					userChoice = (getNumber("Error: enter number between 1 and 4....Or enter 0 to get out of the program "));
			} 
		}
	}
	}
}
