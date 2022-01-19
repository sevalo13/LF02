public class Spieler {

    private int alter;
    private String Stearke;
    private int Torschuss;
    private int Motivation;
    private int bisherigetore;

    public String getStearke() {
        return Stearke;
    } // Konstruktor
    public Spieler(String name) {
        this.Stearke = name;
    } // Getter
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
    public void setBisherigetore(int bisherigetore) {
        this.bisherigetore = bisherigetore;
    }

    @Override
    public String toString() {

        String text = "\n\t Motivation  = " + Motivation;
        text += "\n\talter  =  "  + alter;
        text += "\n\ttorschuss =  "  + Torschuss;
        text += "\n\tbisherigetore =  "  + bisherigetore;
        text += "\n\tstearke =  "  + Stearke;
        return text;
    }
}
