/**
 * 
 * @author Prabhdeep Kainth
 * Period #4
 *
 */
public class LoanTable {
	//Declare your instance variables here
	private double principal;
	private double years;
	private double low;
	private double high;
	
	
	/**
	 * Constructor
	 * @param principal - principal amount borrowed
	 * @param years - number of years for the loan to be paid off
	 * @param low - low interest rate
	 * @param high - high interest rate
	 */
	public LoanTable(double principal, int years, double low, double high)
	{
		//Your code goes here
		this.principal = principal;
		this.years = years;
		this.low = low;
		this.high = high;


	}
	/**
	 * Method to print the Loan table
	 */
	public void printTable()
	{
		//Print table heading
		System.out.println("Annual Interest Rate    Monthly Payment\n");
		//Your code goes here
		for(double i = low; i <=high; i += 0.25) {
			System.out.printf("%15.2f", i);
			
			double k = (i / 12) / 100;
			double n = years * 12;
			double c = Math.pow((1 + k), n); 
			double payment = (principal * k * c) / (c - 1);
			System.out.printf("%17.2f", payment);
			System.out.println();
		}
			

	}

}