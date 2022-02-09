public class Zauberer extends Spielfigur {
    private int zauberpunkte;


    public Zauberer (String name , int staerkepunkte , int zauberpunkte){
        super(name,staerkepunkte);
        this.zauberpunkte = zauberpunkte;
    }
     public int getZauberpunkte(){
        return zauberpunkte;
     }
     public void setZauberpunkte(int zauberpunkte){
        this.zauberpunkte=zauberpunkte;
     }

     public void trinkenzaubertrank() throws keineKraftException {
         int punkte = getZauberpunkte();
         if (punkte >= 2){
             setZauberpunkte(getStaerkepunkte() + 3);
         System.out.println(getName() + "trinkt");
     } else throw new keineKraftException("zaubern", getName());
     }
      public void zauber() throws keineKraftException {
        // Prüfen, ob gezaubert werden kann
          int punkte = getZauberpunkte();
          if (punkte >= 1) {
              setStaerkepunkte(getStaerkepunkte() - 1);
              System.out.println(getName() + " zaubert!");
          } else throw new keineKraftException("zaubern", getName());
      }

      @Override
    public String toString(){
        return super.toString() + "\nZauberpunkte:\t"+ zauberpunkte;
      }

}
