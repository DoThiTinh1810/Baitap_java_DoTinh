package b8;

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
	@Override
	public String toString() {
		return"("+x+", "+y+") speed=("+xSpeed+", "+ySpeed+")";
	}
	@Override
    public void move(int xSpeed, int ySpeed) {
        this.x += xSpeed;
        this.y += ySpeed;
	}

}
