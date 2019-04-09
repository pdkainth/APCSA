/**
 * 
 * last name: Kainth
 * first name: Prabhdeep
 * Student ID: 12089162
 * period: 4
 */
public class Word {
	//Your code here
	private String wrd;
	private int num;
	
	/**
	 * Default constructor for Word class
	 */
	public Word() {
		wrd = "";
		num = 0;
	}
	
	/**
	 * Parameter constructor for Word class
	 * @param wrd - word
	 */
	public Word(String wrd) {
		this.wrd = wrd;
		num = 1;
	}
	
	/**
	 * Accessor method for word
	 * @return word
	 */
	public String getString() {
		return wrd;
	}
	
	/**
	 * Accessor method for the word count
	 * @return word count
	 */
	public int getCount() {
		return num;
	}
	
	/**
	 * Modifier method for word 
	 * @param newWord - the new word
	 */
	public void setWord(String newWord) {
		wrd = newWord;
	}
	
	/**
	 * Increments the word count
	 */
	public void incrementCount() {
		num++;
	}
	
	/**
	 * Decrements the word count
	 */
	public void decrementCount() {
		num--;
	}
	
	/**
	 * Compares to another word
	 * @param w - other word
	 * @return integer representing comparison
	 */
	public int compareTo(Word w) {
		return wrd.compareTo(w.getString());
	}
	
	
}