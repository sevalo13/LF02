import java.util.ArrayList;

public class Tresor {
    private ArrayList<Gegenstaend> gegenstaende ;
double gesamtwert = 0;

    public Tresor(){
        gegenstaende = new ArrayList<>();
    }

    public ArrayList getGegenstand() {
        return gegenstaende;
    }

    public void addGegenstand(Gegenstaend gegenstand) {
        gegenstand= gegenstand;
    }
    public void removeGegenstand( ArrayList gegenstaend ){
        this.gegenstaende=gegenstaend;
    }
    public double berechneGesamtwert(){
        for ( Gegenstaend v: gegenstaende){
            v.getWert();
            gesamtwert += v.getWert();
        }
        return gesamtwert;
    }
    @Override
    public String toString(){
        String text=  "\nGegenstand:\t :"+ gegenstaende;
        return text;
    }
}
