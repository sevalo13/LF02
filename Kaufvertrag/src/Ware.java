import java.util.ArrayList;
import java.util.List;

public class Ware {
     private String bezeichnung;
     private String beschreibung;
     private double preis;
     private List<String> besonderheiten;
     private List<String> maengel;


     public Ware(String bezeichnung,double preis){
         this.bezeichnung=bezeichnung;
         this.preis=preis;
         this.besonderheiten= new ArrayList<>();
         this.maengel= new ArrayList<>();
     }

    public String getBezeichnung() {
        return bezeichnung;
    }

    public void setBezeichnung(String bezeichnung) {
        this.bezeichnung = bezeichnung;
    }

    public String getBeschreibung() {
        return beschreibung;
    }

    public void setBeschreibung(String beschreibung) {
        this.beschreibung = beschreibung;
    }

    public double getPreis() {
        return preis;
    }

    public void setPreis(double preis) {
        this.preis = preis;
    }

    public List<String> getBesonderheiten() {
        return besonderheiten;
    }


    public List<String> getMaengel() {
        return maengel;
    }

    @Override
    public String toString() {
        return "Ware{" +
                "\n\tbezeichnung\t='" + bezeichnung + '\'' +
                ", \n\tbeschreibung\t='" + beschreibung + '\'' +
                ", \n\tpreis\t=" + preis +
                ", \n\tbesonderheiten\t=" + besonderheiten +
                ", \n\tmaengel\t=" + maengel +
                '}';
    }
}
