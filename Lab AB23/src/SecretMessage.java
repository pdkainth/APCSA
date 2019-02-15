import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/**
 * @author Prabhdeep Kainth
 * period #4
 */

public class SecretMessage {
	private char[][] message;
	private char[][] cover;
	private final int maxColumns = 80;
	private int startRow;
	private int startCol;
	//Do not add any other instance variables
	
	/**
	 * Constructor to read the plain text messages and the cover 
	 * messages from the given file.
	 * Calls getSecretMessage to reveal the secret message from under
	 * the cover. Then prints the secret message 
	 * @param fname - file name
	 */
	public SecretMessage(String fname){
		//Your code goes here
		int testCase = 0;
		Scanner in;
		int numLinesMessage = 0;
		int numLinesCover = 0;

		try {
			in = new Scanner(new File(fname));
			testCase = in.nextInt();
			for(int i = 0; i < testCase; i++) {
				numLinesMessage = in.nextInt();
				
				String randomLine = in.nextLine();
				message = new char[numLinesMessage][maxColumns];
				for(int lines = 0; lines < numLinesMessage; lines++) {
					String oneLine  = in.nextLine();
//					System.out.println(oneLine);
					for(int index = 0; index < oneLine.length(); index++) {
						message[lines][index] = oneLine.charAt(index);
					}
				}
				
				
				startRow = in.nextInt();
				startCol = in.nextInt();
				
				numLinesCover = in.nextInt();
				String randomLine2 = in.nextLine();
				
				cover = new char[numLinesCover][maxColumns];
				for(int lines = 0; lines < numLinesCover; lines++) {
					String oneLine  = in.nextLine();
//					System.out.println(oneLine);
					for(int index = 0; index < oneLine.length(); index++) {
						cover[lines][index] = oneLine.charAt(index);
					}
				}
				
				System.out.println(getSecretMessage());

			}
			
			
		} catch (IOException e){
			System.out.println(e.getMessage());
		}
		
		
	}
	/**
	 * Method that extracts the secret message from under the cover
	 * cover is placed at startRow and startCol. If the element in cover
	 * is 'O', the corresponding letter in the message is extracted
	 * @return the secret message
	 */
	public String getSecretMessage(){
		//Your code goes here
//		System.out.println("Start row: " + startRow + " Start col: " + startCol);
		String secretMessage = "";
		for(int row = 0; row < cover.length; row++) {
			for(int col = 0; col < cover[row].length; col++) {
				if(cover[row][col] == 'O') {
//					System.out.println("Row: " + row + " Col: " + col);
					secretMessage += message[startRow + row][startCol + col]; 
				}
			}
		}
		
		return secretMessage;
	}
}