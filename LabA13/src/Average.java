import java.io.*;
import java.util.*;
/**
 * 
 * Last name: Kainth
 * First name: Prabhdeep
 * Student ID: 12089162
 * Period: 4
 *
 */
public class Average {
	//Your code goes here
	
	private long total = 0;
	private String fileName;
	
	/**
	 * Parameter constructor for Average class
	 * @param name - name of file
	 */
	public Average (String name) {
		fileName = name;
	}
	
	/**
	 * Scans the data and calculates the average
	 * @return - average of the data
	 */ 
	public double scanDataAndCalculateAverage() {
		Scanner in;
		int count = 0;
		try {

			in = new Scanner(new File(fileName));
			
			if(!in.hasNext()) {
				throw new NullPointerException(fileName + " is empty");
			}
			
			if(!in.hasNextInt()) {
				throw new IllegalArgumentException(fileName + " does not have numeric data");
			} 
			
			while(in.hasNext()) {
					total += in.nextInt();
					count++;
			}

			return total / (double)count;
			
		} catch (IOException e) {
			
			System.out.println("Error: " + fileName + " (No such file or directory)");
			
		}
		
		return 0.0;

	}
	
}