public class Vertragspartner {
    private String vorname;
    private String nachname;
    private String ausweisNr;
    private Adresse adresse;


    public Vertragspartner(String vorname,String nachname){
        this.nachname=nachname;
        this.vorname=vorname;
    }

    public Adresse getAdresse() {

        return adresse;
    }

    public void setAdresse(Adresse adresse) {
        this.adresse = adresse;
    }

    public String getAusweisNr() {
        return ausweisNr;
    }

    public void setAusweisNr(String ausweisNr) {
        this.ausweisNr = ausweisNr;
    }

    public String getNachname() {
        return nachname;
    }

    public void setNachname(String nachname) {
        this.nachname = nachname;
    }

    public void setVorname(String vorname) {
        this.vorname = vorname;
    }

    public String getVorname() {
        return vorname;
    }

    @Override
    public String   toString() {
        return "Vertragspartner{" +
                "\n\tvorname\t='" + vorname + '\'' +
                ", \n\tnachname\t='" + nachname + '\'' +
                ", \n\tausweisNr\t='" + ausweisNr + '\'' +
                ", \n\tadresse\t=" + adresse +
                '}';
    }
}
