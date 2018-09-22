/**
 * Taxes class - class used to calculate the federal, social security and state taxes
 * @author Prabhdeep Kainth
 * period #4
 */

public class Taxes {
	//declare instance variables
	private double hours;
	private double rate;
	
	private double net;
	private double totalTax;

	//Your code goes here

	//declare constants
	private static final double FEDERAL_TAX= 0.15;
	private static final double FICA = 0.0765;
	private static final double STATE_TAX = 0.04;
	//Your code goes here	
	

	/**
	 * Simple constructor for Taxes class
	 * @param hours - amount of hours that a person has worked
	 * @param rate - the hourly rate a person receives
	 */
	public Taxes(double hours, double rate)
	{
		//Your code goes here
		this.hours = hours;
		this.rate = rate;
		
		computeTotalTax();
		computeNetPay();
		
		System.out.printf("Hours worked: %.2f\n", hours);
		System.out.printf("Hourly rate: %.2f\n", rate);
		System.out.printf("Gross pay: %.2f\n", this.computeGrossPay());
		System.out.printf("Federal tax: %.2f\n", this.computeFedTax());
		System.out.print("FICA (7.65%): ");
		System.out.printf("%.2f\n", this.computeSocSecurity());
		System.out.print("State tax (4.00%): ");
		System.out.printf("%.2f\n", this.computeStateTax());
		System.out.printf("Net pay %.2f\n", net);

		
	}// end constructor
	
	
	
	/**
	 * 
	 * @return hours - the amount of hours a person has worked
	 */
	public double getHoursWorked()
	{
		
		//Your code goes here
		return hours;
	}// end method
	
	
	
	/**
	 * 
	 * @return rate - pay rate
	 */
	public double getHourlyRate()
	{

		//Your code goes here
		return rate;
	}// end method
	
	
	
	/**
	 * 
	 * @return federal tax rate
	 */
	public double getFedTaxRate()
	{
		
		//Your code goes here
		return FEDERAL_TAX;
	}// end method
	
	
	
	/**
	 * 
	 * @return -social security tax rate
	 */
	public double getSocSecurityRate()
	{

		//Your code goes here
		return FICA;
	}// end method
	
	
	
	/**
	 * 
	 * @return state tax rate
	 */
	public double getStateTaxRate()
	{

		//Your code goes here
		return STATE_TAX;
	}// end method
	
	
	
	/**
	 * 
	 * @return gross pay
	 */
	public double computeGrossPay()
	{

		//Your code goes here
		double gross = hours * rate;
		return gross;
	}// end method
	
	
	
	/**
	 * 
	 * @return federal tax
	 */
	public double computeFedTax()
	{

		//Your code goes here
		double federal = this.computeGrossPay() * FEDERAL_TAX;
		return federal;
	}//end method
	
	
	
	/**
	 * 
	 * @return fica tax
	 */
	public double computeSocSecurity()
	{

		//Your code goes here
		double fica = this.computeGrossPay() * FICA;
		return fica;
	}//end method
	
	
	
	/**
	 * 
	 * @return state tax
	 */
	public double computeStateTax()
	{

		//Your code goes here
		double state = this.computeGrossPay() * STATE_TAX;
		return state;
	}//end method
	
	
	
	/**
	 * 
	 * @return total tax
	 */
	private double computeTotalTax()
	{

		//Your code goes here
		totalTax = this.computeFedTax() + this.computeSocSecurity() + this.computeStateTax();
		return totalTax;
	}//end method
	
	
	
	/**
	 * 
	 * @return net pay
	 */
	public double computeNetPay()
	{
		
		//Your code goes here
		net = this.computeGrossPay() - totalTax;
		return net;
	}//end method
	
}

