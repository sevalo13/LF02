public class Kaufvertrag<Ware> {
    private Vertragspartner verkaeufer;
    private Vertragspartner kaeufer;
    private Ware ware;
    private String zahlungsModalitaeten;


    public Kaufvertrag(Vertragspartner kaeufer,Vertragspartner verkaeufer,Ware ware){
        this.kaeufer=kaeufer;
        this.verkaeufer=verkaeufer;
        this.ware=ware;
    }

    public Vertragspartner getKaeufer() {
        return kaeufer;
    }

    public void setKaeufer(Vertragspartner kaeufer) {
        this.kaeufer = kaeufer;

    }

    public Vertragspartner getVerkaeufer() {
        return verkaeufer;
    }

    public String getZahlungsModalitaeten() {
        return zahlungsModalitaeten;
    }

    public void setZahlungsModalitaeten(String zahlungsModalitaeten) {
        this.zahlungsModalitaeten = zahlungsModalitaeten;
    }

    public Ware getWare() {
        return ware;
    }

    public void setWare(Ware ware) {
        this.ware = ware;
    }

    @Override
    public String toString() {
        return "Kaufvertrag{" +
                "\n\tverkaeufer\t=" + verkaeufer +
                ", \n\tkaeufer\t=" + kaeufer +
                ", \n\tware\t=" + ware +
                ", \n\tzahlungsModalitaeten\t='" + zahlungsModalitaeten + '\'' +
                '}';
    }
}
