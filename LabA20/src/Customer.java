/**
 * Last name: Kainth
 * First name: Prabhdeep
 * Student ID: 12089162
 * Period: 4
 */
public abstract class Customer {
	private String name;
	private boolean member = true;
	private String memberType = "";
	private final double PRODUCT_DISCOUNT_RATE = 0.1;
	private double serviceDiscountRate;
	//Do not add any more fields
	//Add all your methods along with their documentation here
	
	public Customer(String n) {
		name = n;
	}
	
	public String getName() {
		return name;
	}
	
	public boolean isMember() {
		return member;
	}
	
	public void setMember(boolean status) {
		member = status;
	}
	
	public String getMemberType() {
		return memberType;
	}
	
	public void setMemberType(String type) {
		memberType = type;
	}
	
	public double getProductDiscountRate() {
		return PRODUCT_DISCOUNT_RATE;
	}
	
	public double getProductDiscount(double price) {
		return price * PRODUCT_DISCOUNT_RATE;
	}
	
	public double getServiceDiscountRate() {
		return serviceDiscountRate;
	}
	
	public double getServiceDiscount(double price) {
		return price * serviceDiscountRate;
	}
	
	public void setServiceDiscountRate(double rate) {
		serviceDiscountRate = rate;
	}
	
	public String toString() {
  	String output = "customer: " + name;
  	output += "\nMembership type: " + memberType+"\n";
  	return output;
	}
	
	
}