package dat109;

/**
 * Klasse som håndterer brikkene på brettet
 */

public class Brikke {

    private String navn;
    private Rute rute;

    //Konstruktør for brikke
    public Brikke(String navn, Rute rute){
        this.navn = navn;
        this.rute = rute;
    }

    //Returnerer ruten som brikken står på
    public Rute getRute(){
        return rute;
    }

    //Gir brikken en ny rute
    public void setRute(Rute rute){
        this.rute = rute;
    }

}
