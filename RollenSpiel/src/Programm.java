public class Programm {
    public static void main(String[] args)  {


        Zauberer hatem =new Zauberer("Hatem",0,0);


        try {
           hatem.zauber();
        }catch (keineKraftException e){
            System.out.println(e.messge());
        }
        System.out.println(hatem);
    }
}
