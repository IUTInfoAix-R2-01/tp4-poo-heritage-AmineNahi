package YAIP4;

public class Cat extends Mammal{
	
	public Cat (String name) {
		super(name);
	}
	
	public void greets() {
		System.out.println("Meow");
	}

	@Override
	public String toString() {
		return "Cat [" + super.toString() + "]";
	}
	public static void main(String[] args) {
        // Création d'un objet Cat avec un nom
        Cat cat1 = new Cat("Whiskers");
        
        // Test de la méthode greets()
        System.out.print("Cat1 greets: ");
        cat1.greets();  // Devrait afficher "Meow"
        
        // Test de la méthode toString()
        System.out.println("Cat1 : " + cat1);  // Devrait afficher "Cat [Animal [name=Whiskers]]"
        
        // Création d'un autre objet Cat
        Cat cat2 = new Cat("Tom");
        
        // Test de la méthode greets()
        System.out.print("Cat2 greets: ");
        cat2.greets();  // Devrait afficher "Meow"
        
        // Test de la méthode toString()
        System.out.println("Cat2 : " + cat2);  // Devrait afficher "Cat [Animal [name=Tom]]"
    }
}

