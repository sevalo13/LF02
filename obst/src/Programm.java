public class Programm {
    public static void main(String[] args) {
        Apfel apfel = new Apfel();
        apfel.setFarbe("grün");
        apfel.setGewicht(250);
        apfel.setReif(true);

        System.out.println(apfel.getName());
        System.out.println(apfel.getFarbe());
        System.out.println(apfel.getGewicht());

        Obst banane = new Obst("Banane");
        //apfel2.name = "Apfel";
        banane.setFarbe("rot");
        banane.setGewicht(150);


        System.out.println(apfel);
        System.out.println(banane);
    }
}
