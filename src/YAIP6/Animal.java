package YAIP6;

public class Animal {
	protected static String name;
	
	public Animal (String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Animal [name=" + name + "]";
	}
	
	
}
