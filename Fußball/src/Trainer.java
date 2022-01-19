public class Trainer {
    private String name;
    private int erfahrung;
    private int alter;


    public String getName() {
        return name;
    } // Konstruktor
    public Trainer(String name) {
        this.name = name;
    } // Getter
    public int getArfahrung() {
        return erfahrung;
    } // Setter
    public void setErfahrung(int erfahrung) {
        this.erfahrung= erfahrung;
    }
    public double getAlter() {
        return alter;
    }
    public void setAlter(int alter) {
        this.alter = alter;
    }


    @Override
    public String toString() {

        String text = "\n\t Name  = " + name;
        text += "\n\talter  =  "  + alter;
        text += "\n\terfahrung =  "  + erfahrung;


        return text;
    }
}






