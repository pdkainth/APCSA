/**
 * 
 * Last name: Kainth
 * First name: Prabhdeep
 * ID: 12089162
 * Period: 4
 *
 */
/** Write a one sentence summary about your class
 */
public class CarRental {
	//Declare instance variables here
	private String license;
	private String make;
	private String model;
	private int total = 0;
	private int count = 0;
	

	/**
	 * Parameter constructor of the CarRental object
	 * @param make make of the car
	 * @param model model of the car
	 * @param licensePlate license plate of the car
	 */
	public CarRental(String make, String model, String licensePlate)
	{
		//Your code goes here
		this.make = make;
		this.model = model;
		this.license = licensePlate;

	}
	
	
	/**
	 * Computes the numeric portion of the rental id 
	 */
	public void computeCode()
	{
		//Your code goes here
		if(count >= 3) {
			//System.out.println(total);
			return;
		}
		
		//System.out.println((int)(license.charAt(count)));
		total = total +(int)(license.charAt(count));
		int subtotal = (int)(license.charAt(count + 4)) - 48;
		subtotal *= Math.pow(10, (2 - count));
		total += subtotal;
		count++;
		computeCode();
		
	}
	
	/**
	 * 
	 * @return string of the rental id
	 */
	public String getCode()
	{
		computeCode();
		char rentalID = (char)(65 + (total % 26));
		//System.out.println(rentalID);
		String id = rentalID + "" + total;
		//System.out.println(id);
		return id;
	}

	/**
	 * @return string output of the object
	 */
	public String toString()
	{
		//Your code goes here
		String preString = "Make: " + make + "\n" + "Model: " + model + "\n" + "License Plate: " + license + "\n";
		String toString = "Make = " + make + "\n" + "Model = " + model + "\n" + license + " = " + getCode();
		return preString + toString;
														
	}

	
}