import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.plaf.synth.SynthSeparatorUI;
/**
 * 
 * last name: Kainth
 * first name: Prabhdeep
 * Student ID: 12089162
 * period: 4
 */

	public class CountWords 
	{
		// Your code goes here
		
		private ArrayList <Word> collection = new ArrayList <Word> ();
		
		String fName;
		private int uniqueWords = 0;
		private int totalWords = 0;
		
		/**
		 * Parameter constructor
		 * @param fileName - name of the file to be processed
		 */
		public CountWords(String fileName) {
			fName = fileName;
			loadFile();
			sortTop();		
			
		}

		/**
		 * Loads the file
		 */
		private void loadFile() {
			Scanner inFile;
			System.out.println("File: " + fName);

			try {
				inFile = new Scanner(new File(fName));

				while(inFile.hasNext()) {
					String temp = inFile.next().toLowerCase();
					temp = removePunctuation(temp);
					if(temp.length() > 0) {
						collection.add(new Word(temp));
					}
				}
			} catch (IOException e) {
				System.out.println("Error: " + e.getMessage());
			}
		}
				
		/**
		 * Sorts the ArrayList
		 */
		private void sortTop() {			
			
			//sort into alphabetical order first
			for(int i = 1; i < collection.size(); i++) {
	  		int pos = i;
	  		Word posEle = collection.get(pos);
	  		
	  		while(pos > 0 && collection.get(pos - 1).compareTo(posEle) > 0) {
	  			collection.set(pos,  collection.get(pos - 1));
	  			pos--;
	  		}
	  		
	  		collection.set(pos, posEle);
	  	}
	  	
	  	//remove duplicates
	  	int index = 0;
	  	while(index < collection.size() - 1) {
	  		if(collection.get(index).getString().equals(collection.get(index + 1).getString())) {
	  			collection.get(index).incrementCount();
	  			collection.remove(index + 1);
	  		} else {
	  			index++;
	  		}
	  	}
	  
	  	
	  	//sort by the word count
	  	for(int i = 1; i < collection.size(); i++) {
	  		int pos = i;
	  		Word posEle = collection.get(pos);
	  		
	  		while(pos > 0 && collection.get(pos - 1).getCount() < posEle.getCount()) {
	  			collection.set(pos,  collection.get(pos - 1));
	  			pos--;
	  		}
	  		
	  		collection.set(pos, posEle);
	  	}	
	  	
	  	uniqueWords = collection.size();
	  	for(Word w : collection) {
	  		totalWords += w.getCount();
	  	}

		}
		
		/**
		 * Prints the stattistics
		 */
		public void printStats() {
			
			System.out.println("Total number of unique words used in the file: " + uniqueWords);
			System.out.println("Total number of words in file: " + totalWords);
			System.out.println("Top 30 words are: ");
			
			int index = 0;
			while((index < 30) && (index < collection.size())) {
				System.out.printf("%2d", index);
				System.out.printf("%6d", collection.get(index).getCount());
				System.out.printf("%12s",collection.get(index).getString() );
				System.out.println();
				index++;
			}
			
		}
		
		/**
		 * Removes punctuation
		 * @param temp - word to be processed
		 * @return - processed word
		 */
		private String removePunctuation(String temp) {
			String adjusted = new String(temp);
			char first = adjusted.charAt(0);
			char last = adjusted.charAt(adjusted.length() - 1);
			
			if(first == '"' || first == '-') {
				if(adjusted.length() == 1) {
					return "";
				} else {
					adjusted = adjusted.substring(1);
					return removePunctuation(adjusted);
				}
			}
			
			if(last == '.' || last == ',' || last == '!' || last == '?' || last == ':' || last == '"' || last == ';') {
				adjusted = adjusted.substring(0, adjusted.length() - 1);
				return removePunctuation(adjusted);

			}
			
			return adjusted;
			
		}
		
	}
	
