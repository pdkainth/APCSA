/**
 * Last name: Kainth
 * First name: Prabhdeep
 * Student ID: 12089162
 * Period: 4
 * This class does some generic string parsing of a String one character at a time
 * For each character, the appropriate method of the StringHandler interface is called.
 *
 */
public class StringParser {
	
	//Instance variable goes here
	StringHandler sH;
	
	/**
	 * Constructor initializes the handler
	 * @param h - an object that implements the StringHandler interface
	 */
	public StringParser(StringHandler h) {
		//Your code goes here
		sH = h;
	}
	/**
	 * Parses the string one character at a time. Calls the appropriate
	 * method if the character is a digit, letter, or neither
	 * @param s - string to parse
	 */
	public void parse(String s) {
		//Your code goes here
		for(int i = 0; i < s.length(); i++) {
			char letter = s.charAt(i);
			if(Character.isLetter(letter)) {
				sH.processLetter(letter);
			} else if(Character.isDigit(letter)) {
				sH.processDigit(letter);
			} else {
				sH.processOther(letter);
			}
			
		}
	}
}