/**
 * 
 * Last name: Kainth
 * First name: Prabhdeep
 * Student ID: 12089162
 * Period: 4
 *
 */
public class SingingRectangle extends Rectangle{
	//Your code goes here
	
	public SingingRectangle(double l, double w) {
		super(l, w);
	}
	
	public String toString() {
		String output = super.toString();
		output += "\nRectangle Song:";
		output += "\n       I'm a rectangle.\n";
		output += "       You can see.\n";
		output += "       I have four sides.\n";
		output += "       Count with me\n";
		output += "       2 are short and 2 are long.\n";
		output += "       Come along and sing my song.";
		
		return output;
	}
}