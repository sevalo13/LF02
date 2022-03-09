public class Aktie extends Gegenstaend {
    private String unternehmen;
    private String nennwert;

    public Aktie(int ID,double wert,String unternehmen,String nennwert){
        super(ID,wert);
        this.nennwert=nennwert;
        this.unternehmen=unternehmen;
    }
    public String getUnternehmen(){
        return unternehmen;
    }
    public void setUnternehmen(String unternehmen){
        this.unternehmen=unternehmen;
    }
    public String getNennwert(){
        return nennwert;
    }
    public void setNennwert(String nennwert){
        this.nennwert=nennwert;
    }
    @Override
    public String toString(){
        String text = "\nUnternehmen:\t" + unternehmen;
        text += "\nNennwert:\t" + nennwert;
        return text;
    }
}
