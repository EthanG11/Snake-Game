package assignment10;

import java.util.ArrayList;
import java.util.List;

import edu.princeton.cs.introcs.StdDraw;

public class Snake {
	
	
	//int numberOfPieces;
	public static ArrayList<Piece> listOfPieces = new ArrayList<Piece>();
	private int numberOfSegments;
	private int xPos;
	private int yPos;
	public static Piece head;
	
	public Snake(int x, int y) {
		//numberOfPieces = 0;
		numberOfSegments ++;
		head = new Piece(x,y);
		head.setID(999);
		listOfPieces.add(head);
	
		xPos = x;
		yPos=y;

	}
	
public void moveHead(int xDirection,int yDirection){
	StdDraw.setPenColor(StdDraw.BLACK);

	
		this.xPos+=xDirection;
		this.yPos+=yDirection;
	
		listOfPieces.get(0).setXReal(this.xPos);
		listOfPieces.get(0).setYReal(this.yPos);
		
		StdDraw.filledCircle(listOfPieces.get(0).getX(),listOfPieces.get(0).getY(),20);
}

public void addSegment() {
	this.numberOfSegments++;
}
public int getNumSegments() {
	return this.numberOfSegments;
}
		
		

	
//	
//	public static void addPiece() {
//		Piece x = new Piece(listOfPieces.get(listOfPieces.size()-1).getX(),listOfPieces.get(listOfPieces.size()-1).getY());  
//		listOfPieces.add(x);	
//	}
	
	public void moveWholeSnake() {
		ArrayList<Piece> clone = new ArrayList<Piece>();
		
		for(int i = 1; i < numberOfSegments;i++) {
			clone.add(Snake.listOfPieces.get(i));
			
		}
		
		if(this.numberOfSegments >1) {
		

		for(int i =listOfPieces.size()-1 ;i >= 1;i-- ) {
		
			listOfPieces.get(i).moveToward();
			
			StdDraw.setPenColor(StdDraw.BLUE);
			StdDraw.filledCircle(listOfPieces.get(i).getX(), listOfPieces.get(i).getY(), 20);
		
			}
	}
		
	}
	
	public static ArrayList<Piece> getList() {
		return listOfPieces;
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
	
	public static Piece getHead() {
		return head;
		
	}

	public boolean boundsChecker() {
		if(xPos > 480 || xPos<20|| yPos >480  || xPos <20) {
			return true;
		}
		for(int i=1; i < listOfPieces.size();i++) {
		if(listOfPieces.get(0).getX() == listOfPieces.get(i).getX() && listOfPieces.get(0).getY() == listOfPieces.get(i).getY()) {
			return true;
		}
			
		}
		
		
		return false;
	}
	
	
	
	
	
	
	
	
	
	

}
