import java.util.*;
/**
 *   
 * @author Prabhdeep Kainth
 * period # 4
 */
  
public class Rolling {
	Random rand;
	/**
	 * constructor to initilize the random number
	 * generator
	 * @param s - seed for the random number generator
	 */
	public Rolling(int s)
	{
		rand = new Random(s);//makes new number generator
	}
	/**
	 * Method to simulate a dice roll
	 * @return an integer between 1 and 6
	 */
    private int roll() 
    { 
        //Your code goes here
    	return rand.nextInt(6) + 1;
    }
    
    /**  
     * Roll the dice three times and count the
     * number of tries it took to get all three
     * different rolls. In the end print a message
     * displaying the number of tries
     */
    public  void play() {
        //Your code goes here
    	int count = 1;
    	boolean same = true;
    	
    	while(same) {
    		int first = roll();
    		int second = roll();
    		int third = roll();
    		
    		System.out.println(first + " " + second + " " + third);
    		
    		if(first != second && second != third && first != third) {
    			System.out.println("Rolled " + count + " times before all the rolls were different");
    			same = false;
    		} else {
    			count++;
    		}
    		
    		
    	}
    	
    	
    }


    /** 
     * Answer to question 3 goes here
     */
  
} 