/**
 * 
 * @author Prabhdeep Kainth
 * Period 4
 * Richter Scale class determines the amount of damage to structures based on the damage given by Richter Scale
 */

public class RichterScale {
	
	/**
	 * Returns the amount of damage based on the damage
	 * @param damage - how much damage the richter scale reads
	 */
	public static void getEffect(double damage) {
		if(damage >= 8) {
			System.out.println("Most structures fall");
		} else if (damage >= 7) {
			System.out.println("Many buildings destroyed");
		} else if(damage >= 6) {
			System.out.println("Many buildings considerably damaged, some collapse");
		} else if(damage >= 4.5) {
			System.out.println("Damage to poorly constructed buildings");
		} else {
			System.out.println("No destruction of buildings");
		}
	}

}
