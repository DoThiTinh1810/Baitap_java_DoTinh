package btthem;
public class b2 {
    public static void main(String[] args) {
        Circle c1 = new Circle(5.5);
        System.out.println(c1);                   
        System.out.println("Area: " + c1.getArea());            
        System.out.println("Perimeter: " + c1.getPerimeter()); 
        System.out.println("====================================");
        Rectangle c2= new Rectangle(3, 4);
        System.out.println(c2);
        System.out.println("Area: "+ c2.getArea());
        System.out.println("Perimeter: "+c2.getPerimeter());
    }
}