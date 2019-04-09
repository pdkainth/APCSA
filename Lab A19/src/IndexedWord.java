import java.util.ArrayList;
/**
 * 
 * last name: Kainth
 * first name: Prabhdeep
 * Student ID: 12089162
 * period: 4
 */
public class IndexedWord {
	
	private String word;
	private ArrayList<Integer> pageNumber = new ArrayList<Integer>();//list of pages
	
	
	
	/**
	 * Constructs a new indexed word and adds the page number
	 * @param w - word to index
	 * @param p - page number
	 */
	public IndexedWord(String w, int p){
		//Your code goes here
		word = w;
		pageNumber.add(p);
	}
	
	
	
	
	/**
	 * returns the word
	 * @return index word
	 */
	public String getWord(){
		//Your code goes here
		return word;
	}
	
	
	
	/**
	 * returns the list of page numbers
	 * @return list of numbers
	 */
	public ArrayList<Integer> getPageNumber(){
		//Your code goes here
		return pageNumber;
	}
	
	
	
	/**
	 * sets the word
	 * @param w - word
	 */
	public void setWord(String w){
		//Your code goes here
		word = w;
	}

	
	
	/**
	 * adds a page number to the list
	 * @param p - page number
	 */
	public void addPageNumber(int p){
		//Your code goes here
		pageNumber.add(p);
	}

	
	
	/**
	 * Returns a string of word and list of page numbers to print
	 * @return word and page numbers as a String
	 */
	public String toString(){
		//Your code goes here
		cleanPage();
		String output = "";
		output += (word + " [" + pageNumber.get(0));
		for(int i = 1; i < pageNumber.size() ; i++) {
			output += (  ", " + pageNumber.get(i));
		}
		output += "]\n";
		
		return output;
	}
	
	private void cleanPage() {
		int i = 0;
		while(i < pageNumber.size() - 1) {
			if(pageNumber.get(i) == pageNumber.get(i + 1)) {
				pageNumber.remove(i + 1);
			} else {
				i++;
			}
		}
	}
}