/**
 * Last Name: Kainth
 * First Name: Prabhdeep
 * Student ID: 12089162
 * Period: 4
 * Implements the StringParser interface to parse
 * a string that contains a hex number into its
 * decimal equivalent
 * Implements the Validator interface to determine
 * validity of the string
 */
//Your code goes here
public class HexStringHandler implements StringHandler, Validator{
	
	private boolean validHex;
	private int decimalValue;
	
	public HexStringHandler() {
		validHex = true;
		decimalValue = 0;
	}
	
	public void processLetter(char c) {
		
		if((c >= 'A') && (c <= 'F')) {
			int value  = c - 'A' + 10;
			decimalValue = 16 * decimalValue + value;
		} else {
			validHex = false;
		}
		
	}
	
	public void processDigit(char c) {
		int value = c - '0';
		decimalValue = 16 * decimalValue + value;
		
	}
	
	public void processOther(char c) {
		validHex = false;
	}
	
	public boolean isValid() {
		return validHex;
	}
	
	public int getDecimalValue() {
		if(isValid()) {
			return decimalValue;
		} else {
			return -1;
		}
	}
	
}