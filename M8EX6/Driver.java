
public class Driver extends TeamMember{
	private double height;
	private double weight;
	private int wage;
	
	
	public Driver(String name, String surname, int age,  int career, double height, double weight) {
	super (name, surname, age, career);
	this.wage = calcWage(career);
	this.height = height;
	this.weight = weight;
	}
	
	public Driver(String name, String surname, int age, double height, double weight) {
		super (name, surname, age);
		this.wage = 50000;
		this.height = height;
		this.weight = weight;
		}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}
	
	public String toString() {
		return super.toString()+", " + wage+", " + height+", "+weight;
	}
	
	public int getWage() {
		return wage;
	}

	public void setWage(int wage) {
		this.wage = wage;
	}
	
	public int calcWage(int career) {
		int baseWage = 50000;
		int wage = (baseWage * career) + 50000;
		return wage;
	}


	
}


