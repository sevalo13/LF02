import java.util.ArrayList;

public class Mannschaft {


    private String name;
    private Trainer trainer;
    private Torwart torwart;
    private ArrayList spielerliste;
    private int Motivation;
    private int Stearke;

    public Mannschaft(String name , Trainer trainer, Torwart torwart, ArrayList spielerliste){
        this.name = name;
        this.torwart = torwart;
        this.trainer = trainer;
        this.spielerliste = spielerliste;


    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public int getMotivation() {
        return Motivation;
    }

    public void setMotivation(int Motivation) {
        this.Motivation = Motivation;
    }
    public int getStearke() {
        return Stearke;
    }

    public void setStearke(int Stearke) {
        this.Stearke = Stearke;
    }
    public Trainer getTrainer() {
        return trainer;
    }

    public void setTrainer(Trainer trainer) {
        this.trainer = trainer;
    }
    public Torwart getTorwart() {
        return torwart;
    }

    public void setTorwart(Torwart torwart) {
        this.torwart = torwart;
    }
    public ArrayList getspielerliste() {
        return spielerliste;
    }

    public void setSpielerliste() {
        this.spielerliste = spielerliste;
    }
    @Override
    public String toString() {

        String text = "\n\tName\t\t= " + name;
        text += "\n\ttrainer\t\t=  " + trainer;
            text += "\n\ttorwart\t\t= " + torwart;
            text += "\n\tspielerliste\t\t=  " + spielerliste;
            return text;


    }
}
