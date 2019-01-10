import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.NoSuchElementException;
import java.util.Scanner;
/**
 * 
 * Last name: Kainth
 * First name: Prabhdeep
 * Student ID: 12089162
 * period: 4
 *
 */
public class StopWordRemover {
	private String stopList;
	private String inFile, outFile;
	private int maxLineLength;
	
	/**
	 * Initializes the input and output files and the max
	 * characters per line
	 * @param in - name of input file
	 * @param out - name of output file
	 * @param max - max characters per line (including spaces)
	 */
	public StopWordRemover(String in, String out, int max){
		//Your code goes here
		inFile = in;
		outFile = out;
		maxLineLength = max;
	}
	
	/**
	 * Removes the stop words and outputs the text to a file
	 * Each line of output is not more than max characters long
	 * @return the number of words removed
	 */
	public int removeStopWords(){
		//Your code goes here
		try {
			Scanner s1 = new Scanner(new File(inFile));
			File f = new File(outFile);
			FileWriter fw = new FileWriter(f);
			int charCount = 0;
			int wordsRemoved = 0;
			
			while(s1.hasNext()) {
				
				
				String test = s1.next();

				Scanner s2 = new Scanner(new File("stopWords.txt"));
				boolean accept = true;

				while(s2.hasNext()) {
					stopList = s2.next();
					
					if(test.equalsIgnoreCase(stopList)) {
						accept = false;
						wordsRemoved++;
					}
					
				
				}
				
				if(accept == true) {
					
					if(charCount == 0) {
						fw.write(test);
						charCount = test.length();
					} else if(charCount + 1 + test.length() < maxLineLength) {
						fw.write(" " + test);
						charCount += (1 + test.length());
					} else {
						fw.write("\n" + test);
						charCount = test.length();
					}
					
				}
				
			}
			
			fw.close();
			return wordsRemoved;
			
		} catch (IOException e) {
			System.out.println(e.getMessage());
			return 0;
		}
		
		
	}
	
}
