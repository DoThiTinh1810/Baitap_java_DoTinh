package b5;

public class ResizableCircle extends Circle implements Resizable{
		public ResizableCircle (double radius) {
		super(radius);
	}
		@Override
		public double resize(int percent) {
			 return radius+= radius* percent/100;
		}
		 @Override
		    public String toString() {
		        return "ResizableCircle[Circle[radius=" + radius +"], Area: "+getArea()+", Perimeter: "+getPerimeter()+"]";
		    }
}
