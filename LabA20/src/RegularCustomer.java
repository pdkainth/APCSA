/**
 * Last name: Kainth
 * First name: Prabhdeep
 * Student ID: 12089162
 * Period: 4
 */
public class RegularCustomer extends Customer {
	//Add your methods along with documentation here
	
	public RegularCustomer(String name) {
		super(name);
		setMemberType("Not a member");
		setMember(false);
		setServiceDiscountRate(0);
	}
		
}