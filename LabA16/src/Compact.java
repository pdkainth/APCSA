import java.util.*;
import java.io.*;
import java.time.Year;
/**
 * 
 * @author Prabhdeep Kainth
 * period #4
 */
public class Compact 
{	
	
	// Your code goes here
	private final int MAXSIZE = 100;
	private int myArray[] = new int[MAXSIZE];
	private int arraysize = 0;
	
	/**
	 * Method to print out the array
	 */
	private void printArray() {
		for(int i = 0; i < arraysize - 1; i++) {
			if(i < arraysize - 2) {
				System.out.print(myArray[i] + " ");
			} else {
				System.out.println(myArray[i]);
			}
		}
		
	}
	
	/**
	 * Parameter constructor for Compact class
	 * @param fname - file name
	 */
	public Compact(String fname) {
		
		try {
			
			Scanner in = new Scanner(new File(fname));
			int index = 0;
			
			while(in.hasNext()) {
				myArray[index] = in.nextInt();
				index++;
			}
			
			arraysize = index + 1;
			System.out.print("Before: ");
			printArray();
			
		} catch(IOException e) {
			System.out.println(e.getMessage());
		}
		
		
	}
	
	/**
	 * Method to compact the array
	 */
	public void compactIt() {
		int sizeToProc = arraysize;
		for(int i = 0; i < sizeToProc; i++) {
			
			if(myArray[i] == 0) {
				
				/* for(int j = i; j < sizeToProc - 1; j++) {
					int temp = myArray[j];
					myArray[j] = myArray[j + 1];
					myArray[j + 1] = temp;
				} */
				
				for(int j = i; j < sizeToProc - 2; j++) {
					myArray[j] = myArray[j+1]; 
				}
				myArray[sizeToProc - 1] = 0; 
				
				i--;
				sizeToProc--;
			}
		}
		System.out.print("After: ");
		printArray();

	}
	

}