public class Programm {
    public static void main(String[] args) {
     Trainer trainer = new Trainer("Boss");
     trainer.setAlter(50);
     trainer.setErfahrung(12);

   Spieler spieler = new Spieler("Peter");
   spieler.setAlter(34);
   spieler.setBisherigetore(10);
   spieler.setMotivation(256);
        spieler.setStearke(345);
        spieler.setTorschuss(5);

        System.out.println();

    }
}
