public class Spieler extends Person  {


    private int Stearke;

    private int Torschuss;
    private int Motivation;
    private int tore;

    public int getStearke() {
        return Stearke;
    } // Konstruktor
    public Spieler(String name , int alter , int stearke , int torschuss , int motivation , int tore) {
        super(name,alter);
        this.Stearke = stearke;
        this.tore = tore;
        this.Torschuss = torschuss;
        this.Motivation =motivation;


    } // Getter

    public int getTorschuss() {
        return Torschuss;
    } // Setter
    public void setTorschuss(int Torschuss) {
        this.Torschuss= Torschuss;
    }

    public int getMotivation() {
        return Motivation;
    } // Setter
    public void setMotivation(int Motivation) {
        this.Motivation= Motivation;
    }
    public int gettore() {
        return tore;
    }
    public void setTore(int tore) {
        this.tore = tore;
    }
    public void setStearke(int Stearke) {
        this.Stearke = Stearke;
    }
    public void addtore(){
        tore++;
    }




    @Override
    public String toString() {

        String text = super.toString();
        text += "\n\tMotivation\t= " + Motivation;
        text += "\n\ttorschuss\t=  "  + Torschuss;
        text += "\n\ttore\t\t=  "  + tore;
        text += "\n\tstearke\t\t=  "  + Stearke;
        return text;
    }
}
