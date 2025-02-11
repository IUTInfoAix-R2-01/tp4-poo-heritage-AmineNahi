package Cycles;

public class VeloElec extends Velo {
    private static final double DEFAULT_FACTEUR_PUISSANCE_MOTEUR = 15.0;
    private double facteurPuissanceMoteur;

    public VeloElec(double braquet, double diamRoue, double coupleMoteur) {
        super(braquet, diamRoue);
        this.facteurPuissanceMoteur = coupleMoteur;
    }

    public VeloElec(double diamRoue, double coupleMoteur) {
        super(Velo.getDefaultBraquet(), diamRoue);
        this.facteurPuissanceMoteur = coupleMoteur;
    }

    public VeloElec() {
        super();
        this.facteurPuissanceMoteur = DEFAULT_FACTEUR_PUISSANCE_MOTEUR;
    }

    public double getFacteurPuissanceMoteur() {
        return facteurPuissanceMoteur;
    }

    public void setFacteurPuissanceMoteur(double facteurPuissanceMoteur) {
        this.facteurPuissanceMoteur = facteurPuissanceMoteur;
    }

    @Override
    public double getPuissance(double frequenceCoupsDePedale) {
        return super.getPuissance(frequenceCoupsDePedale) * facteurPuissanceMoteur;
    }

    @Override
    public String toString() {
        return "VeloElec [facteurPuissanceMoteur=" + facteurPuissanceMoteur + "]";
    }
    
    public static void main(String[] args) {
        // Création d'un VeloElec avec tous les paramètres
        VeloElec veloElec1 = new VeloElec(20.0, 0.7, 18.0);
        System.out.println("VeloElec1 : " + veloElec1);
        
        // Test des attributs de VeloElec
        System.out.println("Braquet du veloElec1 : " + veloElec1.getBraquet());
        System.out.println("Diamètre de la roue du veloElec1 : " + veloElec1.getDiamRoue());
        System.out.println("Facteur de puissance moteur du veloElec1 : " + veloElec1.getFacteurPuissanceMoteur());
        
        // Test de la méthode getPuissance() pour un VeloElec
        double frequenceCoupsDePedale = 90.0;
        double puissanceVeloElec = veloElec1.getPuissance(frequenceCoupsDePedale);
        System.out.println("Puissance du veloElec1 avec une fréquence de " + frequenceCoupsDePedale + " : " + puissanceVeloElec);
        
        // Création d'un VeloElec avec un seul paramètre
        VeloElec veloElec2 = new VeloElec(0.7, 18.0);
        System.out.println("\nVeloElec2 : " + veloElec2);
        
        // Vérification des valeurs par défaut pour le braquet
        System.out.println("Braquet du veloElec2 : " + veloElec2.getBraquet()); // Valeur par défaut de Velo
        System.out.println("Diamètre de la roue du veloElec2 : " + veloElec2.getDiamRoue());
        System.out.println("Facteur de puissance moteur du veloElec2 : " + veloElec2.getFacteurPuissanceMoteur());
        
        // Création d'un VeloElec avec le constructeur sans paramètres (valeurs par défaut)
        VeloElec veloElec3 = new VeloElec();
        System.out.println("\nVeloElec3 (avec valeurs par défaut) : " + veloElec3);
        
        // Test des valeurs par défaut
        System.out.println("Braquet du veloElec3 (devrait être par défaut de Velo) : " + veloElec3.getBraquet());
        System.out.println("Diamètre de la roue du veloElec3 (devrait être par défaut de Velo) : " + veloElec3.getDiamRoue());
        System.out.println("Facteur de puissance moteur du veloElec3 (devrait être " + VeloElec.DEFAULT_FACTEUR_PUISSANCE_MOTEUR + ") : " + veloElec3.getFacteurPuissanceMoteur());
        
        // Modification du facteur de puissance moteur
        veloElec3.setFacteurPuissanceMoteur(20.0);
        System.out.println("\nVeloElec3 après modification du facteur de puissance moteur : " + veloElec3);
        System.out.println("Nouveau facteur de puissance moteur : " + veloElec3.getFacteurPuissanceMoteur());
        
        // Test de la méthode getPuissance() pour VeloElec avec modification
        double puissanceModifiee = veloElec3.getPuissance(frequenceCoupsDePedale);
        System.out.println("Puissance du veloElec3 modifié avec une fréquence de " + frequenceCoupsDePedale + " : " + puissanceModifiee);
    }
}

