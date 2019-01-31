import java.util.Scanner;

/** Class to simulate the game of Tic Tac Toe
 * 
 * @author Prabhdeep Kainth
 * period #4
 *
 */
public class TicTacToe {
	private final int BOARD_SIZE = 9;
	//Your code goes here
	private char[] board = new char[BOARD_SIZE];
	private char currentPlayer; 

	/** constructor to initialize the board to '-' and myPlayer to 'X'
	 * 
	 */
	public TicTacToe() {
		for(int i = 0; i < BOARD_SIZE; i++) {
			board[i] = '-';
		}
		
		currentPlayer = 'X';
	}
	
	
	/**
	 * Checks if the move location is not already occupied
	 * Returns true if it is not already occupied and false otherwise
	 * @param loc - move location where X or O is to be placed on the board
	 * @return true if the location is not already occupied by X or O,
	 * 		   false otherwise
	 */
	private boolean isOccupied(int loc) {
		//Your code goes here
		if(board[loc] != '-') {
			return true;
		} else {
			return false;
		}
		
	}
	
	
	/**
	 * Perform one move for the given player if the given location is
	 * unoccupied 
	 * @param player - current player (X or O)
	 * @param loc - move location where X or O is to be placed on the board
	 * @return true if the move is made, false otherwise
	 */
	private boolean move(char player, int loc) {
		//Your code goes here
		if(isOccupied(loc) == false) {
			board[loc] = player;
			return true;
		} else {
			return false;
		}
		
	}
	
	
	/**
	 * Returns '-' if there is a '-' found on the board and 't' otherwise
	 * @return '-' if '-' is found on the board, otherwise return 't' to 
	 * 			   indicate a tie
	 */
	private char tie() {
		//Your code goes here
		
		for(int i = 0; i < BOARD_SIZE; i++) {
			if(board[i] == '-') {
				return '-';
			}
		}
		
		return 't';
		
	}

	/**
	 * Checks to see if the game is over. If the game is over, is there a winner. 
	 * If there is a winner, returns 'X' or 'O'.
	 * If the game is over but there is no winner returns 't' indicating a tie
	 * If the game is not over, returns a '-'
	 * @return 'X' or 'O' or '-' or 't'
	 */
	private char whoWon() {
		//Your code goes here
		boolean row1 = isMatch(getRow(0));
		boolean row2 = isMatch(getRow(3));
		boolean row3 = isMatch(getRow(6));
		
		boolean column1 = isMatch(getColumn(0));
		boolean column2 = isMatch(getColumn(1));
		boolean column3 = isMatch(getColumn(2));
		
		boolean diagonal1 = isMatch(getDia(0));
		boolean diagonal2 = isMatch(getDia(2));
		
		boolean row = row1 || row2 || row3;
		boolean column = column1 || column2 || column3;
		boolean diagonal = diagonal1 || diagonal2;
		
		boolean didWin =  (row || column || diagonal);
		
		if(didWin) {
			//figure out who it is
			
			if(row) {
				if(row1) {
					return board[0];
				}
				
				if(row2) {
					return board[3];
				}
				
				if(row3) {
					return board[6];
				}

			} else if(column) {
				if(column1) {
					return board[0];
				}
				
				if(column2) {
					return board[1];
				}
				
				if(column3) {
					return board[2];
				}
				
			} else if(diagonal) {
				if(diagonal1) {
					return board[0];
				}
				
				if(diagonal2) {
					return board[2];
				}
				
				
			}
			
			
		} 
		
		return tie();
	}
	/**
	 * Prints the board as a 3x3 grid
	 */
	private void printBoard() {
		//Your code goes here
		System.out.println(board[0] + " " + board[1] + " " + board[2]);
		System.out.println(board[3] + " " + board[4] + " " + board[5]);
		System.out.println(board[6] + " " + board[7] + " " + board[8]);

	}
	/**
	 * Determines whose turn it is. The first player is always X
	 * @param turnNumber - number of the turn
	 * @return - 'X' or 'O' based on whose turn it is
	 */
	private char determineCurrentPlayer(int turnNumber){
		//Your code goes here
		
		if(turnNumber % 2 == 1) {
			return 'X';
		} else {
			return 'O';
		}
	}
	/**
	 * Plays the game of tic tac toe till the game is over
	 */
	public void playGame() {
		//Your code goes here
		printBoard();
		Scanner in = new Scanner(System.in);
		int turn = 0;
		while(whoWon() == '-') {
			turn++;
			
			char current = determineCurrentPlayer(turn);
			boolean validPos = false;
			int pos = 0;
			while(!validPos) {
				System.out.print("Player " + current + " enter a location to place " + current + " : ");
				pos = in.nextInt();
				
				if(pos < 0 || pos > 8) {
					System.out.println("Location selected (" + pos + ") is not valid. Enter a number between 0 and 8 inclusive");
				} else if(isOccupied(pos)) {
					System.out.println("The location selected (" + pos + ") is occupied.");
				} else {
					move(current, pos);
					validPos = true;
				}
			}
			
			printBoard();
			
		}
		char current = determineCurrentPlayer(turn);
		
		if(whoWon() == 't') {
			System.out.println("Its a tie!");
		} else {
			System.out.println("Player " + current + " won!");
		}
}
	
	private char[] getRow(int start) {
		char[] row = new char[3];
		
		row[0] = board[start];
		row[1] = board[start + 1];
		row[2] = board[start + 2];
		
		return row;
	}
	
	private char[] getColumn(int start) {
		char[] column = new char[3];
		
		column[0] = board[start];
		column[1] = board[start + 3];
		column[2] = board[start + 6];
		
		return column;
	}
	
	private char[] getDia(int start) {
		char[] diagonal = new char[3];
		
		if(start == 0) {
			diagonal[0] = board[start];
			diagonal[1] = board[start + 4];
			diagonal[2] = board[start + 8];
			
		} else if(start == 2) {
			diagonal[0] = board[start];
			diagonal[1] = board[start + 2];
			diagonal[2] = board[start + 4];
			
		}
		
		return diagonal;
	}
	
	private boolean isMatch(char[] c) {
		if(c[0] == c[1] && c[1] == c[2]) {
			return true;
		} else {
			return false;
		}
	}
}