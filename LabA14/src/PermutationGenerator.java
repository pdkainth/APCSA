import java.util.*;

/**
 * @author Prabhdeep Kainth
 * period #4
 */

public class PermutationGenerator {
	//Your code goes here
	private ArrayList <Integer> base; 
	private ArrayList <Integer> perm; 
	private final Random rand;

	/**
	 * Parameter constructor for the PermutationGenerator class
	 * @param s - seed for random number generator
	 */
	public PermutationGenerator(int s) {
		rand = new Random(s);
		
	}
	
	/**
	 * Produces a random permutation of the first 10 numbers
	 */
	
	public void nextPermutation() {
		perm = new ArrayList <Integer> (10);
		base  = new ArrayList <Integer> (10);
		
		for (int j = 1; j <= 10; j++) {
			base.add(j);
		}
		
		for(int i = 0; i < 10; i++) {
			int element = rand.nextInt(base.size());
			
			perm.add(base.get(element));
			base.remove(element);
		}
	}
	
	/**
	 * Prints out the list with the permutation
	 * @return - permutation list
	 */
	public String toString() {
		return perm.toString();
	}
	
}