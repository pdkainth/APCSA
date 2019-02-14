/**
 * @author Your name
 * @period #
 */
import java.io.File;
import java.io.IOException;
import java.util.Scanner;


public class Life {
	//instance variables
	private final int LENGTH = 20;
	private char[][] game = new char[LENGTH][LENGTH];
	private final char ALIVE = '*';
	private final char DEAD = ' ';
	private int numLiving = 0;
	
	
	//Your code goes here
	
	/** constructor
	 * reads in the data from the given file and sets up the 
	 * life matrix
	 * @param fname - name of file
	 */
	public Life(String fname)
	{
		//Your code goes here
		try {
			Scanner in = new Scanner(new File(fname));
			numLiving = in.nextInt();
			
			while(in.hasNext()) {
				game[in.nextInt() - 1][in.nextInt() - 1] = ALIVE;
				
			}
		} catch(IOException e) {
			System.out.println(e.getMessage());
		}
		
		for(int row = 0; row < LENGTH; row++) {
			for(int col = 0; col < LENGTH; col++) {
				if(game[row][col] != ALIVE) {
					game[row][col] = DEAD;
				}
			}
		}
		
	}
	
	
	/**
	 * method to print the life matrix
	 */
	public void printMatrix()
	{
		//Your code goes here
		System.out.println("    12345678901234567890\n");
		for(int row = 0; row < LENGTH; row++) {
			System.out.print((row + 1) + "   ");
			for(int col = 0; col < LENGTH; col++) {
				System.out.print(game[row][col]);
			}
			System.out.println();
		}
	}
	
	/**
	 * Method to count the number of neighbors of the given cell
	 * in the life matrix
	 * @param row - row number
	 * @param col - column number
	 * @return - number of neighbors of the given cell
	 */
	public int numberOfNeighbors(int row, int col)
	{
		//Your code goes here
		int temp[][] = new int[LENGTH + 2][LENGTH + 2];
		for(int r = 0; r < LENGTH + 2; r++) {
			temp[r][0] = 0;
			temp[r][LENGTH + 1] = 0;
		}
		
		for(int c = 0; c < LENGTH + 2; c++) {
			temp[0][c] = 0;
			temp[LENGTH + 1][c] = 0;
		}
		
		for(int r = 1; r < LENGTH + 1; r++) {
			for(int c = 1; c < LENGTH + 1; c++) {
				if(game[r-1][c-1] == ALIVE) {
					temp[r][c] = 1;
				} else {
					temp[r][c] = 0;
				}
			}
		}
		
		row++;
		col++;
		return temp[row - 1][col - 1] + temp[row - 1][col] + temp[row - 1][col + 1] + temp[row][col - 1] 
				+ temp[row][col + 1] + temp[row + 1][col - 1] + temp[row + 1][col] + temp[row + 1][col + 1];
		
	}
	/**
	 * method to determine if given cell is empty
	 * @param row - cell row number
	 * @param col - cell column number
	 * @return true if it is empty, false otherwise
	 */
	private boolean isEmpty(char[][] mat, int row, int col)
	{
		//Your code goes here
		if(mat[row][col] == DEAD) {
			return true;
		}
		
		return false;
	}
	
	/** 
	 * method that simulates the game of life
	 */
	public void generation()
	{
		//Your code goes here
		
		char[][] nextGen = new char[LENGTH][LENGTH];
		int x = 0, y = 0, z = 0;
		for(int row = 0; row < LENGTH; row++) {
			for(int col = 0; col < LENGTH; col++) {
				int num = numberOfNeighbors(row, col);
				
				if(!isEmpty(game, row, col) && ((num < 2) || (num > 3))) {
					nextGen[row][col] = DEAD;
					numLiving--;
					x++;
				} else if((isEmpty(game, row, col)) && (num == 3)) {
					nextGen[row][col] = ALIVE;
					numLiving++;
					y++;
				} else {
					nextGen[row][col] = game[row][col];
					z++;
				}
 
					
			}
		}
		//System.out.println("x, y, z: " + x + " " + y + " " + z);
		game = nextGen;

	}
	
	/**
	 * Method to print the statistics
	 */
	public void printStatistics()
	{
		//Your code goes here
		int row10 = 0;
		for(int col = 0; col < LENGTH; col++) {
			if(game[9][col] == ALIVE) {
				row10++;
			}
		}
		
		int col10 = 0;
		for(int row = 0; row < LENGTH; row++) {
			if(game[row][9] == ALIVE) {
				col10++;
			}
		}
		
		System.out.println("Number in Row 10 ---> " + row10);
		System.out.println("Number in Column 10 ---> " + col10);
		System.out.println("Number of living organisms ---> " + numLiving);

		
	}
}