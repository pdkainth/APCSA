import java.util.*; 
/**
 * 
 * @author Prabhdeep Kainth
 * Period #4
 */
 
public class GameLand { 
	//Declare Random object here
    Random dice;
    
	//Declare other instance variables here
    private int positionA = 0;
    private int positionB = 0;

    private static final int START  = 0;
    private static final int FINISH = 101;
    
    private int totalDiceRoll = 0;
    
    /**
     * Method to create a new Random object and
     * initialize with the give seed
     * @param seed - seed for the random number generator
     */
    public GameLand(int seed)
    {
    	//Your code goes here
    	dice = new Random(seed);    	
    	
    }
    /**
     * Method that simulates the roll of two dice
     */
    public void roll() 
    { 
    	//Your code goes here
    	totalDiceRoll = 0;
    	
    	totalDiceRoll += (dice.nextInt(6) + 1);
        totalDiceRoll += (dice.nextInt(6) + 1);
    } 
    
    
 
        /** Method that runs the game. For each move
     *  print the roll and the players location after the move
     * 
     */
    public void moving() 
    {
    	//Your code goes here
    	while((positionA < FINISH) || (positionB < FINISH)) {
    		
    		//roll for A and update its value
    		roll();
    		if(totalDiceRoll == 7) {
    			if(positionA > 7) {
    				positionA -= 7;
    				
    				System.out.println("Player A rolled a 7 >>> *******Player A is now at " + positionA);
    				checkA();
    				//
    			} else {
    				positionA = START;
    				System.out.println("Player A rolled a 7 >>> *******Player A is now at " + positionA);

    			}
    		} else if((totalDiceRoll != 2) || (totalDiceRoll != 12)) {
    			positionA += totalDiceRoll;
    			
				System.out.println("Player A rolled a " + totalDiceRoll + " >>> Player A is now at " + positionA);

    			checkA();
    		
    		}
    		
    		
    		//roll for B and update its value
    		roll();
    		if(totalDiceRoll == 7) {
    			if(positionB > 7) {
    				positionB -= 7;

    				System.out.println("Player B rolled a 7 >>> *******Player B is now at " + positionB);
    				checkB();
    				
    			} else {
    				positionB = START;
    				System.out.println("Player B rolled a 7 >>> *******Player B is now at " + positionB);

    			}
    		} else if((totalDiceRoll != 2) || (totalDiceRoll != 12)) {
    			positionB += totalDiceRoll;

    			System.out.println("Player B rolled a " + totalDiceRoll + " >>> Player B is now at " + positionB);
    			
    			checkB();
    		
    		}
    		
    	}


    }
    
    private void checkA() {
		
    	//test to see if A is same as B (in this case, A is newer, will bump B)
		if((positionA == positionB) && (positionA != START)) {
			positionB = START;
			
		}
		
		
   	
    }
    
    private void checkB() {

    	//test to see if B is same as A (in this case, B is newer, will bump A)
		if((positionA == positionB) && (positionB != START)) {
			positionA = START;
		}
    	
    }

        
}
