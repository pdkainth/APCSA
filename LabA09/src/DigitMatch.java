/**
 *   
 * @author Prabhdeep Kainth
 * Period #4
 */
public class DigitMatch {
	private int matches = 0;
	private int count = 1;
	
	public int countMatch(int a, int b) {
		
		
		if(count != 1) {
			
			if(a == 0 || b == 0) {
				int fakeMatch = matches;
				matches = 0;
				count = 1;
				return fakeMatch;
			}
		}
		
		if(a % 10 == b % 10) {
			matches++;
		}
		count++;
		return countMatch( (a / 10), (b / 10));
		
		
	}
	

	
}
