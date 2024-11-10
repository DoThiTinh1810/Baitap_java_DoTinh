package b6;

public class Dog extends Animals {
	public Dog(String name) {
		super(name);
	}
	@Override
	public void greets() {
		System.out.println("Woof");
	}
	public void greets(Dog another) {
		System.out.println("Woooof");
	}

}
