import java.util.ArrayList;

public class Tresor {
    private ArrayList<Gegenstaend> gegenstaende ;
    double gesamtwert = 0;

    public Tresor(){
        gegenstaende = new ArrayList<>();
    }

    public Gegenstaend getGegenstand(int id) {
        // ArrayList nach dem Gegenstand mit dieser ID durchsuchen!
        // Wenn vorhanden Gegenstand zurückgeben
        // Wenn nicht vorhanden --> Exception
        return  gegenstaende.get(id);
    }

    public void addGegenstand(Gegenstaend gegenstand) {
        gegenstaende.add(gegenstand);
    }
    public void removeGegenstand( Gegenstaend  gegenstaend ){
        if (gegenstaende.contains(gegenstaend)) {
            // Gegenstand aus ArrayList loeschen
        } else {
            // Exception werfen
        }

    }

    //

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
