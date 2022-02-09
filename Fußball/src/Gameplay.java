import java.util.Random;

public class Gameplay {

    private static final int SPIELZEIT = 90;
    private static final int MAX_NACHSPIELZEIT = 5;
    private static final int MAX_DAUER_BIS_AKTION = 10;



    public static  boolean brecheSpielAb(){
        Random random = new Random();
        int spielbruch=random.nextInt(1000);
        if (spielbruch==0){
            return true;
        } else {
            return false;
        }

    }

    public static void spielen(Spiel spiel) throws SpielAbbruchException{

        if ( brecheSpielAb()) {
        throw new SpielAbbruchException(40,"spielabbruch");
    }

        Random random = new Random();
        Mannschaft offensiv;
        Mannschaft defensiv;
        int spielDauer = SPIELZEIT + random.nextInt(MAX_NACHSPIELZEIT + 1);
        int spielMinute = 1 + random.nextInt(MAX_DAUER_BIS_AKTION + 1);
        do {
            int heimWert = ermittelMannschaftsWert(spiel.getHeim());
            int gastWert = ermittelMannschaftsWert(spiel.getGast());
            int summe = heimWert + gastWert;
            int zufall = random.nextInt(summe + 1);
            if (zufall <= heimWert) {
                offensiv = spiel.getHeim();
                defensiv = spiel.getGast();
            }
            else {
                offensiv = spiel.getGast();
                defensiv = spiel.getHeim();
            }
            int schuetzeNr = random.nextInt(offensiv.getspielerliste().size());
            Spieler schuetze = (Spieler) offensiv.getspielerliste().get(schuetzeNr);
            boolean getroffen = erzieltTor(schuetze, defensiv.getTorwart());
            if (getroffen) {
                schuetze.addtore();

                if (offensiv == spiel.getHeim()) {
                    spiel.getErgebnis().setAddToreHeim();
                }
                else {
                    spiel.getErgebnis().setAddToreGast();
                }
                spiel.getSpielbericht().append(spielMinute).append(": Tor von ").append(schuetze.getName()).append("!\n");
            }
            else {
                spiel.getSpielbericht().append(spielMinute).append(": Schuss von ").append(schuetze.getName()).append(" gehalten.\n");
            }
            spielMinute = spielMinute + random.nextInt(MAX_DAUER_BIS_AKTION + 1);
        } while(spielMinute <= spielDauer);
        spiel.getSpielbericht().append(spiel.getErgebnis());
    }


    private static int ermittelMannschaftsWert(Mannschaft mannschaft) {
        int wert = mannschaft.getStearke() * mannschaft.getMotivation() * mannschaft.getTrainer().getErfahrung();
        wert = Math.max(1, wert);
        return wert;
    }


    private static boolean erzieltTor(Spieler schuetze, Torwart torwart) {
        boolean getroffen;
        Random random = new Random();
        int schuss = schuetze.getTorschuss() + random.nextInt(5) - 2;
        schuss = Math.max(1, schuss);
        int abwehr = torwart.getReaktion() + random.nextInt(5) - 2;
        abwehr = Math.max(1, abwehr);
        if (schuss > abwehr) {
            getroffen = true;
        }
        else {
            getroffen = false;
        }
        return getroffen;
    }

}









