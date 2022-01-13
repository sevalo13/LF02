public class Programm {
    public static void main(String[] args) {
        Apfel apfel = new Apfel();
        apfel.setFarbe("grün");
        apfel.setGewicht(250);
        apfel.setReif(true);

        System.out.println(apfel.getName());
        System.out.println(apfel.getFarbe());
        System.out.println(apfel.getGewicht());

        Obst apfel2 = new Obst("Banane");
        //apfel2.name = "Apfel";
        apfel2.setFarbe("rot");
        apfel2.setGewicht(150);

        System.out.println(apfel2.getName());
        System.out.println(apfel2.getGewicht());
        System.out.println(apfel2.getFarbe());
    }
}
