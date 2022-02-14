public class Adresse extends Person {

    private String strasse;
    private String hausNr;
    private String plz;
    private String ort;


    public Adresse(String vorname, String nachname ,String strasse,String hausNr,String plz,String ort) {
        super(vorname, nachname);
        this.hausNr=hausNr;
        this.ort=ort;
        this.plz=plz;
        this.strasse=strasse;

    }
    public String getHausNr(){
        return hausNr;
    }
    public void setHausNr(String hausNr){
        this.hausNr=hausNr;
    }
    public String getort(){
        return ort;
    }
    public void setort(String ort){
        this.ort=ort;
    }
    public String getplz(){
        return plz;
    }
    public void setplz(String plz){
        this.plz=plz;
    }
    public String getstrasse(){
        return strasse;
    }
    public void setstrasse(String strasse){
        this.strasse=strasse;
    }
    @Override
    public String toString(){
        String text = "HausNr" + hausNr;
        text += "Ort" + ort;
        text += "Plz" + plz;
        text += "Straße" +strasse;
        return text;
    }
}
