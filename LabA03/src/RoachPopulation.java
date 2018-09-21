/**
 * 
 * Prabhdeep Kainth
 * period 4
 *
 */
public class RoachPopulation {
	private int population; // roach population

	/**
	 * constructor initializes the roach population
	 * @param init - initial roach population
	 */
	public RoachPopulation(int init){
		population = init;
	}
	/**
	 * roach population doubles each time the roaches breed
	 */
	public void breed(){
		//double the population
		population *= 2;
	}
	
	/**
	 * roach population is reduced by 10% each time it is 
   	 * sprayed
	 */
	public void spray(){
		//population needs to be reduced by 10%
		//if its a decimal, it needs to be rounded up
		double testPop = population;
		testPop *= 0.9;
		
		//testing if the population has a decimal
		if((testPop % 1) > 0) {
			//rounding up to the next whole roach
			population *= 0.9;
			population ++;
		} else {
			//if popuation is a whole number, then keep the population
			population *= 0.9;
		}
	}
	
	/** 
	 * returns the current roach population
	 * @return number of roaches
	 */
	public int getRoaches(){
		return population;
	}
}