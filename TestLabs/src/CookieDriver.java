
public class CookieDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cookies myCookie = new Cookies();
		myCookie.printRecipe();

		Cookies myCookie2 = new Cookies(30);
		myCookie2.printRecipe();
		myCookie2.setName("Devine Cookies");
		
		myCookie.printRecipe();
		myCookie2.printRecipe();
		
		Cookies myCookie3 = new Cookies(myCookie);
		myCookie3.printRecipe();
		
	}

}
