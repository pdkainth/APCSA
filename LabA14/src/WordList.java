import java.util.*;
/**
 * 
 * @author Prabhdeep Kainth
 * period #4
 *
 */
public class WordList extends ArrayList<String>
{
	//Your code goes here
	
	/** 
 	* method to returns the number of words in this 
 	* WordList that are exactly len letters long 
 	* @param len - length of the words to search for 
 	* @return number of words in this list of length len 
 	*/ 

 	public int numWordsOfLength(int len) 
 	{ 
 		int num = 0;
 		
 		for(int i  = 0; i < size(); i++) {
 			if(get(i).length() == len) {
 				num++;
 			}
 		}
 		
 		return num;
 	
 	} 
 	
 	/** 
 	* All words that are exactly len letters long are removed from this 
 	* WordList, with the order of the remaining words unchanged 
 	* @param len - length of the word to remove 
 	*/ 
 	public void removeWordsOfLength(int len) 
 	{ 
 		for(int i = 0; i < size(); i++) {
 			if(get(i).length() == len) {
 				remove(i);
 				i--;
 			}
 		}
 		
 	} 
 	
 	/** 
 	* method to calculate the length of the longest word 
 	* @return length of the longest word 
 	*/ 
 	public int lengthOfLongestWord() 
 	{ 
 		int maxLength = 0;
 		
 		for(int i = 0; i < size(); i++) {
 			maxLength = Math.max(maxLength, get(i).length());
 		}
 		
 		return maxLength;
 	} 

}// end WordList