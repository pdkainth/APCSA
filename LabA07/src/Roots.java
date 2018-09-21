/**
 * @author Prabhdeep Kainth
 * period 4
 */
import java.util.Scanner;

public class Roots {
	/**
	 * calculate the roots of quadratic equations
	 */
	Scanner in = new Scanner(System.in);
	
	public void calculate() 
	{
		//your code goes here

		System.out.printf("Enter the coefficients a b and c for equation 1: ");
		double a1 = in.nextDouble();
		double b1 = in.nextDouble();
		double c1 = in.nextDouble();

		System.out.printf("Enter the coefficients a b and c for equation 2: ");
		double a2 = in.nextDouble();
		double b2 = in.nextDouble();
		double c2 = in.nextDouble();

		System.out.printf("Enter the coefficients a b and c for equation 3: ");
		double a3 = in.nextDouble();
		double b3 = in.nextDouble();
		double c3 = in.nextDouble();
		
		double firstRoot1 = (-b1 + (Math.sqrt((b1 * b1) - (4 * a1 * c1)))) / (2 * a1);
		double secondRoot1 = (-b1 - (Math.sqrt((b1 * b1) - (4 * a1 * c1)))) / (2 * a1);

		double firstRoot2 = (-b2 + (Math.sqrt((b2 * b2) - (4 * a2 * c2)))) / (2 * a2);
		double secondRoot2 = (-b2 - (Math.sqrt((b2 * b2) - (4 * a2 * c2)))) / (2 * a2);

		double firstRoot3 = (-b3 + (Math.sqrt((b3 * b3) - (4 * a3 * c3)))) / (2 * a3);
		double secondRoot3 = (-b3 - (Math.sqrt((b3 * b3) - (4 * a3 * c3)))) / (2 * a3);

		System.out.printf("%20s", "a:");
		System.out.printf("%10s", "b:");
		System.out.printf("%10s", "c:");
		System.out.printf("%11s", "root1:");
		System.out.printf("%12s", "root2:\n");

		System.out.printf("%10s", "#1");
		System.out.printf("%10.2f", a1);
		System.out.printf("%10.2f", b1);
		System.out.printf("%10.2f", c1);
		System.out.printf("%10.2f", firstRoot1);
		System.out.printf("%10.2f%s", secondRoot1,"\n");
		
		System.out.printf("%10s", "#2");
		System.out.printf("%10.2f", a2);
		System.out.printf("%10.2f", b2);
		System.out.printf("%10.2f", c2);
		System.out.printf("%10.2f", firstRoot2);
		System.out.printf("%10.2f%s", secondRoot2,"\n");

		System.out.printf("%10s", "#3");
		System.out.printf("%10.2f", a3);
		System.out.printf("%10.2f", b3);
		System.out.printf("%10.2f", c3);
		System.out.printf("%10.2f", firstRoot3);
		System.out.printf("%10.2f%s", secondRoot3,"\n");


	}
	
	public void main(String srga[]) {
		System.out.println("\t1010101010101010");
		System.out.print("101010101010101");
	}
}