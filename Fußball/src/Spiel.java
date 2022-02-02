public class Spiel {

    private Mannschaft heim;
    private Mannschaft gast;
    private StringBuilder spielbericht;
    private Ergebnis ergebnis;


    public Spiel( Mannschaft gast, Mannschaft heim) {
        this.heim = heim;
   this.spielbericht = spielbericht;
        this.gast = gast;
    }
    public String getHeim() {
        return getHeim();
    }
    public String getErgebnis() {
        return getErgebnis();
    }
    public StringBuilder getSpielbericht() {
        return getSpielbericht();
    }
    public String getGast() {
        return getGast();
    }

    @Override
    public String toString() {

        String text = "\n\tHeim\t= " + heim;
        System.out.println();
        text += "\n\tGast\t=  " + gast;
        System.out.println();
        text += "\n\tSpielbericht\t=  " + spielbericht;
        System.out.println();
        return text;
    }
}