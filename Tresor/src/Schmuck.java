public class Schmuck extends Gegenstaend{
    private String bezeichnug;

    public Schmuck(int ID,double wert, String bezeichnug){
        super(ID,wert);
        this.bezeichnug=bezeichnug;
    }
    public String getBezeichnug(){
        return bezeichnug;
    }
    public void setBezeichnug(String bezeichnug){
        this.bezeichnug=bezeichnug;
    }
    @Override
    public String toString(){
        return super.toString() + "\nBezeichnug:\t :"+ bezeichnug;
    }
}
