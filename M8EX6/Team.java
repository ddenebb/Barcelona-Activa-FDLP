import java.util.ArrayList;
import java.util.Scanner;
public class Team {
	private String name;
	private double budget;
	private String country;
	private ArrayList<RacingCar> racingCarList;
	private ArrayList<TeamMember> teamMemberList;

	public Team() {
	name = "default";
	budget = 0;
	country = "default";
	racingCarList = new ArrayList<RacingCar>();
	teamMemberList = new ArrayList<TeamMember>();
	}
	public Team(String name, double budget, String country, ArrayList<RacingCar> racingCarList, ArrayList<TeamMember> teamMemberList) {
		this.name = name;
		this.budget = budget;
		this.country = country;
		this.racingCarList = racingCarList;
		this.teamMemberList = teamMemberList;
		}
	public Team(String name, double budget, String country) {
		this.name = name;
		this.budget = budget;
		this.country = country;
		racingCarList = new ArrayList<RacingCar>();
		teamMemberList = new ArrayList<TeamMember>();
		}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getBudget() {
		return budget;
	}
	public void setBudget(double budget) {
		this.budget = budget;
	}
	public String getCountry() {
		return country;
	}
	public String toString() {
		return ("name: " + name + "\n" + "budget: " + budget + "\n" + "country: " + country + "\n" + "team members :" + teamMemberList + "\n" + "racing cars : " + racingCarList);
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public ArrayList<RacingCar> getRacingCarList() {
		return racingCarList;
	}
	public void setRacingCarList(ArrayList<RacingCar> racingCarList) {
		this.racingCarList = racingCarList;
	}
	public ArrayList<TeamMember> getTeamMemberList() {
		return teamMemberList;
	}
	public void setTeamMemberList(ArrayList<TeamMember> teamMemberList) {
		this.teamMemberList = teamMemberList;
	}
	
	/*public void addTeamMember (String surname, String name, int age){
		TeamMember TM1 = new TeamMember(surname, name, age);
		teamMemberList.add(TM1);	
	}*/
	
	public void removeTeamMember (int index){
		teamMemberList.remove(index);	
	}
	
	public void addRacingCar(RacingCar RC1){
		racingCarList.add(RC1);	
	}
	
	public void removeRacingCar(RacingCar RC1){
		racingCarList.remove(RC1);	
	}
	
	public int evaluateTeamMember(String surname, String name) {
		int index = -1;
		boolean found = false;
		if (teamMemberList.isEmpty() == false) {
			String dbSurname = teamMemberList.get(0).getSurname();
			String dbName = teamMemberList.get(0).getName();
			int i = 0;
		while(i < teamMemberList.size() && found == false){
			dbSurname = teamMemberList.get(i).getSurname();
			dbName = teamMemberList.get(i).getName();
			if(dbSurname.equals(surname) && dbName.equals(name)){
				index = i ;
				found = true;
			}i++;
			}
		}		
		return index;
	}
	
	public int evaluateRacingCar() {
		String power = getStr("Enter racing car´s power");
		int index = -1;
		boolean found = false;
		if (racingCarList.isEmpty() == false) {
			String dbPower = racingCarList.get(0).getPower();
			int i = 0;
		while(i < racingCarList.size() && found == false){
			dbPower = racingCarList.get(i).getPower();
			if(dbPower.equals(power)){
				index = i ;
				found = true;
			}i++;
			}
		}		
		return index;
	}
			
	/*static TeamMember getTeamMember(Team T1, int index) {
		TeamMember TM1 = new TeamMember();
		if (index != -1) {
			TM1 = T1.getTeamMemberList().get(index);
		}
		return TM1;
	}	*/	
	public void showTeam() {
		System.out.println(toString());
	}
			
	public void registerNewTeamMember(){
		String name = (getStr("Enter team member´s name "));
		String surname = (getStr("Enter team member´s surname "));

		if (evaluateTeamMember( surname, name) == -1){
			int age = getNumber("Enter age");
			String parseRol = getStr("Enter Driver / Mechanic");
			if (parseRol.equals("Driver")) {
				double height = (double)getNumber("Enter driver´s height");	
				double weight = (double)getNumber("Enter driver´s weight");	
				Driver newDriver = new Driver(surname, name, age, height, weight);
				teamMemberList.add(newDriver);
				System.out.println("New driver " + name + " " + surname + " has been registered");
				System.out.print(teamMemberList);
			}else if (parseRol.equals("Mechanic")) {
					String studies = getStr("Superior studies: yes/ no");		
					Mechanic newMechanic = new Mechanic(name, surname, age, studies);
					teamMemberList.add(newMechanic);
					System.out.println("New mechanic " + name + " " + surname + " has been registered");
					System.out.print(teamMemberList);
			} else { System.out.println("Team member  " + name + " " + surname + " can´t be registered: already in database");
			}
		}
	}
			
	public void removeTeamMember(){
		String name = (getStr("Enter team member´s name "));
		String surname = (getStr("Enter team member´s surname "));
		int index = evaluateTeamMember(surname, name);
		if ( index != -1){
			teamMemberList.remove(index);
		System.out.println("Team member " + name + " " + surname + " has been removed");
		System.out.print(teamMemberList);
		} else {
			System.out.println("Team member not present in database");
		}
	}
	
	public void showTeamMember(){
		String name = (getStr("Enter team member´s name "));
		String surname = (getStr("Enter team member´s surname "));
		int index = evaluateTeamMember(surname, name);
		if ( index != -1){
			teamMemberList.get(index);
		System.out.println(teamMemberList.get(index));
	
		} else {
			System.out.println("Team member not present in database");
		}
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
	
	public void showRacingCar(){
		int index = evaluateRacingCar();
		if ( index != -1){
			racingCarList.get(index);
		System.out.println(racingCarList.get(index).toString());
	
		} else {
			System.out.println("Car not present in database");
		}
	}
}


