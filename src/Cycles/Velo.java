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
	
	
}
