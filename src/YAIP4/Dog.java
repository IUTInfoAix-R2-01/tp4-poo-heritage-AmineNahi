package YAIP4;

public class Dog extends Mammal{
	
	public Dog (String name) {
		super(name);
	}
	
	public void greets() {
		System.out.println("Woof");
	}
	
	public void greets(Dog another) {
		System.out.println("Woooof");
	}

	@Override
	public String toString() {
		return "Dog [" + super.toString() + "]";
	}
	
	public class Main {
	    public static void main(String[] args) {
	        // Création d'un objet Dog avec un nom
	        Dog dog1 = new Dog("Buddy");
	        
	        // Test de la méthode greets() sans argument
	        System.out.print("Dog1 greets: ");
	        dog1.greets();  // Devrait afficher "Woof"
	        
	        // Test de la méthode toString()
	        System.out.println("Dog1 : " + dog1);  // Devrait afficher "Dog [Animal [name=Buddy]]"
	        
	        // Création d'un autre objet Dog
	        Dog dog2 = new Dog("Max");
	        
	        // Test de la méthode greets() sans argument
	        System.out.print("Dog2 greets: ");
	        dog2.greets();  // Devrait afficher "Woof"
	        
	        // Test de la méthode greets() avec un autre objet Dog
	        System.out.print("Dog1 greets Dog2: ");
	        dog1.greets(dog2);  // Devrait afficher "Woooof"
	        
	        // Test de la méthode toString() pour Dog2
	        System.out.println("Dog2 : " + dog2);  // Devrait afficher "Dog [Animal [name=Max]]"
	    }
	}
}
