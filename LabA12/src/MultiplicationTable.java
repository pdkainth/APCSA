/**
 * 
 * @author Prabhdeep Kainth
 * Period #4
 *
 */
public class MultiplicationTable {
    /**
     * Method to print the multiplication
     * table for the given number of rows and columns
     * @param nrows - number of rows
     * @param ncols - number of columns
     */
	public void printTable(int nrows, int ncols)
	{
		//Your code goes here

		//printing out column number
		for(int column = 1; column <= ncols; column++) {

			if(column == 1) {
				System.out.printf("%9d", column);
			} else {
				System.out.printf("%7d", column);
			}
			
		}
		
		System.out.println();
		System.out.println();
		
		//printing out rows
		for(int rows = 1; rows <= nrows; rows++) {
			System.out.printf("%2d", rows);
			for(int column = 1; column <= ncols; column++) {
				System.out.printf("%7d", (rows * column));
			}
			System.out.println();
		}
		
	}
}