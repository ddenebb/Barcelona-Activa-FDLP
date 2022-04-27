
public class RacingCar {
	

	private String power;
	private String maxSpeed;
	private String color;
	private int price;
	
	
	public RacingCar () {
		power = "Default";
		maxSpeed = "Default";
		color = "Default";
		price= 0;
	}
	
	public RacingCar (String power, String maxSpeed,String color, int price) {
		this.power = power;
		this.maxSpeed = maxSpeed;
		this.color = color;
		this.price = price;
	}
	public String getPower() {
		return power;
	}

	public void setPower(String power) {
		this.power = power;
	}

	public String getMaxSpeed() {
		return maxSpeed;
	}

	public void setMaxSpeed(String maxSpeed) {
		this.maxSpeed = maxSpeed;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	public String toString() {
		return power+" "+maxSpeed+" "+color+" "+price;
	}

}

