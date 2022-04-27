import java.util.ArrayList;
import java.util.Scanner;

public class App {

static ArrayList<Team> teamList = new ArrayList<Team>();

	public static void main(String[] args) {
		ArrayList<RacingCar>racingCarListT1 = new ArrayList<RacingCar>();
		RacingCar Ferrari1 = new RacingCar("1000 HP", "290km/h", "red", 500000);
		RacingCar Ferrari2 = new RacingCar("980 HP", "270km/h", "red and white", 400000);
		racingCarListT1.add(Ferrari1);
		racingCarListT1.add(Ferrari2);
		ArrayList<TeamMember>teamMemberListT1 = new ArrayList<TeamMember>();
		TeamMember driver1 = new Driver("Charles", "Leclerc", 38, 2, 68.2, 1.73);
		TeamMember driver2 = new Driver("Carlos", "Sainz", 27, 1, 70.4, 1.77);
		TeamMember mechanic1 = new Mechanic("Jose", "Garcia", 25, 5, "yes");
		TeamMember mechanic2 = new Mechanic("Ahmed", "Ali", 45, 20, "no");
		teamMemberListT1.add(driver1);
		teamMemberListT1.add(driver2);
		teamMemberListT1.add(mechanic1);
		teamMemberListT1.add(mechanic2);
		Team Team1 = new Team("Ferrari", 2000000, "Italy", racingCarListT1, teamMemberListT1);
		
		ArrayList<RacingCar>racingCarListT2 = new ArrayList<RacingCar>();
		RacingCar McLaren1 = new RacingCar("1020 HP", "295km/h", "white", 450000);
		RacingCar McLaren2 = new RacingCar("990 HP", "280km/h", "white", 420000);
		racingCarListT2.add(McLaren1);
		racingCarListT2.add(McLaren2);
		ArrayList<TeamMember>teamMemberListT2 = new ArrayList<TeamMember>();
		TeamMember driver3 = new Driver("Daniel", "Ricciardo", 25, 3, 72.3, 1.79);
		TeamMember driver4 = new Driver("Landon", "Norris", 23, 2, 75.1, 1.82);
		TeamMember mechanic3 = new Mechanic("John", "Smith", 33, 10, "yes");
		TeamMember mechanic4 = new Mechanic("Steve", "Jones", 35, 12, "no");
		teamMemberListT2.add(driver3);
		teamMemberListT2.add(driver4);
		teamMemberListT2.add(mechanic3);
		teamMemberListT2.add(mechanic4);
		Team Team2 = new Team("McLaren", 1000000, "UK", racingCarListT2, teamMemberListT2);
		
		ArrayList<RacingCar>racingCarListT3 = new ArrayList<RacingCar>();
		RacingCar RedBull1 = new RacingCar("1050 HP", "300km/h", "orange", 480000);
		RacingCar RedBull2 = new RacingCar("1010 HP", "285km/h", "orange", 4350000);
		racingCarListT3.add(RedBull1);
		racingCarListT3.add(RedBull2);
		ArrayList<TeamMember>teamMemberListT3 = new ArrayList<TeamMember>();
		TeamMember driver5 = new Driver("Max", "Verstappen", 29, 3, 77.8, 1.81);
		TeamMember driver6 = new Driver("Sergio", "Pérez", 22, 2, 68.4, 1.76);
		teamMemberListT3.add(driver5);
		teamMemberListT3.add(driver6);
		Team Team3 = new Team("RedBull", 1000000, "USA", racingCarListT3, teamMemberListT3);
		teamList.add(Team1);
		teamList.add(Team2);
		teamList.add(Team3);
		
				
		int userChoice = getNumber("MENU"
			+ "\n"
			+ "Enter choice: "
			+ "\n"
			+ "1.- Register new team member"
			+ "\n"
			+ "2.- Remove team member"
			+ "\n"
			+ "3.- Show team member"
			+ "\n"
			+ "4.- Show team"
			+ "\n"
			+ "5.- Show racing car"
			+ "\n"
			+ "0.- Exit program");
						
			while(userChoice > 0) {
				String teamName = getStr("Enter Team´s name");
				int index = evaluateTeam(teamName);
				
				menu(userChoice, index);
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
	
	static int evaluateTeam(String name) {
		int index = -1;
		boolean found = false;
		if (teamList.isEmpty() == false) {
			String dbName = teamList.get(0).getName();
			int i = 0;
		while(i < teamList.size() && found == false){
			dbName = teamList.get(i).getName();
			if( dbName.equals(name)){
				index = i ;
				found = true;
			}i++;
			}
		}		
		return index;
	}
	
	static void menu(int userChoice, int index) {
		if (userChoice != 0) {
		}
			if (index != -1) {
				Team T1  = teamList.get(index);
				switch (userChoice) {
		
					case (1):
						T1.registerNewTeamMember();
						break;
					case (2):
						T1.removeTeamMember();
						break;
					case (3):
						T1.showTeamMember();
						break;
					case (4):
						T1.showTeam();	
						break;
					case (5):
						T1.showRacingCar();	
						break;
					default:
						getNumber("Error: enter number between 1 and 5....Or enter 0 to get out of the program ");
		}
			} else {
				System.out.println("Team not present in database");
			}
	}	
}



