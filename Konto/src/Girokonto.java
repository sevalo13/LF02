public class Girokonto extends Konto {
    private double zinsKresit;

    public Girokonto(Kunde inhaber,double Kreditlimit,double zinsGuthaben,double zinsKresit){
        super(inhaber,Kreditlimit,zinsGuthaben);
        this.zinsKresit=zinsKresit;

    }
    public double getZinsKresit(){
        return zinsKresit;
    }
    public void setZinsKresit(double zinsKresit){
        this.zinsKresit=zinsKresit;
    }
    public boolean ueberweisen(double betrag,Girokonto girokonto) {
        if (auszahlen(betrag)) {
            auszahlen(betrag);
            girokonto.einzahlen(betrag);
           return true;
        }
        else {
            return false;
        }

    }
    @Override
    public String toString(){
        return super.toString() + "\nzinsKresit:\t :"+ zinsKresit;
    }


}
