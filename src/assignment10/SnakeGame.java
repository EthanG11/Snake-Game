package assignment10;

import java.awt.event.KeyEvent;
import edu.princeton.cs.introcs.StdDraw;

public class SnakeGame {
	//TODO: Implement the game of snake
	//		You may add other files/classes, but the game should start by running this file
	public static void main(String[] args) {

		StdDraw.enableDoubleBuffering();  // Probably want to do this
		// TODO: Remember that you will need to call StdDraw.show()
		//       every time you want to show something on the screen!
		
			
		// TODO: This is an example of how you can determine if a 
		// key is currently being pressed.  Test it:
		//  1. Run it.
		//  2. Click on the StdDraw window (and/or watch the "Console" in Eclipse)
		//  3. Press/release the left arrow to see it change the background
		//  X. When you're done you can press the space bar to exit.
		// (Replace/update the code below with code for your game!)
		boolean done = false;
		while(!done) {
			// While this is running press the left arrow
			// Other "KeyEvents" you may want:  
			//    KeyEvent.VK_LEFT, KeyEvent.VK_RIGHT, KeyEvent.VK_UP, KeyEvent.VK_DOWN
			//    And you can type KeyEvent. to see other options
			if(StdDraw.isKeyPressed(KeyEvent.VK_LEFT)) {
				System.out.println("Left arrow pressed");
				StdDraw.clear(StdDraw.BOOK_LIGHT_BLUE);
			} else {
				System.out.println("No key pressed");
				StdDraw.clear(StdDraw.WHITE);
			}
			// Show the new background
			StdDraw.show();

			
			// Press space to exit this loop
			if(StdDraw.isKeyPressed(KeyEvent.VK_SPACE)) {
				done = true;
			}			
		}
	
	}
}
