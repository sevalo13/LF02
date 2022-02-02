public class Ergebnis {

    private int toreHeim;
    private int toreGast;

    public Ergebnis(int ergebnis, int toreGast , int toreHeim) {
        this.toreGast = toreGast;
        this.toreHeim = toreHeim;
    }
    public int getToreHeim() {
        return getToreHeim();
    }
    public void addToreHeim(int toreHeim) {
        this.toreHeim = toreHeim;
    }
    public String getToreGast() {
        return getToreGast();
    }
    public void addToreGast(int toreGast) {
        this.toreGast = toreGast;
    }
    @Override
    public String toString() {

        String text = "\n\tToreHeim\t\t= " + toreHeim;
        text += "\n\tToreGast\t\t=  " + toreGast;
        return text;
    }
}