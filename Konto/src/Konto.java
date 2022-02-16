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
    public boolean einzahlen(double betrag){
        kontoStand += betrag;
        return false;
    }
    public boolean auszahlen(double betrag){
        if (kontoStand + kreditLimit >= betrag){
            kontoStand -= betrag;
            return true;
        } else
            return false;

    }

    @Override
    public String toString(){
        String text = "\nInhaber\t :"+ inhaber;
        text += "\nKontoStand\t :" + kontoStand;
        text += "\nKreditlimit\t :"+ kreditLimit;
        text += "\nZinsGuthaben\t :" + zinsGuthaben;
        return text;
    }


}
