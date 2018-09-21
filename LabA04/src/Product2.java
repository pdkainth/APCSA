//Prabhdeep Kainth
//Period 4

public class Product2 {

	//declaring the instance varables
	private static String companyName;
	private String name;
	private double cost;
	private double unitPrice;
	private double discount;
	private double unitSalePrice;
	private int quantitySold;
	
	//default contructor - sets all values to 0
	public Product2() {
		companyName = "";
		name = "";
		cost = 0;
		unitPrice = 0;
		discount = 0;
		unitSalePrice = 0;
		quantitySold = 0;
	}
	
	//5 parameter constructor - takes in name, cost, unit price, discount, quantity sold
	//
	public Product2(String name , double cost, double unitPrice, double discount, int quantitySold) {
		this.name = name;
		this.cost = cost;
		this.unitPrice = unitPrice;
		this.discount = discount;
		this.quantitySold = quantitySold;
		calculateSalePrice();
	}
	
	public Product2(String name , double cost, double unitPrice, int quantitySold) {
		this.name = name;
		this.cost = cost;
		this.unitPrice = unitPrice;
		this.discount = 0;
		this.quantitySold = quantitySold;
	}
	
	private void calculateSalePrice() {
		unitSalePrice = unitPrice * discount;
	}
	
	public void setDiscount(double discount) {
		this.discount = discount;
	}
	
	public double getDiscount() {
		return discount;
	}
	
	public double unitProfit() {
		double profit = unitSalePrice - (cost / quantitySold);
		return profit;
	}
	
	public double totalProfit() {
		double profit = unitSalePrice - (cost / quantitySold);
		profit *= quantitySold;
		return profit;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
