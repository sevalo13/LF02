import java.awt.print.Printable;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class TestKaufvertrag {
    public static void main(String[] args) throws FileNotFoundException {


            Ware ware = new Ware("Laptop", 250.0);
            ware.setBeschreibung("Super krasses Gaming-Laptop");
            ware.getBesonderheiten().add("Tasche");
            ware.getBesonderheiten().add("Gaming-Maus");
            ware.getMaengel().add("Ladekabel fehlt");
            ware.getMaengel().add("Touchpad defekt");

            Vertragspartner kaeufer = new Vertragspartner("Klaus", "Brandt");
            kaeufer.setAusweisNr("0123456789");
            kaeufer.setAdresse(new Adresse("Zu Hause", "3a", "28199", "Bremen"));

            Vertragspartner verkaeufer = new Vertragspartner("Joachim", "Bredull");
            verkaeufer.setAusweisNr("9876543210");
            verkaeufer.setAdresse(new Adresse("Auch zu Hause", "7", "28195", "Bremen"));

            Kaufvertrag vertrag = new Kaufvertrag(verkaeufer, kaeufer, ware);
            vertrag.setZahlungsModalitaeten("Privater Barverkauf");

            String Verkaufvertrag = "Kaufvertrag/Verkaufvertrag.txt";
            PrintWriter writer = new PrintWriter(Verkaufvertrag);
            writer.println(vertrag);
            writer.close();

        }

    }
