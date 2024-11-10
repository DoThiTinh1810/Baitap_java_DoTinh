package bt1;

public class Square extends Rectangle {
	protected double width;
	protected double length;
	public Square() {
		super.width=1.0;
		super.length=1.0;
	}
	public Square(double side) {
		super.width=side;
		super.length=side;
	}
	public Square(double side, String color, boolean filled) {
        super(side, side,color, filled);
	}
	public double getSide() {
		return length;
	}
	public void setSide() {
		this.length=length;
		this.width=width;
	}
	@Override
	public void setWidth(double width) {
		this.length = width;
		this.width = width;
	}
	@Override
	public void setLength(double length) {
		this.length = length;
		this.width = length;
	}
	 @Override
	    public String toString() {
	        return "Square[Rectangle[Shape[side: " + width + ", color: " + color + ", filled: " + filled + "]";
	    }
}
