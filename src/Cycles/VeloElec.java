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
}
