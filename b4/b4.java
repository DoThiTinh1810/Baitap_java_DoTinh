package b4;

public class b4 {
	    public static void main(String[] args) {
	        MovablePoint point = new MovablePoint(0, 0, 3, 3);
	        System.out.println("Initial Point: " + point);
	        point.moveRight();
	        point.moveUp();
	        System.out.println("After moving right and up: " + point);

	        MovableCircle circle = new MovableCircle(5, 5, 2, 2, 10);
	        System.out.println("Initial Circle: " + circle);
	        circle.moveLeft();
	        circle.moveDown();
	        System.out.println("After moving left and down: " + circle);
	}
}
