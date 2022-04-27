import java.util.ArrayList;
import java.util.Scanner;

public class App {
	
static ArrayList<Building> buildingList = new ArrayList<Building>();


	public static void main(String[] args) {
		
		int userChoice = getNumber("MENU"
				+ "\n"
				+ "Enter choice: "
				+ "\n"
				+ "1.- Register new building"
				+ "\n"
				+ "2.- Show building"
				+ "\n"
				+ "3.- Remove building"
				+ "\n"
				+ "0.- Exit program");
		
							
				while(userChoice > 0) {
					String type = (getStr("Enter building´s type "));
					String name = (getStr("Enter building´s name "));
					int index = evaluateBuildingName (type, name);
					buildingMenu(userChoice, type, name, index);
					userChoice = getNumber("\n" + "Do another operation or press 0 to exit program");	
				}
				System.out.println("Exiting program...Bye!!!");
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
		
		static int evaluateBuildingName (String type, String name){
			int i = 0;
			int index = -1;
			boolean found = false;
			while(i < buildingList.size() && found == false){
				String dbType = buildingList.get(i).getType();
				String dbName = buildingList.get(i).getName();
				if(dbType.equals(type) && dbName.equals(name)){
					index = i ;
					found = true;
			}i++;
			}
		return index;		
		}
		
		static void registerBuilding(String type, String name) {
			if (evaluateBuildingName(type, name) == -1) {
				if(type.equals("hotel")){
					createHotel(type, name);
				} else if (type.equals("hospital")){
					createHospital(type, name);
				} else if (type.equals("cinema")){
					createCinema(type, name);
				} else {
					System.out.println("Error: building type should be hotel/hospital/cinema");
				}
			} else {
				System.out.println("Error: Building already exists in database");
				}
		}
		
		static void removeBuilding(String type, String name, int index){
			if (evaluateBuildingName(type, name) != -1){
				buildingList.remove(index);
			System.out.println("Building of type " + type + " " + name + " has been removed from database");
			System.out.print(buildingList);
			} else {
				System.out.println("Building not present in database");
			}
		}
		
		static void showBuilding(String type, String name, int index){
			if (evaluateBuildingName(type, name) != -1){
			if (buildingList.get(index).type.equals("hotel")){
				Hotel H1 = (Hotel)buildingList.get(index);
				
				double cleaningBudgetInEuro = H1.calcCleaning() * 30;
				System.out.println("Daily cleaning time is " + H1.calcCleaning() + " and the monthly budget in Euros is " + cleaningBudgetInEuro);
				
				double areaCovered = 1000;
				double wage =1800;
				System.out.println("Surveillance monthly budget in Euros is " + H1.calcSurveillance(areaCovered, wage));
				
				int numOfServiceMembers = ((H1.getNumOfRooms() / 20));
				System.out.println("For " + type + " " + name + " the number of service workers is " + numOfServiceMembers + " and service monthly budget in Euros is " + H1.calcService(numOfServiceMembers));

			} else if (buildingList.get(index).type.equals("hospital")){
				Hospital HH1 = (Hospital)buildingList.get(index);
				
				double cleaningBudgetInEuro = HH1.calcCleaning() * 30;
				System.out.println("Daily cleaning time is " + HH1.calcCleaning() + " and the monthly budget in Euros is " + cleaningBudgetInEuro);
				
				double areaCovered = 1000;
				double wage =1300;
				System.out.println("Surveillance monthly budget in Euros is " + HH1.calcSurveillance(areaCovered, wage));

				HH1.setNumOfPatients(getNumber("Enter number of patients"));
				System.out.println("For " + type + " " + name + " today´s total number of meals is " + HH1.calcNumOfMeals());

				
			} else if(buildingList.get(index).type.equals("cinema")){
					Cinema C1 = (Cinema)buildingList.get(index);
					
					double cleaningBudgetInEuro = C1.calcCleaning() * 30;
					System.out.println("Daily cleaning time is " + C1.calcCleaning() + " and the monthly budget in Euros is " + cleaningBudgetInEuro);
					
					double areaCovered = 3000;
					double wage = 1300;
					System.out.println("Surveillance monthly budget in Euros is " + C1.calcSurveillance(areaCovered, wage));

					C1.setNumOfAssistants(getNumber("Enter number of assistants"));
					C1.setTicketPrice(getNumber("Enter ticket price"));
					C1.movieSession();
					
			} else {
				System.out.println("Building not present in database");
			}
		}
	}
		
		static void createHotel(String type, String name){
			
			if (evaluateBuildingName(type, name) == -1){
				int numOfFloors = getNumber("Enter number of floors");
				int areaSqM = getNumber("Enter area in square meter");
				int numOfRooms = getNumber("Enter number of rooms");
				Hotel H1 = new Hotel(type, name, numOfFloors, areaSqM, numOfRooms);
			buildingList.add(H1);
			System.out.println("New building of type " + type + " " + name + " has been registered");
			System.out.print(buildingList);
				} else { System.out.println("building of type " + type + " " + name + " can´t be registered: already in database");
			}
		}
		
		static void createHospital(String type, String name){
			if (evaluateBuildingName(type, name) == -1){
				if (type.equals("hospital")) {
				int numOfFloors = getNumber("Enter number of floors");
				int areaSqM = getNumber("Enter area in square meter");
				Hospital HH1 = new Hospital(type, name, numOfFloors, areaSqM);
			buildingList.add(HH1);
			System.out.println("New building of type " + type + " " + name + " has been registered");
			System.out.print(buildingList);
				} else { System.out.println("building of type " + type + " " + name + " can´t be registered: already in database");
				}
			}
		}
		
		static void createCinema(String type, String name){	
			if (evaluateBuildingName(type, name) == -1){
				if (type.equals("cinema")) {
				int numOfFloors = getNumber("Enter number of floors");
				int areaSqM = getNumber("Enter area in square meter");  
				int maxCapacity = getNumber("Enter maximum capacity");
				Cinema C1 = new Cinema(type, name, numOfFloors, areaSqM, maxCapacity);
			buildingList.add(C1);
			System.out.println("New building of type " + type + " " + name + " has been registered");
			System.out.print(buildingList);
				} else { System.out.println("building of type " + type + " " + name + " can´t be registered: already in database");
				}
			}
		}
		
		static void buildingMenu(int userChoice, String type, String name, int index) {
			if (userChoice != 0) {
			}	
			switch (userChoice) {
					case (1):
						registerBuilding(type, name);
						break;
					case (2):
						showBuilding(type, name, index);
						break;
					case (3):
						removeBuilding(type, name, index);				
						break;
					default:
						getNumber("Error: enter number between 1 and 5....Or enter 0 to get out of the program ");
			}
		}
}


		
		
	

