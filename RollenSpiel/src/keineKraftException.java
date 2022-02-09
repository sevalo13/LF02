public class keineKraftException extends Throwable {
     private String aktion;
     private String name;


     public  keineKraftException(String aktion, String name ){
          this.name=name;
          this.aktion=aktion;

     }
     public String messge(){
          return name +" ist zu schwach zum "+aktion;
     }
}
