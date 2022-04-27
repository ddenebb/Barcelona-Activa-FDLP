public class Hotel {

	private String name;
	private int roomNum;
	private int floorNum;
	private int areaSqM;
	
	public Hotel() {
	name = "default";
	roomNum = 0;
	floorNum = 0;
	areaSqM = 0;
	}
	public Hotel(String name, int roomNum, int floorNum, int areaSqM) {
		this.name = name;
		this.roomNum = roomNum;
		this.floorNum = floorNum;
		this.areaSqM = areaSqM;
		}

	
//getter methods
public String getName() {
	return(name);
}
public int getRoomNum() {
	return(roomNum);
}
public int getFloorNum() {
	return(floorNum);
}	
public int getAreaSqM() {
	return(areaSqM);
}
public String toString(){ 
	  return (name+" "+roomNum+" "+floorNum+" "+areaSqM);  
}

//setter methods
public void setName(String name) {
	this.name = name;
}
public void setRoomNum(int roomNum) {
	this.roomNum = roomNum;
}
public void setFloorNum(int floorNum) {
	this.floorNum = floorNum;
}
public void setAreaSqM(int areaSqM) {
	this.areaSqM = areaSqM;
}
//calculate maintenance method
public String calcMaintenance() {
	double employeeNum = ((double)roomNum/20);
	double budget = employeeNum * 1500;
	
	return("Number of employees needed to run hotel is " + employeeNum + " and the budget to keep it going in € is " + budget);
}


}


