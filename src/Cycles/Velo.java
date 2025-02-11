package Cycles;
import java.util.Random;

public class Velo {
	private static double DEFAULT_BRAQUET = 13.0;
	private double braquet;
	private double diamRoue;
	private Random genAlea;
	
	public Velo (double braquet, double diamRoue){
		this.braquet = braquet;
		this.diamRoue = diamRoue;
		this.genAlea = new Random();
	}
	
	public Velo (double braquet) {
		this.braquet = 0;
	}
	
	public Velo() {
		this(DEFAULT_BRAQUET,0);
	}

	public double getBraquet() {
		return braquet;
	}

	public void setBraquet(double braquet) {
		this.braquet = braquet;
	}

	public double getDiamRoue() {
		return diamRoue;
	}

	public void setDiamRoue(double diamRoue) {
		this.diamRoue = diamRoue;
	}

	public Random getGenAlea() {
		return genAlea;
	}

	public void setGenAlea(Random genAlea) {
		this.genAlea = genAlea;
	}

	public static double getDefaultBraquet() {
		return DEFAULT_BRAQUET;
	}
	
	public static void setDEFAULT_BRAQUET(double dEFAULT_BRAQUET) {
		DEFAULT_BRAQUET = dEFAULT_BRAQUET;
	}

	public double getPuissance(double frequenceCoupsDePedale) {
		return frequenceCoupsDePedale * braquet * diamRoue * genAlea.nextDouble();
	}

	@Override
	public String toString() {
		return "Velo [braquet=" + braquet + ", diamRoue=" + diamRoue + ", genAlea=" + genAlea + "]";
	}
	
	
	    public static void main(String[] args) {
	        // Création d'un objet Velo avec deux paramètres
	        Velo velo1 = new Velo(15.0, 0.7);
	        System.out.println("Velo1 : " + velo1);
	        
	        // Test de getBraquet et getDiamRoue
	        System.out.println("Braquet du velo1 : " + velo1.getBraquet());
	        System.out.println("Diamètre de la roue du velo1 : " + velo1.getDiamRoue());
	        
	        // Création d'un objet Velo avec un seul paramètre
	        Velo velo2 = new Velo(20.0);
	        System.out.println("Velo2 : " + velo2);
	        
	        // Test du braquet par défaut
	        System.out.println("Braquet du velo2 (devrait être 0) : " + velo2.getBraquet());
	        
	        // Création d'un objet Velo sans paramètres (utilise les valeurs par défaut)
	        Velo velo3 = new Velo();
	        System.out.println("Velo3 : " + velo3);
	        
	        // Test du braquet par défaut
	        System.out.println("Braquet du velo3 (devrait être " + Velo.getDefaultBraquet() + ") : " + velo3.getBraquet());
	        
	        // Test de la méthode getPuissance
	        double frequenceCoupsDePedale = 90.0;
	        double puissance = velo1.getPuissance(frequenceCoupsDePedale);
	        System.out.println("Puissance du velo1 avec une fréquence de " + frequenceCoupsDePedale + " : " + puissance);
	        
	        // Test du setter pour braquet
	        velo1.setBraquet(18.0);
	        System.out.println("Velo1 après modification du braquet : " + velo1);
	        System.out.println("Nouveau braquet du velo1 : " + velo1.getBraquet());
	        
	        // Test du setter pour diamètre de roue
	        velo1.setDiamRoue(0.75);
	        System.out.println("Velo1 après modification du diamètre de roue : " + velo1);
	        System.out.println("Nouveau diamètre de roue du velo1 : " + velo1.getDiamRoue());
	    }
	}



