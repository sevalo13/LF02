public class Elfe extends Spielfigur {
    public Elfe ( String name , int staerkepunkte){
        super(name,staerkepunkte);
    }
    public void rennen() throws keineKraftException {
        if (getStaerkepunkte()-2 >= 0) {
            setStaerkepunkte(getStaerkepunkte() - 2);
            System.out.println(getName() + "rennt.");
        } else {
            throw new keineKraftException(getName(),"Rennen");
        }
    }
    @Override
    public String toString() {
        return super.toString();

    }
}
