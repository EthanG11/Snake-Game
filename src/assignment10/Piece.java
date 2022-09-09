package assignment10;

import edu.princeton.cs.introcs.StdDraw;

public class Piece {
	
	private int xPos;
	private int yPos;
	private int iD;
	
	
	public Piece(int x, int y) {
		xPos = x;
		yPos=y;
		
		
		
	}
	
	public void move(int xDirection,int yDirection){
		
		xPos += xDirection;
		yPos += yDirection;
		
		StdDraw.setPenColor(StdDraw.GREEN);
		StdDraw.filledCircle(xPos,yPos,20);
		
		
	}
	

	public void moveToward() {
		
		int current = Snake.getList().indexOf(this);
		
		int previous = current-1;
			
			this.setXReal(Snake.getList().get(previous).getX());
			this.setYReal(Snake.getList().get(previous).getY());
			
		
		
			
		
	
	
	}
	

	
	

	public boolean boundsChecker() {
		if(xPos > 480 || xPos<20|| yPos >480  || xPos <20) {
			return true;
		}
		
		return false;
	}
	
	
	public void draw1() {
		StdDraw.setPenColor(StdDraw.BLACK);

		StdDraw.filledCircle(xPos, yPos, 20);
	}
	
	public int getX() {
		return this.xPos;
	}
	
	public int getY() {
		return this.yPos;
	}
	
	public int setX(int x) {
		this.xPos+=x;
		return xPos;
	}
	
	public void setXReal(int x) {
		this.xPos = x;
		
	}
	public void setYReal(int y) {
		this.yPos = y;
		
	}
	
	public int setY(int y) {
		this.yPos+= y;
		return yPos;
	}
	
	public String toString() {
		return "Piece's ID: "+ iD;
		
	}
	
	public void setID(int z) {
		this.iD = z;
	}
	
	
	

}
