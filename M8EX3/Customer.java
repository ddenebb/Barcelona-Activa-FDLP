import java.util.ArrayList;

public class Customer {
	private String surname;
	private String name;
	private ArrayList<CC> accList;

	public Customer() {
	surname = "default";
	name = "default";
	accList = new ArrayList<CC>();
	}
	public Customer(String surname, String name, ArrayList<CC> accList) {
		this.surname = surname;
		this.name = name;
		this.accList = accList;
		}
	public Customer(String surname, String name) {
		this.surname = surname;
		this.name = name;
		}
	public Customer(ArrayList<CC> accList) {
		this.accList = accList;
		}
	
//getter methods
	public String getSurname() {
		return(surname);
	}
	public String getName() {
		return(name);
	}
	public ArrayList<CC> getAccList() {
		return(accList);
	}
	public String toString(){ 
		return (name + " " + surname);  
	}

	//accounts
	public int deposit(int index, double amount) {
		accList.get(index).deposit(amount);
		int accNumber = accList.get(index).getAccNumber();
		return accNumber;
	}
	public void withdrawal(int index, double amount) {
		accList.get(index).withdrawal(amount);
	
	}
	public double getAccBalance(Customer accHolder, int accNum) {
		double accBalance = accList.get(accNum).getAccBalance(accNum);
		return (accBalance);
	}
}

