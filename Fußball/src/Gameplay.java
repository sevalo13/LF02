import java.util.Random;

public class Gameplay {

    private static final int maxSpielZeit = 90;
    private static final int maxNachSpielzeit = 5;
   private static final int maxDauerBisAktino = 10;

    private static int ermittelMannschaftsWert(Mannschaft mannschaft) {
        Trainer trainer = mannschaft.getTrainer();
        int mannschaftswert = mannschaft.getMotivation() * mannschaft.getStearke() * trainer.getErfahrung();
        return mannschaftswert;
    }

    private static boolean erzieltTor(Spieler schuetze, Torwart torwart) {
        boolean tor;
        Random s = new Random();
        int wert1 = s.nextInt(5)-2;
        int wert2 = s.nextInt(5)-2;
        int torschuss = schuetze.getTorschuss()+wert1;
        if (torschuss<=0){
            torschuss =1;
        }
        tor=torschuss> torwart.getReaktion();
        return tor;
    }
    public static void spielen(Spiel spiel){
        Random spielZeit = new Random();
        int maxNachSpielzeit = spielZeit.nextInt(5);
        int maxSpielZeit = 90;
        int gesamtSpielZeit = maxSpielZeit + maxNachSpielzeit;

    }


    }








