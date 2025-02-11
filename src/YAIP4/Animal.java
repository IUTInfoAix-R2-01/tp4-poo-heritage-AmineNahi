package YAIP4;

public class Animal {
	private String name;
	
	public Animal (String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Animal [name=" + name + "]";
	}
	
	public static void main(String[] args) {
        // Création d'un objet Animal avec un nom
        Animal animal1 = new Animal("Lion");
        System.out.println("animal1 : " + animal1);  // Appel de la méthode toString()

        // Création d'un autre objet Animal
        Animal animal2 = new Animal("Elephant");
        System.out.println("animal2 : " + animal2);  // Appel de la méthode toString()
        
        // Test de toString avec un nom personnalisé
        String nameTest = "Tiger";
        Animal animal3 = new Animal(nameTest);
        System.out.println("animal3 avec nom " + nameTest + " : " + animal3);  // Appel de la méthode toString()
    }
}

