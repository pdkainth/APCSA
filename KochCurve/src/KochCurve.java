/**
 * @author Prabhdeep Kainth
 * Period 4
 */
import gpdraw.*;

public class KochCurve {
	private SketchPadWithNoDelay myPaper;
	private DrawingTool myPencil;
	private int counter = 0;
	
	/**
	 * 
	 * @param length length of the window
	 * @param width width of the window
	 * @param x starting x coordinate
	 * @param y starting y coordinate
	 */
	public KochCurve(int length, int width, int x, int y) {
		myPaper = new SketchPadWithNoDelay(length, width, x, y);
		myPencil = new DrawingTool(myPaper);
		myPencil.setDirection(0);		

	}
	
	/**
	 * 
	 * @param level level of the koch curve
	 * @param length length of one koch curve
	 */
	public void drawSnowflake(int level, int length) {		
			//myPencil.turnLeft();
			drawKochCurve(level, length);
			myPencil.turnRight(120);
			drawKochCurve(level, length);
			myPencil.turnRight(120);
			drawKochCurve(level, length);
	}

	/**
	 * 
	 * @param level level of the koch curve
	 * @param length length of the koch curve
	 */
	public void drawKochCurve(double level, double length) {
			
			if(counter == 0) {
				myPencil.up();
				myPencil.setDirection(180);
				myPencil.forward(length / 2);
				myPencil.setDirection(90);
				myPencil.forward(length * Math.sin(Math.PI / 3) / 3);
				myPencil.setDirection(0);
				myPencil.down();
			}
			
			counter++;
			if(level <= 1) {
				myPencil.forward(length);
			} else {
				drawKochCurve(level - 1, (length / 3));
				myPencil.turnLeft(60);
				drawKochCurve(level - 1, (length / 3));
				myPencil.turnRight(120);
				drawKochCurve(level - 1, (length / 3));
				myPencil.turnLeft(60);
				drawKochCurve(level - 1, (length / 3));
			
			}
	}
	
	
}