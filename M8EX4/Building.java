
abstract public class Building {
	protected  String type;
	protected String name;
	protected  int numOfFloors;
	protected  int areaSqM;
	
	//Building(){
	//type = "Default";
	//name = "Default";
	//numOfFloors = 0;
	//areaSqM = 0;
	//}

	public Building (String type, String name, int numOfFloors, int areaSqM){
		this.type = type;
		this.name = name;
		this.numOfFloors = numOfFloors;
		this.areaSqM = areaSqM;
	}
	//getters
	public String getType() {
		return type;
	}

	public String getName() {
		return name;
	}
	public int getNumOfFloors() {
		return numOfFloors;
	}
	public int getAreaSqM() {
		return areaSqM;
	}
	//setters
	public void setNumOfFloors(int numOfFloors) {
		this.numOfFloors = numOfFloors;
		}
	public void setType(String type) {
		this.type = type;
		}
	public void setName(String name) {
		this.name = name;
	}
	public void setAreaSqM(int areaSqM) {
		this.areaSqM = areaSqM;
	}
	public double calcCleaning () {
		double cleaningTimeInMin = ((areaSqM / 5) + (numOfFloors * 0.5));
		return cleaningTimeInMin;
	}
	public double calcSurveillance (double areaCovered, double wage) {
	
		double numOfWatchmen = ((areaSqM / areaCovered));
		double budgetSurv = (double) numOfWatchmen * wage;
		return budgetSurv;
	}
	
	
}
/*
}*/

