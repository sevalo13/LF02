public abstract class Spielfigur {

    private String name;
    private int staerkepunkte;


    public Spielfigur(String name, int staerkepunkte){
        this.name = name;
        this.staerkepunkte = staerkepunkte;
    }

    public String getName() {
        return name;
    }
    public int getStaerkepunkte(){
        return staerkepunkte;
    }
    public void setStaerkepunkte(int staerkepunkte){
        this.staerkepunkte=staerkepunkte;
    }
    public void essen() throws keineKraftException {
        if (getStaerkepunkte()+10 >=0) {
            setStaerkepunkte(getStaerkepunkte() + 10);
            System.out.println(getName() + "Isst");
        } else throw new keineKraftException("zaubern", getName());
        }

    public void laufen() throws keineKraftException {
        if (getStaerkepunkte()-1 >=0) {
            setStaerkepunkte(getStaerkepunkte() - 1);
            System.out.println(getName() + "Lauft");
        } else throw new keineKraftException("zaubern", getName());

    }
    public void klettern() throws keineKraftException {
        if (getStaerkepunkte()-2 >=0) {
            setStaerkepunkte(getStaerkepunkte() - 2);
            System.out.println(getName() + "Klettert");
        } else throw new keineKraftException("zaubern", getName());
    }
    public void kaempfen() throws keineKraftException {
        if (getStaerkepunkte()-3>=0) {
            setStaerkepunkte(getStaerkepunkte() - 3);
            System.out.println(getName() + "Kämpft");
        } else throw new keineKraftException("zaubern", getName());
    }
    @Override
    public String toString() {

        String text = "\nName\t\t\t" + name;
        text += "\nstaerkepunkte:\t" + staerkepunkte;
        return text;
    }
}
