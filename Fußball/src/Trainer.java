public class Trainer extends Person {

    private int erfahrung;


     // Konstruktor
    public Trainer(String name, int erfahrung, int alter) {
        super(name,alter);
        this.erfahrung = erfahrung;

    } // Getter
    public int getErfahrung() {
        return erfahrung;
    } // Setter
    public void setErfahrung(int erfahrung) {
        this.erfahrung= erfahrung;
    }






    @Override
    public String toString() {

        String text = super.toString();
        text += "\n\terfahrung\t=  "  + erfahrung;



        return text;
    }
}






