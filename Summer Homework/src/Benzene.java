/*@author Prabhdeep Kainth
 * Period 4
 * This program uses the drawing tool draw a model of Benzene, a circle surrounded by a hexagon.
 */

import gpdraw.*;

public class Benzene {
	private DrawingTool myPencil;
	private SketchPad myPaper;

	public Benzene() {
		myPaper = new SketchPad(500, 500);
		myPencil = new DrawingTool(myPaper);
	}
	
	public void draw() {
		//inside circle
		myPencil.drawCircle(100);

		myPencil.up();
		myPencil.move(0, 150);
		myPencil.down();

		//outside hexagon
		myPencil.turnRight(120);
		myPencil.forward(150);

		myPencil.turnRight(60);
		myPencil.forward(150);

		myPencil.turnRight(60);
		myPencil.forward(150);

		myPencil.turnRight(60);
		myPencil.forward(150);

		myPencil.turnRight(60);
		myPencil.forward(150);

		myPencil.turnRight(60);
		myPencil.forward(150);

	}
}
