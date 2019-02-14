import java.util.*;

import javax.swing.plaf.synth.SynthSeparatorUI;

import java.io.*;


/**
 * Chapter AB23 - Two-Dimensional Arrays Exercises
 * 
 * @author Prabhdeep Kainth
 * @author Period 4
 * @author Assignment - MatrixManipulator
 */
public class MatrixManipulator
{
    /**
     * Finds the sum of all the elements in the array
     * @param data - the array to be summed
     * @return sum of all the elements 
     */
    public int sumOfAllArrayElements( int[][] data )
    {

        // declare the sum
        int sum = 0;

        // compute the sum
        for(int i = 0; i < data.length; i++) {
        	for(int j = 0; j < data[i].length; j++) {
        		sum += data[i][j];
        	}
        }
    	
    	
        return sum;
    }


    /**
     * Finds the sum of each row
     * @param data - array to be summed
     * @return array with the sum of each row
     */
    public int[] sumOfEachRow( int[][] data )
    {
        // declare the row sum array
        int[] rowSums = new int[data.length];
        // compute the sums for each row
        for ( int row = 0; row < data.length; row++ )
        {
        		int total = 0;
            // initialize the sum
        		for(int i = 0; i < data[row].length; i++) {
        			total += data[row][i];
        		}
            // compute the sum for this row
            
        		rowSums[row] = total;
            
        }

        return rowSums;
    }


    /**
     * Finds the sum of each column
     * @param data - array to be summed
     * @return array with the sum of each column
     */
    public int[] sumOfEachColumn( int[][] data )
    {
        // find the longest row
        int max = data[0].length;
        for(int row = 1; row < data.length; row++) {
        	if(data[row].length > max) {
        		max = data[row].length;
        	}
        }
        // declare the col sum array
    	
        int[] colSums = new int[max];
    	// compute the sum of each column
        for(int c = 0; c < max; c++) {
        	colSums[c] = 0;

        	for(int r = 0; r < data.length; r++) {
        		if(data[r].length > c) {
          		colSums[c] += data[r][c];
        		}
        	}
        	
        }

        return colSums;
    }

    /**
     * Determines if array is a magic square
     * @param data - array to be analyzed
     * @return true/false whether array is magic square
     */
    public boolean isMagic( int[][] data )
    {
    	//check if the array is a magic square. This means that it must be square, 
    	//and that all row sums, all column sums, and the two diagonal-sums 
    	//must all be equal.
    	
    	int height = data.length;
    	//check if square
    	for(int i = 0; i < height; i++) {
    		if(data[i].length != height) {
    			return false;
    		}
    	}
    	
    	//now its okay to assume that data is a square (same height and width)
    	int[] col = this.sumOfEachColumn(data);
    	int[] row = this.sumOfEachRow(data);
    	int[] dia = {0, 0};
    	
    	for(int i = 0; i < height; i++) {
    		dia[0] += data[i][i];
    	}
    	
    	for(int j = 0; j < height; j++) {
    		dia[1] += data[j][height - j - 1];
    	}
    	
    	for(int c = 0; c < col.length; c++) {
    		for(int r = 0; r < row.length; r++) {
    			for(int d = 0; d < dia.length; d++) {
    				if(!(col[c] == row[r] && row[r]== dia[d])) {
    					return false;
    				}
    			}
    		}
    	}
    	
    	return true;
    }
    
    
    /**
     * Finds max and min of each array
     * @param data - array to be analyzed
     * @return max and min of array
     */
    public int[] maxAndMinElements( int[][] data )
    {
        // declare the max and the min
        int max = data[0][0];
        int min = data[0][0];
        
        for(int row = 0; row < data.length; row++) {
        	for(int col = 0; col < data[row].length; col++) {
        		if(data[row][col] > max) {
        			max = data[row][col];
        		}
        		
        		if(data[row][col] < min) {
        			min = data[row][col];
        		}
        		
        	}
        }

        
        int[] result = { max, min };
        return result;
    }


    /**
     * Finds the largest element
     * @param data - array to be analyzed
     * @return largest element in each row
     */
    public int[] largestElements( int[][] data )
    {
        // declare the largest in row array
        int[] largestInRow = new int[data.length];

        // find the largest element in each row
        for(int row = 0; row < data.length; row++) {
        	int max = data[row][0];
        	for(int col = 0; col < data[row].length; col++) {
        		if(data[row][col] > max) {
        			max = data[row][col];
        		}
        	}
        	
        	largestInRow[row] = max;
        }

        return largestInRow;
    }


    /**
     * Reverses each row
     * @param data - array to be reversed
     * 
     */
    public void reversalOfElementsInEachRow( int[][] data )
    {
    	// reverse each row and print it
    	for(int r = 0; r < data.length; r++) {
    		for(int c = 0; c < data[r].length / 2; c++) {
    			int temp = data[r][c];
    			data[r][c] = data[r][data[r].length - 1 - c];
    			data[r][data[r].length - 1 - c] = temp;
    		}
    	}
    	
    	for(int r = 0; r < data.length; r++) {
    		for(int c = 0; c < data[r].length; c++) {
    			System.out.print(data[r][c] + " ");
    		}
    		System.out.println();
    	}
    }


    /**
     * Smoothens the image
     * @param image - image to be smoothened
     * @return smoothened image
     */
    public int[][] imageSmootherEasy( int[][] image )
    {
        // assume a rectangular image
        int[][] smooth = new int[image.length][image[0].length];

        // Compute the smoothed value for
        // non-edge locations in the image.

        for(int r = 1; r < smooth.length - 1; r++) {
        	for(int c = 1; c < smooth[0].length - 1; c++) {
        		smooth[r][c] = (image[r-1][c-1] + image[r-1][c] + image[r-1][c+1] + image[r][c-1]
        				+ image[r][c] + image[r][c+1] + image[r+1][c-1] + image[r+1][c] + image[r+1][c+1]) / 9;
        	}
        }
        

        return smooth;
    }



    /**
     * Smoothens the image
     * @param image - image to be smoothened
     * @return smoothened image
     */
    public int[][] imageSmootherHard( int[][] image )
    {
        // assume a rectangular image
        int[][] smooth = new int[image.length][image[0].length];

        // Compute the smoothed value for all 
        // locations in the image.
        int[][] smooth2 = new int[smooth.length + 2][smooth[0].length + 2];
        
        for(int r = 0; r < smooth2.length; r++) {
        	smooth2[r][0] = 0;
        	smooth2[r][smooth[0].length - 1] = 0;
        }
        
        for(int c = 0; c < smooth2[0].length; c++) {
        	smooth2[0][c] = 0;
        	smooth2[smooth.length - 1][c] = 0;
        }
        
       for(int r = 0; r < image.length; r++) {
      	 for(int c = 0; c < image[0].length; c++) {
      		 smooth2[r + 1][c + 1] = image[r][c];
      	 }
       }
        
       smooth2 = this.imageSmootherEasy(smooth2);
       
       for(int r = 0; r < smooth.length; r++) {
      	 for(int c = 0; c < smooth[0].length; c++) {
      		 smooth[r][c] = smooth2[r+1][c+1];
      	 }
       }
       
        return smooth;
    }



}