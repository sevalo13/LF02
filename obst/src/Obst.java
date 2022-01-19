public class Obst {
     private String name;
    private String farbe;
    private double gewicht;
    private boolean reif;

    public String getName() {
        return name;
    } // Konstruktor
    public Obst(String name) {
        this.name = name;
    } // Getter
    public String getFarbe() {
        return farbe;
    } // Setter
    public void setFarbe(String farbe) {
        this.farbe = farbe;
    }
    public double getGewicht() {
        return gewicht;
    }
    public void setGewicht(double gewicht) {
        this.gewicht = gewicht;
    }
    public boolean getreif() {
        return reif;
    }
    public void setReif(boolean reif) {
        this.reif = reif;
    }

    @Override
    public String toString() {

        String text = "\n\t Name  = " + name;
        text += "\n\tFarbe  =  "  + farbe;
        text += "\n\tGewicht =  "  + gewicht;
        text += "\n\treif  =   "  + reif;

        return text;
    }

}
