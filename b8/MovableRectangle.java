package b8;

public class MovableRectangle implements Movable {
	
	    MovablePoint topLeft;
	    MovablePoint bottomRight;

	    public MovableRectangle(int x1, int y1, int x2, int y2, int speed) {
	        this.topLeft = new MovablePoint(x1, y1, speed, speed);
	        this.bottomRight = new MovablePoint(x2, y2, speed, speed);
	    }

	    @Override
	    public void move(int xSpeed, int ySpeed) {
	        topLeft.move(xSpeed, ySpeed);
	        bottomRight.move(xSpeed, ySpeed);
	    }

	    public int getTopLeftX() {
	        return topLeft.getX();
	    }

	    public int getTopLeftY() {
	        return topLeft.getY();
	    }

	    public int getBottomRightX() {
	        return bottomRight.getX();
	    }

	    public int getBottomRightY() {
	        return bottomRight.getY();
	    }

	    public void printPosition() {
	        System.out.println("Top-left corner: (" + getTopLeftX() + ", " + getTopLeftY() + ")");
	        System.out.println("Bottom-right corner: (" + getBottomRightX() + ", " + getBottomRightY() + ")");
	    
	}
}
