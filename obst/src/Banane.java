import java.util.Random;

public class Banane extends Obst{
    private double kruemmung;

    public Banane() {
        super("Banane");
    }
    public double getKruemmung() {
        return kruemmung;
    }
    public void setKruemmung(double kruemmung) {
        this.kruemmung = kruemmung;
    }
        @Override
                public String toString() {
            String text = super.toString();
            text += "\n\tkrümmung = " + kruemmung;
             return text;
        }

    }

