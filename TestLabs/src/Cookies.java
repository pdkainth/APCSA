
public class Cookies {

	private static String brandName;
	private int numberOfCookies;
	private double flourCups;
	private double sugarCups;
	private double butterCups;
	private double eggs;
	private double chocolateChipsPounds;
	private final int FLOUR_FACTOR = 5;
	private final int SUGAR_FACTOR = 20;
	private final int BUTTER_FACTOR = 20;
	private final int EGGS = 10;
	private final int BAG_FACTOR = 2;

	/**
	 * default constructor - initializes number of ingredients for 20 cookies
	 */
	public Cookies() {
		brandName = "Delicious Cookies";
		numberOfCookies = 20;
		calculateIngredients(numberOfCookies);
	}
	
	
	
	/**
	 * Constructor initializes ingredients for n cookies
	 * @param n - number of cookies
	 */
	public Cookies(int n) {
		brandName = "Delicious Coookies";
		numberOfCookies = n;
		calculateIngredients(numberOfCookies);
	}
	
	
	/**
	 * 
	 * @param c - cookie object
	 */
	public Cookies(Cookies c) {
		numberOfCookies = c.howManyCookies();
		calculateIngredients(numberOfCookies);
	}
	
	
	
	
	/**
	 * Calculates the amount of ingredients based on number of cookies
	 * @param n - number of cookies
	 */
	private void calculateIngredients(int n) {
		flourCups = (double) n / FLOUR_FACTOR;
		sugarCups = (double) n / SUGAR_FACTOR;
		butterCups = (double) n / BUTTER_FACTOR;
		eggs = (double) n / EGGS;
		chocolateChipsPounds = (double) n * BAG_FACTOR;
		
	}
	
	
	
	
	
	/**
	 * prints the recipe
	 */
	public void printRecipe() {
		System.out.println("Ingredients for " + numberOfCookies + " " + brandName + "\n");
		System.out.println("Mix all the ingredients in a bowl");
		System.out.println("Flour\t\t\t" + flourCups + " cups");
		System.out.println("Sugar\t\t\t" + sugarCups + " cups");
		System.out.println("Butter\t\t\t" + butterCups + " cups");
		System.out.println("Eggs\t\t\t" + eggs);
		System.out.println("Chocolate Chips\t\t" + chocolateChipsPounds + " pounds");
		System.out.println("Bake on a cookie sheet at 400 F for 20 mins\n");

	}
	
	
	
	
	
	/**
	 * Accessors
	 */
	/**
	 * 
	 * @return - brand name
	 */
	public String returnBrandName() {
		return brandName;
	}
	
	
	
	

	/**
	 * 
	 * @return - flour
	 */
	public double howMuchFlour() {
		return flourCups;
	}
	
	
	
	
	
	/**
	 * 
	 * @return - sugar
	 */
	public double howMuchSugar() {
		return sugarCups;
	}
	
	
	
	
	
	/**
	 * 
	 * @return - butter
	 */
	public double howMuchButter() {
		return butterCups;
	}
	
	
	
	
	
	/**
	 * 
	 * @return - eggs
	 */
	public double howManyEggs() {
		return eggs;
	}
	
	
	
	
	
	/**
	 * 
	 * @return- chocolate chips
	 */
	public double howManyChocolateChips() {
		return chocolateChipsPounds;
	}
	
	
	
	
	
	/**
	 * 
	 * @return - number of cookies
	 */
	public int howManyCookies() {
		return numberOfCookies;
	}
	
	
	
	
	
	/**
	 * Modifiers
	 */
	
	/**
	 * 
	 * @param name - sets the brand name
	 */
	public void setName(String name) {
		brandName = name;
	}
	
	
	
	

	/**
	 * 
	 * @param cups - sets the flour
	 */
	public void setFlour(double cups) {
		flourCups = cups;
	}
	
	
	

	/**
	 * 
	 * @param cups - sets the sugar
	 */
	public void setSugar(double cups) {
		sugarCups = cups;
	}
	
	
	
	

	/**
	 * 
	 * @param cups - sets the butter
	 */
	public void setButter(double cups) {
		butterCups = cups;
	}
	
	
	
	
	
	/**
	 * 
	 * @param egs - sets the amount of eggs
	 */
	public void setEggs(double amountOfEggs) {
		eggs = amountOfEggs;
	}
	
	
	
	
	
	/**
	 * 
	 * @param chips - sets the amount of chocolate chips
	 */
	public void setChocChips(double chips) {
		chocolateChipsPounds = chips;
	}
	
	
	
	
	
	/**
	 * 
	 * @param cookies - sets the number of cookies
	 */
	public void setCookies(int cookies) {
		numberOfCookies = cookies;
		calculateIngredients(cookies);
	}



	
}