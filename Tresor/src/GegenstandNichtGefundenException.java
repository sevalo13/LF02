public class GegenstandNichtGefundenException {
    private int Id;

    public GegenstandNichtGefundenException(int Id){
    }
    public int getId(){
        return Id;
    }
    public String getMessage(){
        return getMessage() +" Nicht Gefunden ";
    }
}
