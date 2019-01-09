import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 * 
 * last name: Kainth
 * first name: Prabhdeep
 * student ID: 12089162
 * period: 4
 *
 */
public class Squeeze {
	String fname;//name of the file that contains text to be squeezed
	
	/**
	 * Constructor to initialize fname
	 * @param name - name of the file to be squeezed
	 */
	public Squeeze(String name)
	{
		//Your code goes here
		fname = name;
	}
	
	
	/**
	 * Method to remove and count any extra 
	 * leading spaces
	 * 
	 */
	public void squeezeText()
	{
		//Your code goes here
				
			try {
				Scanner in = new Scanner(new File(fname));
				int i = 0;
				String temp = "b";
				while(in.hasNext()) {
					temp = in.nextLine();
					
					int tempCount = 0;
					while(true) {
						if(temp.charAt(tempCount) == ' ') {
							tempCount++;
						} else {
							break;
						}
						
					}
					
					temp = tempCount + " " + temp.substring(tempCount) + "\n";

					System.out.print(temp);

				}


			} catch (IOException e) {
				System.out.println(e.getMessage());
			}
		
	}
	
	
}