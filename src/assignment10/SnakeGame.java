package assignment10;

import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.Iterator;

import edu.princeton.cs.introcs.StdDraw;

public class SnakeGame {
	//TODO: Implement the game of snake
	//		You may add other files/classes, but the game should start by running this file
	public static void main(String[] args) {
		
		ArrayList<Piece> list= new ArrayList<Piece>();

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
		StdDraw.setScale(0,520);
		Snake main = new Snake(240,240);
		Apple first = new Apple(false,200,240);
		first.draw();
		main.draw1();
		StdDraw.show();
		char c = 'z';
		
			StdDraw.setPenColor(StdDraw.BLACK);
			
		while(!done) {
		
			// Other "KeyEvents" you may want:  
			//    KeyEvent.VK_LEFT, KeyEvent.VK_RIGHT, KeyEvent.VK_UP, KeyEvent.VK_DOWN
			//    And you can type KeyEvent. to see other options
		if(StdDraw.hasNextKeyTyped()) {	
			 c = StdDraw.nextKeyTyped();
		}
			//StdDraw.clear();
			while(c == 'a' && !done) {
				
			
				
				if (!first.getConsumedStatus()&&first.isTouching()) {
					
					Piece x = new Piece(Snake.listOfPieces.get(Snake.listOfPieces.size()-1).getX(),Snake.listOfPieces.get(Snake.listOfPieces.size()-1).getY());
					Snake.listOfPieces.add(x);
					
					main.addSegment();
					
					first.newApple();
					

				}
				


				main.moveWholeSnake();

				main.moveHead(-40, 0);
				
				
				
				
				
				
				
				
				
				
	
				
				
				//Snake.listOfPieces.get(Snake.listOfPieces.size()-1).setX(20);
				
				
				first.draw();
				
				
				done = main.boundsChecker();
				StdDraw.pause(200);
				
				StdDraw.show();
				StdDraw.clear();
			
				if(StdDraw.hasNextKeyTyped()) {
					c = StdDraw.nextKeyTyped();
					}
				
			
			
			}
			
			while(c=='d' && !done){
				System.out.println("right arrow pressed");
				if (!first.getConsumedStatus()&&first.isTouching()) {
					
					Piece x = new Piece(Snake.listOfPieces.get(Snake.listOfPieces.size()-1).getX(),Snake.listOfPieces.get(Snake.listOfPieces.size()-1).getY());
					Snake.listOfPieces.add(x);
					
					main.addSegment();
					
					first.newApple();
					

				}
				
				
				
				
				
				
				main.moveWholeSnake();
				main.moveHead(40, 0);
				first.draw();
				done = main.boundsChecker();
				StdDraw.pause(200);
				
				StdDraw.show();
				StdDraw.clear();
				if(StdDraw.hasNextKeyTyped()) {
					c = StdDraw.nextKeyTyped();
					}
				
				
			

			}
			while(c=='w' && !done) {
				
				System.out.println("up");
				if (!first.getConsumedStatus()&&first.isTouching()) {
					
					Piece x = new Piece(Snake.listOfPieces.get(Snake.listOfPieces.size()-1).getX(),Snake.listOfPieces.get(Snake.listOfPieces.size()-1).getY());
					Snake.listOfPieces.add(x);
					
					main.addSegment();
					
					first.newApple();
					

				}
				
				
				
				
				
				
				main.moveWholeSnake();
			
				main.moveHead(0, 40);
				first.draw();
				done = main.boundsChecker();
				StdDraw.pause(200);
				
				StdDraw.show();
				StdDraw.clear();
				if(StdDraw.hasNextKeyTyped()) {
				c = StdDraw.nextKeyTyped();
				}
				
				
				
			}
			while(c == 's' && !done) {
				System.out.println("down");
				if (!first.getConsumedStatus()&&first.isTouching()) {
					
					Piece x = new Piece(Snake.listOfPieces.get(Snake.listOfPieces.size()-1).getX(),Snake.listOfPieces.get(Snake.listOfPieces.size()-1).getY());
					Snake.listOfPieces.add(x);
					
					main.addSegment();
					
					first.newApple();
					

				}
				
				
				
				
				
				
				main.moveWholeSnake();
			
				main.moveHead(0, -40);
				first.draw();
				done = main.boundsChecker();
				StdDraw.pause(200);
		
				StdDraw.show();
				StdDraw.clear();
				if(StdDraw.hasNextKeyTyped()) {
					c = StdDraw.nextKeyTyped();
					}
				
				
			}
			
			
		
			// Show the new background
	

			
			// Press space to exit this loop
			if(StdDraw.isKeyPressed(KeyEvent.VK_SPACE)) {
				done = true;
			}			
		}
		
		}
}
	
	
	
	
	

