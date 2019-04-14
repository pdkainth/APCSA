/**
 * Last name: Kainth
 * First name: Prabhdeep
 * Student ID: 12089162
 * Period: 4
 * Implements methods of the StringHandler interface to parse a String
 * containing a password
 *
 */
//Your code goes here
public class PasswordSecurityHandler implements StringHandler{
	
	private int length;
	private boolean digit;
	private boolean otherCharacter;
	
	public PasswordSecurityHandler() {
		length = 0;
		digit = false;
		otherCharacter = false;
	}
	
	public void processLetter(char c) {
		length++;
	}
	
	public void processDigit(char c) {
		length++;
		digit = true;
	}
	
	public void processOther(char c) {
		length++;
		otherCharacter = true;
	}
	
	public String securityLevel() {
		
		String security = "";
		
		if((length >= 8) && digit && otherCharacter) {
			security = "strong";
		} else if(length < 6) {
			security = "weak";
		} else {
			security = "medium";
		}
		
		return security;
		
	}
}