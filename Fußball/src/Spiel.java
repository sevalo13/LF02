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
    public Mannschaft getHeim() {
        return heim;
    }
    public Ergebnis getErgebnis() {
        return ergebnis;
    }

    public StringBuilder getSpielbericht() {
        return spielbericht;
    }
    public Mannschaft getGast() {
        return gast;
    }

    @Override
    public String toString() {

        String text = "\n\tHeim\t= " + heim;
        text += "\n\tGast\t=  " + gast;
        text += "\n\tSpielbericht\t=  " + spielbericht;
        System.out.println();
        return text;
    }
}