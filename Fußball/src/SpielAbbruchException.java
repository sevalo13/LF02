import java.util.Random;

public class SpielAbbruchException extends Exception {

     private String message;
    private int spielMinute;


SpielAbbruchException(int spielMinute,String message ){
    this.message=message;
    this.spielMinute=spielMinute;

}
 public String getMessage(){
    return message;
 }
 public int getSpielMinute(){
    return spielMinute;
 }







}

