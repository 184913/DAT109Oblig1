package dat109;

/**
 * Klasse som oppretter rutene på brettet
 */

public class Rute {

    private int nr;

    //Konstruktør for rute
    public Rute(int nr) {
        this.nr = nr;
    }

    //Returnerer nummeret til ruten
    public int getNr(){
        return nr;
    }
}
