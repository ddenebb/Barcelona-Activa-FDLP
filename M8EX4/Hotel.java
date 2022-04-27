
public class Hotel extends Building{
	
	int numOfRooms;
	


	Hotel (String type, String name, int numOfFloors, int areaSqM, int numOfRooms){
		super (type, name, numOfFloors, areaSqM);
		this.numOfRooms = numOfRooms;
	}
	
	public int getNumOfRooms() {
		return numOfRooms;
	}
	
	public int calcService (int numOfServiceMembers) {
		int budgetService =  numOfServiceMembers * 1000;
		return budgetService;
	}
}
/*Room service is provided daily at the hotel. It is estimated that each service member can accommodate 20 rooms. 
 * A method will be created that calculates, and displays on screen: 
 * a) How many people are needed to attend the hotel room service. 
 * b) What is the total amount required for the salaries of these people, taking into account that 
 * each person receives 1,000 euros per month.
 * 
 * */
