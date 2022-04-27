
public class TeamMember {

	private String surname;
	private String name;
	private int age;
	private int career;
	
	/*public TeamMember() {
		surname = "Default";
		name = "Default";
		age = 0;
		career = 0;
		wage = 50000;
	}*/
	
	public TeamMember(String name, String surname, int age, int career) {
		this.surname = surname;
		this.name = name;
		this.age = age;
		this.career =  career;
	}
	public TeamMember(String name, String surname, int age) {
		this.surname = surname;
		this.name = name;
		this.age = age;
		career = 0;
	}
	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String toString() {
		return name+" "+surname+", "+ age +", "+career;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getCareer() {
		return career;
	}

	public void setCareer(int career) {
		this.career = career;
	}

}
