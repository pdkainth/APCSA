import java.util.ArrayList;
import java.util.*;

/**
 * 
 * @author Prabhdeep Kainth
 * 
 * Number Class
 */
public class Number
{
    int value;
    int base;
    
    ArrayList<Digit> digits = new ArrayList<Digit>();
    
    /**
     * Default constructor to initialize the value to 
     * zero and the base to 10
     * Also initializes the digits
     */
    public Number()
    {
        //Your code goes here
    		value = 0;
    		base = 10;
    		Digit d = new Digit(0, base);
    		digits.add(d);
    }
    
    /**
     * Constructor to initialize the value and base of the number
     * to the given value and base. Also initializes the digits
     * @param val value
     * @param b base
     */
    public Number(int val, int b)
    {
        // Your code goes here
    	value = val;
    	base = b;
    	if(value == 0) {
    		Digit d = new Digit(0, base);
    		digits.add(d);
    	} else {
      	convert();
    	}

    }
    
    /**
     * Method to return the digitsList as String
     * @return String containing the digits of the number
     * 			in the given base
     */
    public String toString()
    {
        // Your code goes here
    	String output = "";
    	for(Digit d: digits) {
    		output += d.toString();
    	}
    	
    	return output;
    }
    
    /**
     * Method to increment the number by 1
     */
    public void increment()
    {
        // Your code goes here
    	
    	boolean carry = true;
    	for(int i = digits.size() - 1; i >= 0; i--) {
    		carry = digits.get(i).increment();
    		
    		if(!carry) {
    			break;
    		}
    	}
    	
    	if(carry) {
    		digits.add(0, new Digit(1, base));
    	}
    }
    
    /**
     * Method to convert decimal to given base
     */
    private void convert() {
    		
    		int temp = value;
    		while(temp > 0) {
    			int remainder = temp % base;
    			Digit d = new Digit(remainder, base);
    			digits.add(0, d);
    			temp /= base;
    		}
    		
    }
 }
    