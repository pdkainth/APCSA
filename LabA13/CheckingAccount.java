
public class CheckingAccount {

	private double myBalance;
	private int myAccountNumber;
	
	public CheckingAccount() {
		myBalance = 0.0;
		myAccountNumber = 0;
	}
	
	public CheckingAccount(double initialBalance, int acctNum) {
		myAccountNumber = acctNum;

		if(initialBalance < 0) {
			throw new ArithmeticException("Negative balance in account " + myAccountNumber);
		} else {
			myBalance = initialBalance;
		}
	}
	
	public double getBalance() {
		return myBalance;
	}
	
	public void deposit(double amount) {
		if(amount < 0) {
			throw new ArithmeticException("Negative amount deposited in account " + myAccountNumber);
		} else {
			myBalance += amount;
		}
	}
	
	public void withdraw(double amount) {
		if(amount > myBalance) {
			throw new ArithmeticException("Account " + myAccountNumber + " overdrawn");
		} else {
			myBalance -= amount;
		}
	}
	
}
