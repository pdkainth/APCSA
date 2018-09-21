/**
 * Taxes class - class used to calculate the federal, social security and state taxes
 * @author Your name
 * @period #
 */
import java.util.Scanner;

public class Taxes {
	//declare instance variables
	private double hours;
	private double rate;
	private double gross;
	private double federal;
	private double fica;
	private double state;
	private double net;
	private double totalTax;

	//Your code goes here

	//declare constants
	private static final double FEDERAL_TAX= 0.15;
	private static final double FICA = 0.0765;
	private static final double STATE_TAX = 0.04;
	//Your code goes here


	
	public Taxes(double hours, double rate)
	{
		Scanner in = new Scanner(System.in);
		//Your code goes here
		System.out.print("Enter the amount of hours worked > ");
		hours = in.nextDouble();
		
		System.out.print("Enter the hourly rate > ");
		rate = in.nextDouble();
		
		
	}// end constructor
	
	public double getHoursWorked()
	{
		
		//Your code goes here
		return hours;
	}// end method
		
	public double getHourlyRate()
	{

		//Your code goes here
		return rate;
	}// end method
		
	public double getFedTaxRate()
	{
		
		//Your code goes here
		return FEDERAL_TAX;
	}// end method
		
	public double getSocSecurityRate()
	{

		//Your code goes here
		return FICA;
	}// end method
		
	public double getStateTaxRate()
	{

		//Your code goes here
		return STATE_TAX;
	}// end method
	
	public double computeGrossPay()
	{

		//Your code goes here
		gross = hours * rate;
		return gross;
	}// end method
	
	public double computeFedTax()
	{

		//Your code goes here
		federal = gross * FEDERAL_TAX;
		return federal;
	}//end method
	
	public double computeSocSecurity()
	{

		//Your code goes here
		fica = gross * FICA;
		return fica;
	}//end method
	
	public double computeStateTax()
	{

		//Your code goes here
		state = gross * STATE_TAX;
		return state;
	}//end method
	
	private double computeTotalTax()
	{

		//Your code goes here
		totalTax = federal + fica + state;
		return totalTax;
	}//end method
	
	public double computeNetPay()
	{
		
		//Your code goes here
		net = gross - totalTax;
		return net;
	}//end method
	
}

