import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
/**
 * 
 * @author last name: 
 * first name: 
 * student ID:
 * period #
 */
public class Store{

	//Your code goes here
	private ArrayList <Item> myStore = new ArrayList <Item>();
	private String fileName;
	
	/**
	 * Parameter constructor for the Store class
	 * @param fName - name of the file
	 */
	public Store(String fName) {
		fileName = fName;
		loadFile();
	}
	
	/**
	 * Default constructor for the Store class
	 */
	public Store() {
		
	}
	
	/**
	 * Loads the file into the arraylist
	 */
	private void loadFile() {
		Scanner inFile;
		
		try {
			inFile = new Scanner(new File(fileName));
			
			while(inFile.hasNext()) {
				int id = inFile.nextInt();
				int inv = inFile.nextInt();
				
				myStore.add(new Item(id, inv));
				
			}
		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
	}
	
	/**
	 * Starts the merge sort
	 */
	public void sort() {
		mergeSort(myStore, 0, myStore.size() - 1);
	}
	
	/**
	 * 
	 * @param a - arraylist of the Items
	 * @param first - first index
	 * @param mid - middle index
	 * @param last - last index
	 */
	private void merge(ArrayList <Item> a, int first, int mid, int last) {
  	ArrayList <Item> left = new ArrayList();
  	ArrayList <Item> right = new ArrayList();
  	
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
  			
    		Item leftVal = left.get(leftInd);
    		Item rightVal = right.get(rightInd);
    		
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
	private void mergeSort(ArrayList <Item> a, int first, int last) {
  	if(first == last){
  		
  	} else if((first - last) == 1) {
  	
  		if(a.get(first).compareTo(a.get(last)) > 0) {
  			Item temp = a.get(first);
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
	
	/**
	 * Method to display the store with formatting
	 */
	public void displayStore() {
		
		System.out.printf("%12s", "Id");
		System.out.printf("%10s", "Inv");
		System.out.println("\n");
 		
		for(int i = 0; i < myStore.size(); i++) {
			System.out.printf("%2d", (i + 1));
			System.out.printf("%10d", myStore.get(i).getId());
			System.out.printf("%10d", myStore.get(i).getInv());
			System.out.println();
			
			if((i + 1) % 10 == 0) {
				System.out.println();
			}
		}
	}
	
	/**
	 * Method to test the searches
	 */
	public void testSearch(){ 
    int idToFind; 
    int invReturn; 
    int index; 
    Scanner in = new Scanner(System.in); 

    System.out.println("Testing search algorithm\n"); 
    do{ 
        System.out.println(); 
        System.out.print("Enter Id value to search for (-1 to quit) --> "); 
        idToFind = in.nextInt(); 
        if (idToFind >= 0) { 
           index = bsearch(new Item(idToFind, 0)); 
           //recursive version call 
           //index = bsearch (new Item(idToFind, 0), 0, myStore.size()-1); 
           System.out.print("Id # " + idToFind + ": "); 
           if (index == -1){ 
                System.out.println(" No such part in stock"); 
            }else{ 
                System.out.println(" Inventory = " + myStore.get(index).getInv()); 
            } 
        } 
    } while (idToFind >= 0); 
	}
	
	/** 
	* Searches the myStore ArrayList of Item Objects for the specified 
	* item object using a iterative binary search algorithm 
	* 
	* @param idToSearch Item object containing id value being searched for 
	* @return index of Item if found, -1 if not found 
	*/ 

	private int bsearch(Item idToSearch){ 
	  
		int first = 0;
		int mid = 0;
		int last = myStore.size() - 1;
		
		while(first <= last) {
			mid = (first + last) / 2;
			
			if(myStore.get(mid).getId() < idToSearch.getId()) {
				first = mid + 1;
			} else if(myStore.get(mid).getId() > idToSearch.getId()) {
				last = mid - 1;
			} else {
				return mid;
			}
		}
		
		return -1; 
	} 
	
	/** 
	* Searches the specified ArrayList of Item Objects for the specified 
	* id using a recursive binary search algorithm 
	* 
	* @param idToSearch Id value being search for 
	* @param first Starting index of search range 
	* @param last Ending index of search range 
	* @return index of Item if found, -1 if not found 
	*/ 

	private int bsearch(Item idToSearch, int first, int last){ 
	  
		int mid = (first + last) / 2;
		
		while(first <= last) {
			mid = (first + last) / 2;
			
			if(myStore.get(mid).getId() < idToSearch.getId()) {
				bsearch(idToSearch, mid + 1, last);
			} else if(myStore.get(mid).getId() > idToSearch.getId()) {
				bsearch(idToSearch, first, mid - 1);
			} else {
				return mid;
			}
		}
		
		return -1; 
	} 
	
	
}


