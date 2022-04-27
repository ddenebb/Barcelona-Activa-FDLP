
public class Mechanic extends TeamMember{
	private String studies;
	private int wage;
	
	
	public Mechanic( String name, String surname, int age,  int career, String studies) {
	super (name, surname, age, career);
	this.studies = studies;
	this.wage = calcWage(career);
	}
	
	public Mechanic(String name, String surname, int age, String studies) {
		super (name, surname, age);
		this.wage = 50000;
		this.studies = studies;
		}
	
	public String toString() {
		return super.toString()+", " + wage+", " + "Superior studies: " +studies;
	}
	
	public int getWage() {
		return wage;
	}

	public void setWage(int wage) {
		this.wage = wage;
	}
	
	public int calcWage(int career) {
		int baseWage = 50000;
		int wage = (baseWage * career);
		return wage;
	}


	public String getStudies() {
		return studies;
	}

	public void setStudies(String studies) {
		this.studies = studies;
	}
}

