import java.util.ArrayList;

public class Programm111111111 {
    public static void main(String[] args) {
        System.out.println("mannschaft");
        Trainer trainer1 = new Trainer("ahmed" , 6,22);
        Torwart torwart1 = new Torwart("abo ahmed" ,17, 3 , 3,3);
        ArrayList<Spieler> spielerArrayList = new ArrayList<>();
        Spieler spieler1 = new Spieler("abo abo Ahmeb",106 ,1,0,1,0);
        Spieler spieler2 = new Spieler("abo abo abo ahmed",126,-0,0,-0,0);
        Spieler spieler3 = new Spieler("abo abo abo abo ahmed",155,-5,0,-10,0);
        Spieler spieler4 = new Spieler("abo abo abo abo abo ahmed",175,-20,0,-25,0);
        spielerArrayList.add(spieler1);
        Mannschaft team = new Mannschaft("abo ahmed mannschaft",trainer1,torwart1,spielerArrayList);
        System.out.println(team);
    }

}
