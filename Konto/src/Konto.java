public  abstract class Konto {
    private Kunde inhaber;
    private double kontoStand;
    private double kreditLimit;
    private double zinsGuthaben;


    public Konto(Kunde inhaber,double kreditLimit, double zinsGuthaben){
        this.inhaber=inhaber;
        this.kontoStand=0;
        this.kreditLimit=kreditLimit;
        this.zinsGuthaben=zinsGuthaben;
    }


    public Kunde getInhaber(){
        return inhaber;
    }
    public double getKontoStand(){
        return kontoStand;
    }
    public double getKreditLimit(){
        return kreditLimit;
    }
    public double getZinsGuthaben(){
        return zinsGuthaben;
    }
    public void einzahlen(double betrag){
 kontoStand += betrag;
    }
    public boolean auszahlen(double betrag){
        if (kontoStand + kreditLimit >= betrag){
            kontoStand -= betrag;
            return true;
        } else return false;

    }

    @Override
    public String toString(){
        String text = "Inhaber"+ inhaber;
        text += "KontoStand" + kontoStand;
        text += "Kreditlimit"+ kreditLimit;
        text += "ZinsGuthaben" + zinsGuthaben;
        return text;
    }


}
