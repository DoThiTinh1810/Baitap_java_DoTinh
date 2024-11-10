package bt1;

public class b1 {
    public static void main(String[] args) {
        Shape s1 = new Circle(5.5, "red", false);  // Upcast Circle to Shape
        System.out.println(s1);                   // Circle's toString()
        System.out.println(s1.getArea());         // Circle's getArea()
        System.out.println(s1.getPerimeter());    // Circle's getPerimeter()
        System.out.println(s1.getColor());
        System.out.println(s1.isFilled());

        // Downcast Shape back to Circle to access getRadius()
        Circle c1 = (Circle) s1;
        System.out.println(c1.getRadius());

        // Attempting to instantiate Shape directly would cause an error
        // Shape s2 = new Shape(); // This line is removed

        // Upcast Rectangle to Shape
        Shape s3 = new Rectangle(1.0, 2.0, "red", false);
        System.out.println(s3);
        System.out.println(s3.getArea());
        System.out.println(s3.getPerimeter());
        System.out.println(s3.getColor());

        // Downcast Shape back to Rectangle to access getLength()
        Rectangle r1 = (Rectangle) s3;
        System.out.println(r1.getLength());

        // Upcast Square to Shape
        Shape s4 = new Square(6.6);
        System.out.println(s4);
        System.out.println(s4.getArea());
        System.out.println(s4.getColor());

        // Downcast Shape to Rectangle and then to Square
        Rectangle r2 = (Rectangle) s4;
        System.out.println(r2.getArea());

        Square sq1 = (Square) r2;
        System.out.println(sq1.getSide());
    }
}