/*@author Prabhdeep Kainth
 * Period 4
 * This program uses the drawing tool to draw a simple house
 */

import gpdraw.*;

public class DrawHouse {
	private DrawingTool myPencil;
	private SketchPad myPaper;
	
	public DrawHouse() {
		myPaper = new SketchPad(500, 500);
		myPencil = new DrawingTool(myPaper);
	}
	
	public void draw() {
	  //main house
	  myPencil.up();
		myPencil.move(-200, -150);
		myPencil.down();
		myPencil.move(-200, 50);
		myPencil.turnRight(90);
		myPencil.forward(400);
		myPencil.turnRight(90);
    myPencil.forward(200);
    myPencil.turnRight(90);
    myPencil.forward(400);
    
    //roof
    myPencil.up();
    myPencil.move(-200, 50);
    myPencil.down();
    myPencil.move(0, 200);
    myPencil.move(200, 50);
    
    //door
    myPencil.up();
    myPencil.move(-25, -150);
    myPencil.down();
    myPencil.move(-25, -50);
    myPencil.turnRight(90);
    myPencil.forward(50);
    myPencil.turnRight(90);
    myPencil.forward(100);
    myPencil.turnRight(90);
    myPencil.forward(50);
    
    //windows
    myPencil.up();
    myPencil.move(-150, -25);
    myPencil.down();
    myPencil.move(-150, 25);
    myPencil.turnRight(90);
    myPencil.forward(50);
    myPencil.turnRight(90);
    myPencil.forward(50);
    myPencil.turnRight(90);
    myPencil.forward(50);
    
    myPencil.up();
    myPencil.move(100, -25);
    myPencil.down();
    myPencil.move(100, 25);
    myPencil.turnRight(90);
    myPencil.forward(50);
    myPencil.turnRight(90);
    myPencil.forward(50);
    myPencil.turnRight(90);
    myPencil.forward(50);
	}
}

