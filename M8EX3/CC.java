
public class CC {
	private Customer accHolder;
	private int accNumber;
	private double accBalance;
	
	public CC(Customer accHolder, int accNumber, double accBalance) {
		this.accHolder = accHolder;
		this.accNumber = accNumber;
		this.accBalance = accBalance;
	}	
	
	public CC(Customer accHolder) {
		this.accHolder = accHolder;
		this.accNumber = (int) Math.random() * 3;
		this.accBalance = 0.00;
	}
	
	public int getAccNumber() {
		return(accNumber);
	}
	
	public void setAccNumber(int accNumber) {
		this.accNumber = accNumber;	
	}
	
	public void deposit(double amount){
		accBalance = accBalance + amount;
		}
	
	public void withdrawal(double amount){
		if (isBalanceEnough(amount))
			accBalance = accBalance + amount;
		}
		
	private boolean isBalanceEnough(double amount){
		return amount <= accBalance;
		}
		
	public double getAccBalance(int accNum) {
		return (accBalance);
	}

	public Customer getAccHolder() {
		return accHolder;
	}

	public void setAccHolder(Customer accHolder) {
		this.accHolder = accHolder;
	}
}
