package b5;

public class b5 {
	
	    public static void main(String[] args) {
	        ResizableCircle resizableCircle = new ResizableCircle(10.0);
	        System.out.println("Original: " + resizableCircle);

	        resizableCircle.resize(50);  
	        System.out.println("After increasing radius by 50%: " + resizableCircle);

	        resizableCircle.resize(-20); 
	        System.out.println("After decreasing radius by 20%: " + resizableCircle);
	}
}
