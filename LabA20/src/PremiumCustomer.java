/**
 * Last name: Kainth
 * First name: Prabhdeep
 * Student ID: 12089162
 * Period: 4
 */
public class PremiumCustomer extends Customer {
	final double SERVICE_DISCOUNT_RATE = 0.2;
	//Do not add any more fields
	//Add your methods along with documentation here
	public PremiumCustomer(String name) {
		super(name);
		setMember(true);
		setMemberType("Premium");
		setServiceDiscountRate(SERVICE_DISCOUNT_RATE);
	}
}