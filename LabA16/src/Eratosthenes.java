import java.util.Arrays;

/**
 * Determines the primes less than or equal to n using the 
 * Sieve of Eratosthenes
 * @author Prabhdeep Kainth
 * period  #4
 *
 */
public class Eratosthenes {
	//Your fields go here
	private int sieve[];
	private final int TOTAL;
	private int numPrime;
	/**
	 * Constructor to initialize array of primes using the Sieve of Eratosthenes
	 * @param n - all primes are less than or equal to n
	 */
	public Eratosthenes (int n)
	{
		//Your code goes here
		TOTAL = n - 1;
		sieve = new int[TOTAL];
		for(int i = 0; i < TOTAL; i++) {
			sieve[i] = i + 2;
		}
		
		//System.out.println(Arrays.toString(sieve));
		
	}
	
	
	/** Count the number of primes
	 * 
	 * @return number of primes less than or equal to n
	 */
	public int countPrimes()
	{
		//Your code goes here
		return numPrime;
	}
	
	
	/**
	 * returns a list of primes less than or equal to n
	 * @return
	 */
	public int[] listOfPrimes()
	{
		//Your code goes here
		numPrime = 0; 
		for(int n = 0; n < TOTAL; n++) {
			if(sieve[n] != 0) {
				numPrime++;
				for(int i = n + 1; i < TOTAL; i++) {
					if(sieve[i] % sieve[n] == 0) {
						sieve[i] = 0;
					}
				}
				
			}
		}

		//System.out.println(Arrays.toString(sieve));
 
		int prime[] = new int[numPrime];
		for(int p = 0, s = 0; p < numPrime && s < TOTAL; s++) {
			
			if(sieve[s] != 0) {
				prime[p] = sieve[s];
				p++;
			}
		}
		
		//System.out.println(Arrays.toString(prime));
		return prime;
		
	}
	
	
	/**
	 * Returns a string containing the prime numbers and the number of prime numbers
	 * in the list
	 */
	public String toString()
	{
		//Your code goes here
		String output = "";
		int toString[] = listOfPrimes();
		for(int i = 0; i < numPrime; i++) {
			output += toString[i] + " ";
		}
		
		output += "\nNumber of primes less than or equal to " + (TOTAL + 1) + " = " + numPrime;
		return output;
	}


	public static void main(String[] args) {
		Eratosthenes e = new Eratosthenes(30);
		e.listOfPrimes();
		
	}
}