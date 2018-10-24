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
		boolean test = true;
		while(in.hasNext() && test) {
			s = in.next();
			s.toUpperCase();
			if(s.equals("A")) {
				classesTaken++;
				gpa += 4.0;
			} else if(s.equals("B")) {
				classesTaken++;
				gpa += 3.0;
			} else if(s.equals("C")) {
				classesTaken++;
				gpa += 2.0;
			} else if(s.equals("D")) {
				classesTaken++;
				gpa += 1.0;
			} else if( s.equals("F")) {
				classesTaken++;
				numFs++;
			} else {
				test = false;
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
		System.out.print("GPA = " + gpa + " ");
		
		if((gpa >= 2.0) && (numFs == 0) && (classesTaken >= 4)) {
			System.out.print("Eligible");
		} else if(classesTaken < 4) {
			System.out.print("Ineligible, taking less than 4 classes");
		} else if(gpa < 2.0) {
			System.out.print("Ineligible, gpa below 2.0");
		} else if((gpa >= 2.0) && (numFs > 0)) {
			System.out.print("Ineligible, gpa above 2.0 but has F grade");
		} else if((gpa <= 2.0) && (numFs > 0)) {
			System.out.print("Ineligible, gpa below 2.0 and has F grade");
		}


	}
	/*
	public static void main(String args[]) {
		Grades a = new Grades();
		a.getGradesAndCalculateGPA();
		a.printMessage();
	}
	*/
}