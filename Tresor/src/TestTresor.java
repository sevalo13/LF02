import java.util.ArrayList;

public class TestTresor {
    public static void main(String[] args) {


        Schmuck schmuck = new Schmuck(1532526,46346309,"HALLO");
        schmuck.toString();
        Aktie aktie = new Aktie(269060,20780,"Azam","drei");
        aktie.toString();
        Tresor tresor = new Tresor();
        tresor.addGegenstand(schmuck);
        tresor.addGegenstand(aktie);
        tresor.toString();


        System.out.println(schmuck);
        System.out.println(aktie);
        System.out.println(tresor);
    }
}
