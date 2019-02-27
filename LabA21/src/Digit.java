/**
 * 
 * @author Prabhdeep Kainth
 * 
 * Digit Class
 */
public class Digit
{
    int value;
    int base;
    
    /**
     * Default constructor to initialize the value
     * to zero and base to 10
     */
    public Digit()
    {
      	// Your code goes here
    		value = 0;
    		base = 10;
    }
    
    
    /**
     * Constructor to initialize the value and 
     * base of this Digit to the given values
     * @param val initial value
     * @param b base
     */
    public Digit(int val, int b)
    {
      	// Your code goes here
    		value = val;
    		base = b;
    	
    }
    
    
    /**
     * Method to return the digit as a string for
     * printing
     * @return string representation of a digit
     */
    public String toString()
    {
        // Your code goes here
    	if(base < 10 || value < 10) {
    		return "" + value;
    	} else {
    		int index = 'A' + value - 10;
    		return "" + (char)(index);
    	}
	
    }
    
    
    /**
     * Method to increment the digit by 1
     * @return true if there is carry, false otherwise
     */
    public boolean increment()
    {
      	// Your code goes here
    	if((value + 1) == base) {
    		value = 0;
    		return true;
    	} else {
    		value++;
    		return false;
    	}
	
    }
    
    
}