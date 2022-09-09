package assignment10;

import edu.princeton.cs.introcs.StdDraw;

public class Apple {
	
	private boolean isConsumed;
	private int xPos;
	private int yPos;

	public Apple(boolean isConsumed, int x, int y) {
		this.xPos = x;
		this.yPos =y;
		this.isConsumed = isConsumed;
		
		
	}
	
	
	
	public void setPosition() {
		xPos = (int) Math.random() * 480;
		yPos = (int) Math.random()* 480;
		
	}
	
	public void draw() {
		
		StdDraw.setPenColor(StdDraw.RED);
		StdDraw.filledCircle(xPos, yPos, 20);
		
	}
	
	public int getX() {
		return this.xPos;
	}
	
	public int getY() {
		return this.yPos;
	}
	
	public boolean getConsumedStatus() {
		return this.isConsumed;
	}
	
	
	public boolean isTouching() {
	
			if(Snake.getHead().getX() == this.xPos && Snake.getHead().getY() == this.yPos) {
				this.isConsumed = true;
				return true;
			}
		
		return false;
	}
	
	public void newApple() {
		
	
		StdDraw.setPenColor(StdDraw.WHITE);
		
		StdDraw.filledCircle(this.xPos, this.yPos, 20);
		
		this.isConsumed= false;
		
		
		this.xPos = ((int) ((Math.random()*12)+1))* 40;
		this.yPos = ((int) ((Math.random()*12)+1))* 40;
		
		this.draw();
	
	}
	
	
	
	
	
}
