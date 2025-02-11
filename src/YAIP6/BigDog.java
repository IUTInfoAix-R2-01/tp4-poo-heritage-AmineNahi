package YAIP6;

public class BigDog extends Dog{
	
	public BigDog() {
		super(name);
	}
	
	public void greets() {
		System.out.println("Wooow");
	}
	
	public void greets(Dog another) {
		System.out.println("Woooooow");
	}
	
	public void greets(BigDog another) {
		System.out.println("Woooooooooooooooooow");
	}
}

