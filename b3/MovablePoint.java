package b3;

public class MovablePoint implements Movable {
	private int x, y;
	private int xSpeed, ySpeed;
	public MovablePoint(int x, int y, int xSpeed, int ySpeed) {
		this.x=x;
		this.y=y;
		this.xSpeed=xSpeed;
        this.ySpeed=ySpeed;
	}
	
	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public int getxSpeed() {
		return xSpeed;
	}

	public int getySpeed() {
		return ySpeed;
	}
	public String toString() {
		return"("+x+", "+y+") speed=("+xSpeed+", "+ySpeed+")";
	}
	public void moveUp() {
		y+=ySpeed;
	}
	public void moveDown() {
		y-=ySpeed;
	}
	public void moveLeft() {
		x-=xSpeed;
	}
	public void moveRight() {
		x+=xSpeed;
	}
	

}
