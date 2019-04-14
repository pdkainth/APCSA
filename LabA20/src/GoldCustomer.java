/**
 * Last name: Kainth
 * First name: Prabhdeep
 * Student ID: 12089162
 * Period: 4
 */
public class GoldCustomer extends Customer {
	final double SERVICE_DISCOUNT_RATE = 0.15;
	//Do not add any more fields
	//Add your methods along with their documentation
	public GoldCustomer(String name) {
		super(name);
		setMember(true);
		setMemberType("Gold");
		setServiceDiscountRate(SERVICE_DISCOUNT_RATE);
	}
}