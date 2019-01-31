/**
 * Computes all primes less than N and tries to express N as a sum of two
 * primes. Goldbach's conjecture says that this is always possible if N is even
 * and greater than 2. When N is odd, these are called prime pairs.
 * 
 * @author Prabhdeep Kainth 
 
 *  period #4
 */
public class Goldbach {
	private Eratosthenes e;
	private final int N;

	/**
	 * Constructor creates the list of primes using the class Eratosthenes and
	 * initializes N to the passed in value of n
	 * 
	 * @param n
	 *            - number to be written as a sum of two primes
	 */
	public Goldbach(int n) {
		//Your code goes here
		N = n;
		e = new Eratosthenes(N);
	}

	

	/**
	 * Returns a string that includes all the prime pairs that add up to N
	 * 
	 * @return string with the all the prime pairs that add up to N
	 */
	public String sumOfTwoPrimes() {
		//Your code goes here
		String output = "";
		int prime[] = e.listOfPrimes();
		int firstPrime = 0;
		int secondPrime = 0;
		
		
		output = N + "";
		for(int i = 0; i < prime.length; i++) {
			firstPrime = prime[i];
			int maybeSecond = N - firstPrime;
			for(int j = 0; j < prime.length; j++) {
				if(prime[j] == maybeSecond) {
					secondPrime = prime[j];
					break;
				}
			}
			
			if((firstPrime + secondPrime == N) && secondPrime != 0) {
				output += " = " + firstPrime + " + " + secondPrime;
			}
		}
		
		
		return output;
	}
}