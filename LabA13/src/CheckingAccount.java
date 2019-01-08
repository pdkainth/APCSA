/**
 * 
 * @author Prabhdeep Kainth
 * Period # 4
 */

public class CheckingAccount {

	private double myBalance;
	private int myAccountNumber;
	
	/**
	 * Default constructor for CheckingAccount class
	 */
	public CheckingAccount() {
		myBalance = 0.0;
		myAccountNumber = 0;
	}
	
	/**
	 * Parameter constructor for CheckingAccount class
	 * Throws exception if initial balance is less than 0
	 * @param initialBalance - initial balance
	 * @param acctNum - account number
	 */
	public CheckingAccount(double initialBalance, int acctNum) {
		myAccountNumber = acctNum;

		if(initialBalance < 0) {
			throw new ArithmeticException("Negative balance in account " + myAccountNumber);
		} else {
			myBalance = initialBalance;
		}
	}
	
	/**
	 * Returns the current balance
	 * @return - balance
	 */
	public double getBalance() {
		return myBalance;
	}
	
	/**
	 * Deposits a certain amount into the account
	 * Throws exception if amount is negative 
	 * @param amount - amount to deposit
	 */
	public void deposit(double amount) {
		if(amount < 0) {
			throw new ArithmeticException("Negative amount deposited in account " + myAccountNumber);
		} else {
			myBalance += amount;
		}
	}
	
	/**
	 * Withdraw a certain amount from the bank account
	 * Throws exception is amount to withdraw is greater than current balance
	 * @param amount - amount to withdraw
	 */
	public void withdraw(double amount) {
		if(amount > myBalance) {
			throw new ArithmeticException("Account " + myAccountNumber + " overdrawn");
		} else {
			myBalance -= amount;
		}
	}
	
}
