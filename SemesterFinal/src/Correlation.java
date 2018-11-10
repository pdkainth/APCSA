import java.util.Scanner;
/**
 * Last name: Kainth
 * First name: Prabhdeep
 * Student ID: 12089162
 * Period: 4
 *
 */
public class Correlation {
	//Add your code here
	private double averageX;
	private double averageY;
	private double stdevX;
	private double stdevY;
	private final int COUNT = 30;
	private double r = 0;
	
	public void average(Scanner sc) {
		double totalX = 0;
		double totalY = 0;
		
		for(int count = 0; count < COUNT; count++) {
			totalX += sc.nextInt();
			totalY += sc.nextInt();
		}
		
		
		averageX = totalX / COUNT;
		averageY = totalY / COUNT;
		
		System.out.printf("Average of x variable = %.2f\n", averageX);
		System.out.printf("Average of y variable = %.2f\n", averageY);
		
		/*
		while(sc.hasNext()) {
			System.out.println(sc.nextInt());
		}
		*/
	}
	
	public void standardDeviation(Scanner sc) {
		double totalX = 0;
		double totalY = 0;
		
		for(int count = 0; count < COUNT; count++) {
			totalX += Math.pow((sc.nextInt() - averageX), 2);
			totalY += Math.pow((sc.nextInt() - averageY), 2);
		}
		
		stdevX = Math.sqrt(totalX / (COUNT - 1));
		stdevY = Math.sqrt(totalY / (COUNT - 1));

		System.out.printf("Standard Deviation of x variable = %.2f\n", stdevX);
		System.out.printf("Standard Deviation of y variable = %.2f\n", stdevY);

	}
	
	public double correlationCoefficient(Scanner sc) {
		double corrTotal = 0;
		
		for(int count = 0; count < COUNT; count++) {
			corrTotal += ((sc.nextInt() - averageX)/(stdevX)) * ((sc.nextInt() - averageY)/(stdevY));
		}
		 r = (1.0 / (COUNT - 1)) * corrTotal;
		 
		 return r;
	}
}