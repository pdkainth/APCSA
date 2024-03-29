
import java.util.*;

/**
 *  Description of the Class
 *
 * @author Prabhdeep Kainth
 * period  #4
 */
public class Sorts{
  private long steps;

  /**
   *  Sets the count to 0
   */
  public Sorts(){
    steps = 0;
  }

  /**
   *  Description of the Method
   *
   * @param  list  reference to an array of integers to be sorted
   */
  public void bubbleSort(ArrayList <Comparable> list){
	//Add your code here
  	steps = 0;
  	System.out.println();
  	System.out.println("Bubble Sort");
  	System.out.println();
  	
  	for(int i = 0; i < list.size() - 1; i++) {
  		for(int j = 0; j < list.size() - 1 - i; j++) {
  			steps += 3;
  			if(list.get(j).compareTo(list.get(j + 1)) > 0) {
  				swap(list, j, j + 1);
  			}
  		}
  	}
	
	
  }

  /**
   *  Description of the Method
   *
   * @param  list  reference to an array of integers to be sorted
   */
  public void selectionSort(ArrayList <Comparable> list){
	//Add your code here
  	steps = 0;
  	System.out.println();
  	System.out.println("Selection Sort");
  	System.out.println();
  	
  	int min = 0;
  	
  	for(int i = 0; i < list.size() - 1; i++) {
  		min = i;
  		for(int j = i + 1; j < list.size(); j++) {
  			steps += 3;
  			if(list.get(min).compareTo(list.get(j)) > 0) {
  				min = j;
  			}
  		}
  		
  		swap(list, i, min);
  		
  	}
  }

  /**
   *  Description of the Method
   *
   * @param  list  reference to an array of integers to be sorted
   */
  public void insertionSort(ArrayList <Comparable> list){
	//Add your code here
  	steps = 0;
  	System.out.println();
  	System.out.println("Insertion Sort");
  	System.out.println();
  	
  	for(int i = 1; i < list.size(); i++) {
  		int pos = i;
  		steps++;
  		Comparable posEle = list.get(pos);
  		
  		while(pos > 0 && list.get(pos - 1).compareTo(posEle) > 0) {
  			steps += 4;
  			list.set(pos,  list.get(pos - 1));
  			pos--;
  		}
  		
  		steps += 3;
  		list.set(pos, posEle);
  	}
  	
  }


  /**
   *  Takes in entire vector, but will merge the following sections
   *  together:  Left sublist from a[first]..a[mid], right sublist from
   *  a[mid+1]..a[last].  Precondition:  each sublist is already in
   *  ascending order
   *
   * @param  a      reference to an array of integers to be sorted
   * @param  first  starting index of range of values to be sorted
   * @param  mid    midpoint index of range of values to be sorted
   * @param  last   last index of range of values to be sorted
   */
  private void merge(ArrayList<Comparable> a, int first, int mid, int last) {
  	
  	ArrayList <Comparable> left = new ArrayList();
  	ArrayList <Comparable> right = new ArrayList();
  	
  	for(int i = first; i <= mid; i++) {
  		steps++;
  		left.add(a.get(i));
  	}
  
  	for(int j = mid + 1; j <= last; j++) {
  		steps++;
  		right.add(a.get(j));
  	}
  	
  	int leftInd = 0;
  	int rightInd = 0;
  	int sortInd = first;
  	
  	while(sortInd <= last) {
  		
  		if(leftInd >= left.size()) {
  			steps+=2;
  			a.set(sortInd, right.get(rightInd));
  			rightInd++;
  		} else if(rightInd >= right.size()) {
  			steps+=2;
  			a.set(sortInd, left.get(leftInd));
  			leftInd++;
  		} else {
  			
    		Comparable leftVal = left.get(leftInd);
    		Comparable rightVal = right.get(rightInd);
  			steps+=2;
    		
  			steps++;
    		if((leftVal.compareTo(rightVal) <= 0)) {
    			steps++;
    			a.set(sortInd, leftVal);
    			leftInd++;
    		} else {
    			steps++;
    			a.set(sortInd, rightVal);
    			rightInd++;
    		}
  		}
  		
			sortInd++;
  	}
  	
  	printArray(a);
  }

  
  /**
   *  Recursive mergesort of an array of integers
   *
   * @param  a      reference to an array of integers to be sorted
   * @param  first  starting index of range of values to be sorted
   * @param  last   ending index of range of values to be sorted
   */
  public void mergeSort(ArrayList <Comparable> a, int first, int last){
	//Add your code here
  	if(first == last){
  		
  	} else if((first - last) == 1) {
  	
  		printArray(a);
  		steps += 3;
  		if(a.get(first).compareTo(a.get(last)) > 0) {
  			swap(a, first, last);
  			printArray(a);
  		} 
  		
  	} else {
    	int mid =(first + last) / 2;
    	
    	mergeSort(a, first, mid);
    	mergeSort(a, mid + 1, last);
    	merge(a, first, mid, last);
  		
  	}

  }
  
  /**
   *  Description of the Method
   * @param  a      reference to an array of integers to be sorted
   * @param  first  starting index of range of values to be sorted
   * @param  last   ending index of range of values to be sorted
   */
  public void quickSort(ArrayList<Comparable> a, int first, int last)
  {
	//Add your code here
  	int b = first;
  	int c = last;
  	int mid = (first + last) / 2;
  	
  	Comparable dividingValue = a.get(mid);
  	steps++; 
  	
  	do {
  		while(a.get(b).compareTo(dividingValue) < 0) {
  			steps += 2;
  			b++;
  		}
  		
  		while(a.get(c).compareTo(dividingValue) > 0) {
  			steps += 2;
  			c--;
  		}
  		
  		if(b <= c) {
  			swap(a, b, c);
  			b++;
  			c--;
  		}
  	} while(b < c);
  	
  	if(c > first) {
  		quickSort(a, first, c);
  	}
  	
  	if(b < last) {
  		quickSort(a, b, last);
  	}
  	
	
  }
  
  /**
   *  Accessor method to return the current value of steps
   * @return the amount of steps 
   */
  public long getStepCount(){
    return steps;
  }

  /**
   *  Modifier method to set or reset the step count. Usually called
   *  prior to invocation of a sort method.
   *
   * @param  stepCount   value assigned to steps
   */
  public void setStepCount(long stepCount){
    steps = stepCount;
  }
  
   /**
   *  Interchanges two elements in an ArrayList
   *
   * @param  list  reference to an array of integers
   * @param  a     index of integer to be swapped
   * @param  b     index of integer to be swapped
   */
  public void swap(ArrayList <Comparable> list, int a, int b){
	//replace these lines with your code
  	steps += 4;
  	Comparable temp = list.get(a);
  	list.set(a, list.get(b));
  	list.set(b, temp);
 }
  
  public void printArray(ArrayList <Comparable> a) {
  	for(Comparable b : a) {
  		System.out.print(b + "  ");
  	}
  	System.out.println();
  }
}