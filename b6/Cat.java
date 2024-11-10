package b6;

public class Cat extends Animals {
	public Cat(String name) {
		super(name);
	}
	@Override
	public void greets() {
		System.out.println("Meow");
	}

}
