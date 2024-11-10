package b3;

public class b3 {

	public static void main(String[] args) {
		        MovablePoint point = new MovablePoint(0, 0, 5, 10);
		        System.out.println(point); // Initial state

		        point.moveUp();
		        System.out.println("After moveUp: " + point);

		        point.moveRight();
		        System.out.println("After moveRight: " + point);

		        point.moveDown();
		        System.out.println("After moveDown: " + point);

		        point.moveLeft();
		        System.out.println("After moveLeft: " + point);

	}

}
