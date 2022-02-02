public class Spieler {

    private int alter;
    private int Stearke;
    private String name;
    private int Torschuss;
    private int Motivation;
    private int tore;

    public int getStearke() {
        return Stearke;
    } // Konstruktor
    public Spieler(String name , int alter , int stearke , int torschuss , int motivation , int tore) {
        this.name = name;
        this.Stearke = stearke;
        this.alter = alter;
        this.tore = tore;
        this.Torschuss = torschuss;
        this.Motivation =motivation;

    } // Getter
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getTorschuss() {
        return Torschuss;
    } // Setter
    public void setTorschuss(int Torschuss) {
        this.Torschuss= Torschuss;
    }
    public int getAlter() {
        return alter;
    }
    public void setAlter(int alter) {
        this.alter = alter;
    }
    public int getMotivation() {
        return Motivation;
    } // Setter
    public void setMotivation(int Motivation) {
        this.Motivation= Motivation;
    }
    public int getBisherigetore() {
        return alter;
    }
    public void tore(int tore) {
        this.tore = tore;
    }
    public void setStearke(int Stearke) {
        this.Stearke = Stearke;
    }


    @Override
    public String toString() {

        String text = "\n\tName\t\t= " + name;
        text += "\n\tMotivation\t= " + Motivation;
        text += "\n\talter\t\t=  "  + alter;
        text += "\n\ttorschuss\t=  "  + Torschuss;
        text += "\n\ttore\t\t=  "  + tore;
        text += "\n\tstearke\t\t=  "  + Stearke;
        return text;
    }
}
