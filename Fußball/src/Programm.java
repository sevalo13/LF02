import java.util.ArrayList;

public class Programm {
    public static void main(String[] args) {
     Trainer trainer = new Trainer("Lucas der Boss" , 3,22);

     Spieler spieler = new Spieler("Peter" , 23 , 4 , 1 , 2 , 6);

     Torwart torwart = new Torwart("nick" , 25 , 8 , 4 , 9 );

    Ergebnis ergebnis = new Ergebnis(2,1,2);


        System.out.println("Mannschaft Groepelingen");
        Trainer trainer1 = new Trainer("ahmed" , 6,22);
        Torwart torwart1 = new Torwart("abo ahmed" ,17, 3 , 3,3);

        Spieler spieler1 = new Spieler(" Ahmeb",106 ,1,0,1,0);

        Spieler spieler2 = new Spieler(" ahmed",126,-0,0,-0,0);

        Spieler spieler3 = new Spieler(" ahmed",175,-20,0,-25,0);
        ArrayList<Spieler> spielerArrayList = new ArrayList<>();
        spielerArrayList.add(spieler1);

        spielerArrayList.add(spieler2);



        spielerArrayList.add(spieler3);

        Mannschaft teamGroepelingen = new Mannschaft("abo ahmed mannschaft",trainer1,torwart1,spielerArrayList);



        System.out.println(teamGroepelingen);
        Trainer trainer2 = new Trainer("lucas" , 5,52);
        Torwart torwart2 = new Torwart("abo lucas" ,23, 8 , 7,5);
        ArrayList<Spieler> spielerArrayListHeim = new ArrayList<>();
        Spieler spieler5 = new Spieler(" Ahmeb",56 ,5,4,2,7);

        Spieler spieler6 = new Spieler(" peter",23,1,3,8,6);

        Spieler spieler7 = new Spieler(" Aaron",23,4,6,9,7);


        spielerArrayList.add(spieler1);

        spielerArrayList.add(spieler5);

        spielerArrayList.add(spieler6);

        spielerArrayList.add(spieler7);

        Mannschaft teamGast = new Mannschaft("abo ahmed mannschaft",trainer1,torwart1,spielerArrayList);
        Spiel spiel = new Spiel(teamGroepelingen, teamGast );


       Gameplay gameplay = new Gameplay()

        System.out.println(trainer);
        System.out.println();
        System.out.println(spieler);
        System.out.println();
        System.out.println(torwart);
        System.out.println();
        System.out.println(ergebnis);
        System.out.println();
        System.out.println(spiel);

    }
}
