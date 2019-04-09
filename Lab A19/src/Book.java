import java.util.ArrayList;
/**
 * 
 * last name:
 * first name:
 * Student ID:
 * period:
 */
public class Book {
	
	ArrayList<IndexedWord> words = new ArrayList<IndexedWord>(); //list of indexed words
	ArrayList<String> ignoreList = new ArrayList<String>();//list of words to ignore
	
	
	//Do not add any other fields
	/**
	 * Creates a list of ignored words
	 */
	private void createIgnoreList(){
		//Do not modify this
		ignoreList.add("a");
		ignoreList.add("an");
		ignoreList.add("and");
		ignoreList.add("as");
		ignoreList.add("at");
		ignoreList.add("for");
		ignoreList.add("he");
		ignoreList.add("her");
		ignoreList.add("him");
		ignoreList.add("if");
		ignoreList.add("in");
		ignoreList.add("is");
		ignoreList.add("it");
		ignoreList.add("not");
		ignoreList.add("of");
		ignoreList.add("on");
		ignoreList.add("or");
		ignoreList.add("she");
		ignoreList.add("the");
		ignoreList.add("to");
		ignoreList.add("was");
		ignoreList.add("were");
		ignoreList.add("with");
		ignoreList.add("you");
		ignoreList.add("your");
		ignoreList.add("youre");
	}
	
	
	/**
	 * Constructs a list of indexed words from a list of pages
	 * The list of pages contains a list of words on each page
	 * Also prints the list of indexed words
	 * @param book - list of pages where each page is a list of words
	 */
	public Book(ArrayList<ArrayList<String>> book) {
		//Your code goes here
		createIgnoreList();
		for(int i = 0; i < book.size(); i++) {
			ArrayList <String> page = book.get(i);
			Sort(page);
			for(int j = 0; j < page.size(); j++) {
				String temp = page.get(j);
				
				boolean ignore = false;
				for(String s : ignoreList) {
					if(s.equals(temp.toLowerCase())) {
						ignore = true;
					}
				}
				
				
				int index = indexOf(temp);
				
				if(!ignore) {
					if(index < 0) {
						words.add(new IndexedWord(temp, (i + 1)));
					} else {
						words.get(index).addPageNumber(i + 1);
					}
				}
			}
			
			
			
			
		}
		
		System.out.println(toString());
		
	}
	
	
	/**
	 * Determines the index of the given word in the list of indexed words
	 * @param word - word to search for
	 * @return index of the word in words
	 */
	private int indexOf(String word) {
		//Your code goes here
		for(int i = 0; i < words.size(); i++) {
			if(word.equalsIgnoreCase(words.get(i).getWord())) {
				return i;
			}
		}
	
		return -1;
	}

	/**
	 * Returns a string of indexed words along with the list of pages
	 * it occurs on. Each word is on a separate line
	 * @return list of words along with their page numbers
	 */
	public String toString(){
		//Your code goes here
		
		String s = "";
		for(IndexedWord i : words) {
			s += i.toString();
		}
		
		return s;
	}
	
	
	
	
	/**
	 * Performs merge sort on the given list of words
	 * @param list - list of words to sort
	 */
	public void Sort(ArrayList<String> list) {
		//Your code goes here
		mergeSort(list, 0, list.size() - 1);
	}
		
	/**
	 * 
	 * @param a - arraylist of the pages
	 * @param first - first index
	 * @param mid - middle index
	 * @param last - last index
	 */
	private void merge(ArrayList <String> a, int first, int mid, int last) {
  	ArrayList <String> left = new ArrayList();
  	ArrayList <String> right = new ArrayList();
  	
  	for(int i = first; i <= mid; i++) {
  		left.add(a.get(i));
  	}
  
  	for(int j = mid + 1; j <= last; j++) {
  		right.add(a.get(j));
  	}
  	
  	int leftInd = 0;
  	int rightInd = 0;
  	int sortInd = first;
  	
  	while(sortInd <= last) {
  		
  		if(leftInd >= left.size()) {
  			a.set(sortInd, right.get(rightInd));
  			rightInd++;
  		} else if(rightInd >= right.size()) {
  			a.set(sortInd, left.get(leftInd));
  			leftInd++;
  		} else {
  			
    		String leftVal = left.get(leftInd);
    		String rightVal = right.get(rightInd);
    		
    		if((leftVal.compareTo(rightVal) <= 0)) {
    			a.set(sortInd, leftVal);
    			leftInd++;
    		} else {
    			a.set(sortInd, rightVal);
    			rightInd++;
    		}
  		}
  		
			sortInd++;
  	}
  	
	}
	
	/**
	 * 
	 * @param a - arraylist of items
	 * @param first - first index
	 * @param last - last index
	 */
	private void mergeSort(ArrayList <String> a, int first, int last) {
  	if(first == last){
  		
  	} else if((first - last) == 1) {
  	
  		if(a.get(first).compareTo(a.get(last)) > 0) {
  			String temp = a.get(first);
  			a.set(first, a.get(last));
  			a.set(last, temp);
  		} 
  		
  	} else {
    	int mid = (first + last) / 2;
    	
    	mergeSort(a, first, mid);
    	mergeSort(a, mid + 1, last);
    	merge(a, first, mid, last);
  		
  	}

	}


	
}