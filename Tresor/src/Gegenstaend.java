public abstract class  Gegenstaend {
    private int ID;
    private double wert;

    public Gegenstaend(int ID, double wert){
        this.ID=ID;
        this.wert=wert;
    }

    public int getID() {
        return ID;
    }
    public void  setID(int ID){
        this.ID= ID;
    }
    public double getWert(){
        return wert;
    }
    public void setWert(double wert){
        this.wert=wert;
    }
    @Override
    public String toString(){
        String text = "\nID\t" + ID;
        text += "\nWert\t" + wert;
        return text;
    }
}
