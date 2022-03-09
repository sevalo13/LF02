import java.util.ArrayList;

public class TestTresor {
    public static void main(String[] args) {


        Schmuck schmuck = new Schmuck(32,2,"HALLO");
        Aktie aktie = new Aktie(2,2,"Azam","drei");
        Tresor tresor = new Tresor();
        tresor.addGegenstand(schmuck);
        tresor.addGegenstand(aktie);


        System.out.println(schmuck);
        System.out.println(aktie);
        System.out.println(tresor);
    }
}
