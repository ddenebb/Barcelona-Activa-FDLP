
public class Hospital extends Building{	
	
	int numOfPatients;
	
 	Hospital (String type, String name, int numOfFloors, int areaSqM){
 		super (type, name, numOfFloors, areaSqM);
	}

 	public int getNumOfPatients() {
		return numOfPatients;
	}
	public void setNumOfPatients(int numOfPatients) {
		this.numOfPatients = numOfPatients;
	}
 	public int calcNumOfMeals(){

			int numOfMeals = numOfPatients * 3;
			return numOfMeals;
		}

}
