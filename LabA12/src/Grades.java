import java.util.*;
/**
 * 
 * @author Prabhdeep Kainth
 * Period #4
 * 
 */

public class Grades {
	//Declare instance variables here
	private double gpa = 0;
	private int classesTaken = 0;
	private int numFs = 0;

	

	/**
	 * Method to get the grades and calculate the GPA
	 * This method also counts the number of classes taken
	 * and the number of Fs
	 */
	public void getGradesAndCalculateGPA()
	{
		//Your code goes here
		Scanner in = new Scanner(System.in);
		String s = new String();
		int test = 0;
		System.out.print("Enter your grades: ");
		while(test == 0) {
			s = in.next();
			
			//System.out.println(s);
			if(s.equals("A") || s.equals("a")) {
				classesTaken++;
				gpa += 4.0;
			} else if(s.equals("B") || s.equals("b")) {
				classesTaken++;
				gpa += 3.0;
			} else if(s.equals("C") || s.equals("c")) {
				classesTaken++;
				gpa += 2.0;
			} else if(s.equals("D") || s.equals("d")) {
				classesTaken++;
				gpa += 1.0;
			} else if( s.equals("F") || s.equals("f")) {
				classesTaken++;
				numFs++;
			} else {
				test = 1;
			}

			//System.out.println(s + " class " + classesTaken + " GPA " + gpa);
		}
		
		gpa /= classesTaken;
		

		//System.out.println("After" + " class " + classesTaken + " GPA " + gpa + " num F " + numFs);
		
	}
	/**
	 * Method to print the appropriate message
	 */
	public void printMessage()
	{
		//Your code goes here
		System.out.printf("GPA = %.2f\n", gpa);
		
		if((gpa >= 2.0) && (numFs == 0) && (classesTaken >= 4)) {
			System.out.println("Eligible");
		} else if(classesTaken < 4) {
			System.out.println("Ineligible, taking less than 4 classes");
		} else if((gpa <= 2.0) && (numFs > 0)) {
			System.out.println("Ineligible, gpa below 2.0 and has F grade");
		} else if((gpa >= 2.0) && (numFs > 0)) {
			System.out.println("Ineligible, gpa above 2.0 but has F grade");
		} else if(gpa < 2.0) {
			System.out.println("Ineligible, gpa below 2.0");
		}
		
		gpa = 0;
		classesTaken = 0;
		numFs = 0;
	}
	

	


//	public static void main(String args[]) {
//		Grades a = new Grades();
//		a.getGradesAndCalculateGPA();
//		a.printMessage();
//	}

}