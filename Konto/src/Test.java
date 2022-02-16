public class Test {
    public static void main(String[] args) {
        Adresse adresseMitarbeiter = new Adresse("vorstraße","578923","32523","bremen");
        Adresse adresseKunde = new Adresse("herrstraße","7530","3252","Bremen");

        Mitarbeiter mitarbeiter = new Mitarbeiter("chan","baek");

        Kunde kunde1 = new Kunde("baek","chan",mitarbeiter);
        Kunde kunde2 = new Kunde("Volker", "Vielgeld", mitarbeiter);
        kunde1.setBetreuer(mitarbeiter);

        Girokonto girokonto1 = new Girokonto(kunde1, 1.0, 0.0, 15.0);
        Girokonto girokonto2 = new Girokonto(kunde2, 1.0, 5000.0, 10.0);
        Sparkonto sparkonto1 = new Sparkonto(kunde1, 3.0);

        System.out.println(mitarbeiter);
        System.out.println(kunde1);
        System.out.println(kunde2);
        System.out.println(girokonto1);
        System.out.println(girokonto2);
        System.out.println(sparkonto1);
        System.out.println("--------------------");

        if (girokonto1.einzahlen(25000)) {
            System.out.println(girokonto1);
        } else {
            System.out.println("Fehler beim Einzahlen: Einzahlbetrag ist kleiner 0");
        }

        if (girokonto1.auszahlen(1000)) {
            System.out.println(girokonto1);
        } else {
            System.out.println("Fehler beim Auszahlen: Guthaben und Kreditlimit kleiner als Auszahlbetrag");
        }

        if (girokonto1.ueberweisen(2000, girokonto2)) {
            System.out.println(girokonto2);
            System.out.println(girokonto1);
        } else {
            System.out.println("Fehler beim Überweisen");
        }

        System.out.println("--------------------");
        System.out.println("---- Überweisung ---");
        if (girokonto2.auszahlen(200.0)) {
            System.out.println(girokonto2);
        } else {
            System.out.println("Fehler beim Auszahlen: Guthaben und Kreditlimit kleiner als Auszahlbetrag");
        }
        System.out.println("--------------------");

        if (girokonto1.ueberweisen(100.0, girokonto2)) {
            System.out.println(girokonto1);
        } else {
            System.out.println("Fehler beim Überweisen");
        }

    }

}
