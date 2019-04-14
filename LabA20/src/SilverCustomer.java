/**
 * Last name: Kainth
 * First name: Prabhdeep
 * Student ID: 12089162
 * Period: 4
 */

public class SilverCustomer extends Customer {
	final double SERVICE_DISCOUNT_RATE = 0.10;
	//Do not add any more fields
	//Add your methods along with documentation here
	public SilverCustomer(String name) {
		super(name);
		setMember(true);
		setMemberType("Silver");
		setServiceDiscountRate(SERVICE_DISCOUNT_RATE);
	}
	
}