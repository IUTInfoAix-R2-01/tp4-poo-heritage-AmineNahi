package YAIP4;

public class Mammal extends Animal {
	
	
	public Mammal (String name) {	
		super(name);
	}

	@Override
	public String toString() {
		return "Mammal [" + super.toString() + "]";
	}
	public class Main {
	    public static void main(String[] args) {
	        // Création d'un objet Mammal avec un nom
	        Mammal mammal1 = new Mammal("Elephant");
	        
	        // Test de la méthode toString() pour Mammal
	        System.out.println("Mammal1 : " + mammal1);  // Devrait afficher "Mammal [Animal [name=Elephant]]"
	        
	        // Création d'un autre objet Mammal
	        Mammal mammal2 = new Mammal("Dolphin");
	        
	        // Test de la méthode toString() pour Mammal2
	        System.out.println("Mammal2 : " + mammal2);  // Devrait afficher "Mammal [Animal [name=Dolphin]]"
	    }
	}
}
