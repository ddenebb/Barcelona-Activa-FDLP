import java.util.ArrayList;
import java.util.Scanner;

public class App {

static ArrayList<Customer> customerList = new ArrayList<Customer>();

	public static void main(String[] args) {
		ArrayList<CC> accList = new ArrayList<CC>();
				
		int userChoice = getNumber("MENU"
			+ "\n"
			+ "Enter choice: "
			+ "\n"
			+ "1.- Register new customer"
			+ "\n"
			+ "2.- Remove customer"
			+ "\n"
			+ "3.- Create new account"
			+ "\n"
			+ "4.- Deposit money into a customer account"
			+ "\n"
			+ "5.- Withdraw money from a customer's account"
			+ "\n"
			+ "0.- Exit program");
						
			while(userChoice > 0) {
				String name = (getStr("Enter customer´s name "));
				String surname = (getStr("Enter customer´s surname "));
				Customer accHolder = getCustomer(evaluateCustomerName(surname, name));
				
				customerSelDataInput(userChoice, surname, name, accHolder);
				userChoice = getNumber("\n" + "Do another operation or press 0 to exit program");
								
			}
			System.out.println("Exiting program...Bye!!!");
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
			
	static int evaluateCustomerName(String surname, String name) {
		int index = -1;
		boolean found = false;
		if (customerList.isEmpty() == false) {
			String dbSurname = customerList.get(0).getSurname();
			String dbName = customerList.get(0).getName();
			int i = 0;
		while(i < customerList.size() && found == false){
			dbSurname = customerList.get(i).getSurname();
			dbName = customerList.get(i).getName();
			if(dbSurname.equals(surname) && dbName.equals(name)){
				index = i ;
				found = true;
			}i++;
			}
		}		
		return index;
	}
			
	static Customer getCustomer(int index) {
		Customer accHolder = new Customer();
		if (index != -1) {
			accHolder = customerList.get(index);
		}
		return accHolder;
	}		
			
	static void registerNewCustomer(String surname, String name){
		if (evaluateCustomerName(surname, name) == -1){
			ArrayList<CC>accList = new ArrayList<CC>();
			Customer newCustomer = new Customer(surname, name, accList);
		customerList.add(newCustomer);
		System.out.println("New customer " + name + " " + surname + " has been registered");
		System.out.print(customerList);
		} else { System.out.println("Customer  " + name + " " + surname + " can´t be registered: already in database");
		}
	}
			
	static void removeCustomer(String surname, String name, Customer accHolder){
		if (evaluateCustomerName(surname, name) != -1){
			customerList.remove(accHolder);
		System.out.println("Customer " + accHolder.getName() + " " + accHolder.getSurname() + " has been removed");
		System.out.print(customerList);
		} else {
			System.out.println("Customer not present in database");
		}
	}
	
	static int checkAccount(int accNum, ArrayList<CC> accList) {
		int dbAccNum;
		int i = 0;
		int index = -1;
		boolean found = false;
		while(i < accList.size() && found == false){
			dbAccNum = accList.get(i).getAccNumber();
			if(dbAccNum == accNum){
				index = i ;
				found = true;
			}i++;
			}
		return index;
	}
	
	static int setAccountNumber(ArrayList<CC> accList) {
		int dbAccNum;
		int accNumber = 0;
		if (!accList.isEmpty()){
			dbAccNum = accList.get(accList.size()-1).getAccNumber();
			accNumber = dbAccNum+1;
			}
		return accNumber;
	}
	
	static void createNewAccount(Customer accHolder){
		if(customerList.isEmpty() == false) {
			ArrayList<CC> accList = accHolder.getAccList();
			int accNumber = setAccountNumber(accList);
			double accBalance = 0.00;
			CC newAcc = new CC(accHolder, accNumber, accBalance);
			accList.add(newAcc);
			System.out.println("New account number " + accNumber + " has been created for customer " + accHolder);	
			System.out.println(accList);
		} else {
			System.out.println("New account can´t be created as database has no customers registered yet");
		}
			
	}
	
	static void deposit(Customer accHolder){
		int accNum = getNumber("Enter account number");
		if (accHolder.getAccList().isEmpty() == false) {
			if (checkAccount(accNum, accHolder.getAccList()) != -1) {
				double amount = getNumber("Enter amount to be deposited in €");
				accHolder.deposit(accNum, amount);
				System.out.println("An amount of " + amount + " € has been paid into " + accHolder.getName() + " " + accHolder.getSurname() + " account number " + accNum);
			}
		} else {
			 System.out.println("Account number " + accNum + " does not exist");
			
		}
	}
	
	static void withdrawal(Customer accHolder){
		int accNum = getNumber("Enter account number");
		if (accHolder.getAccList().isEmpty() == false) {
			if (checkAccount(accNum, accHolder.getAccList()) != -1) {
				double amount = getNumber("Enter amount to be withdrawn in €");
				accHolder.withdrawal(accNum, amount);
				System.out.println("An amount of " + amount + " € has been taken from  " + accHolder.getName() + " " + accHolder.getSurname() + " account number " + accNum);
			}
		} else {
			 System.out.println("Account number " + accNum + " does not exist");
		}
	}
	
	static double getAccBalance(Customer accHolder){
	int accNum = getNumber("Enter account number");
	return accHolder.getAccBalance(accHolder, accNum);
	}
			
	static void customerSelDataInput(int userChoice, String surname, String name, Customer accHolder) {
		if (userChoice != 0) {
		}	
		switch (userChoice) {
				case (1):
					registerNewCustomer(surname, name);
					break;
				case (2):
					removeCustomer(surname, name, accHolder);
					break;
				case (3):
					createNewAccount(accHolder);				
					break;
				case (4):
					deposit(accHolder);
					break;
				case (5):
					withdrawal(accHolder);
					break;
				default:
					getNumber("Error: enter number between 1 and 5....Or enter 0 to get out of the program ");
		}
	}	
}



