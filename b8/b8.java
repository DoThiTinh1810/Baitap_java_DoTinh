package b8;

public class b8 {
	public static void main(String[] args) {
	 MovableRectangle rectangle = new MovableRectangle(0, 0, 10, 10, 2);

     rectangle.printPosition();

     rectangle.move(5, 5);

     rectangle.printPosition();
	}
}
