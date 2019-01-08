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
	
	public Average (String name) {
		fileName = name;
	}
	
	private void scanDataAndCalculateAverage() {
		Scanner in;
		try {
			in = new Scanner(new File(fileName));
			
			if(!in.hasNext()) {
				throw new IOException(fileName + " is empty");
			}
			
			
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
		
	}
	
}