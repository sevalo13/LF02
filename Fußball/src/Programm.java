import java.util.ArrayList;

public class Programm {
    public static void main(String[] args) throws SpielAbbruchException {
     Trainer trainer = new Trainer("Lucas der Boss" , 3,22);

     Spieler spieler = new Spieler("Peter" , 23 , 4 , 1 , 2 , 6);

     Torwart torwart = new Torwart("nick" , 25 , 8 , 4 , 9 );

    Ergebnis ergebnis = new Ergebnis();




        System.out.println("Mannschaft Groepelingen");
        Trainer trainer1 = new Trainer("Milo" , 6,22);
        Torwart torwart1 = new Torwart("Hans" ,17, 3 , 3,3);
        Spieler spieler1 = new Spieler(" Kai",9,1,0,1,0);
        Spieler spieler2 = new Spieler(" Mika",3,-0,0,-0,0);
        Spieler spieler3 = new Spieler(" ahmed",6,-20,0,-25,0);
        ArrayList<Spieler> spielerArrayList = new ArrayList<>();
        spielerArrayList.add(spieler1);
        spielerArrayList.add(spieler2);
        spielerArrayList.add(spieler3);
        Mannschaft teamGroepelingen = new Mannschaft("abo ahmed mannschaft",trainer1,torwart1,spielerArrayList);
        System.out.println(teamGroepelingen);



        Trainer trainer2 = new Trainer("lucas" , 5,52);
        Torwart torwart2 = new Torwart("Nicko" ,23, 8 , 7,5);
        Spieler spieler5 = new Spieler(" Roman",56 ,5,4,2,7);
        Spieler spieler6 = new Spieler(" peter",23,1,3,8,6);
        Spieler spieler7 = new Spieler(" Aaron",23,4,6,9,7);
        ArrayList<Spieler> spielerArrayListHeim = new ArrayList<>();
        spielerArrayList.add(spieler5);
        spielerArrayList.add(spieler6);
        spielerArrayList.add(spieler7);
        Mannschaft teamGast = new Mannschaft("lucas mannschaft",trainer1,torwart1,spielerArrayList);
        Spiel spiel = new Spiel(teamGroepelingen, teamGast );
        System.out.println(spiel);


        System.out.println(trainer);
        System.out.println();
        System.out.println(spieler);
        System.out.println();
        System.out.println(torwart);
        System.out.println();










    }
}
