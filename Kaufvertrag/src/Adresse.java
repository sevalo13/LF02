public class Adresse {
    private String strasse;
    private String hausNr;
    private String plz;
    private String ort;

    public Adresse(String strasse,String hausNr,String plz,String ort){
        this.hausNr=hausNr;
        this.ort=ort;
        this.plz=plz;
        this.strasse=strasse;
    }

    public String getStrasse() {
        return strasse;
    }

    public void setStrasse(String strasse) {
        this.strasse = strasse;
    }

    public String getHausNr() {
        return hausNr;
    }

    public void setHausNr(String hausNr) {
        this.hausNr = hausNr;
    }

    public String getPlz() {
        return plz;
    }

    public void setPlz(String plz) {
        this.plz = plz;
    }

    public String getOrt() {
        return ort;
    }

    public void setOrt(String ort) {
        this.ort = ort;
    }

    @Override
    public String toString() {
        return "Adresse{" +
                "\n\tstrasse\t=" + strasse + '\'' +
                " \n\thausNr\t=" + hausNr + '\'' +
                " \n\tplz\t=" + plz + '\'' +
                " \n\tort\t=" + ort + '\n' +
                '}';
    }
}
