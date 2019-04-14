import java.util.Currency;
import java.util.Date;
/**
 * Last name: Kainth
 * First name: Prabhdeep
 * Student ID: 12089162
 * Period: 4
 */
public class Visit {
	private Customer customer;
	private Date date;
	private double serviceExpense;//expense after discount
	private double productExpense;//expense after discount
	//Do not add any more fields
	//Add your methods along with documentation here
	
	public Visit(Customer c, Date d, double sExpense, double pExpense) {
		customer = c;
		date = d;
		serviceExpense = sExpense;
		productExpense = pExpense;
	}
	
	public void setServiceExpense(double sExpense) {
		serviceExpense = sExpense;
	}
	
	public double getServiceExpense() {
		return serviceExpense - customer.getServiceDiscount(serviceExpense);
	}
	
	public void setProductExpense(double pExpense) {
		productExpense = pExpense;
	}
	
	public double getProductExpense() {
		return productExpense - customer.getProductDiscount(productExpense);
	}
	
	public double getTotalExpense() {
		return getServiceExpense() + getProductExpense(); 
	}
	
	public String toString() {
		String output = "Date: " + date.toString() + "\n";
		output += "Invoice for customer: " + customer.getName();
		output += "\nMembership type: " + customer.getMemberType();
		output += String.format("\nService charge (with %.1f%% discount): $%.2f", customer.getServiceDiscountRate()  *100 , getServiceExpense());
		output += String.format("\nProduct charge (with %.1f%% discount): $%.2f\n", customer.getProductDiscountRate() * 100, getProductExpense());
		output += String.format("Total: $%.2f\n", getTotalExpense());
		return output;	
	}
	
}