package dat109;

import java.util.ArrayList;
import java.util.List;

/**
 * klasse for å håndtere brettet
 */

public class Brett {

    //Liste med alle rutene på brettet
    private List<Rute> ruter;

    //Liste av alle brikkene på brettet
    private List<Brikke> brikker;

    //Antall ruter på brettet
    private static final int ANTALL_RUTER = 100;

    //Konstruktør for å oprette spillbrettet
    public Brett() {

        ruter = new ArrayList<>();
        brikker = new ArrayList<>();
        opprettRuter();
    }

    //Metode som opretter rutene på brettet
    private void opprettRuter() {
        for (int i = 1; i <= ANTALL_RUTER; i++) {
            ruter.add(new Rute(i));
        }
    }

    //Metoden som finner ruten brikken skal flyttes til
    public Rute finnNyRute(int sum, Rute rute){

        //Finner nummeret på den nye ruten brikken skal flyttes til
        int nyIndex = sum + rute.getNr();

        //Hvis spiller går over antall_ruter skal brikken flyttes tilbake med tilsvarende verdi
        if(nyIndex > ANTALL_RUTER){
            nyIndex = ANTALL_RUTER - (nyIndex - ANTALL_RUTER);
        }

        return ruter.get(nyIndex - 1);
    }

    //Sjekker det finnes en brikke som står på siste rute
    public boolean brikkePaaSisteRute() {
        for (Brikke brikke : this.brikker) {
            if (brikke.getRute().getNr() == ANTALL_RUTER) {
                return true;
            }
        }
        return false;
    }

    //Returnerer listen med ruter
    public List<Rute> getRuter(){
        return ruter;
    }

    //legger til brikke i listen av brikker
    public void leggTilBrikke(Brikke brikke){
        brikker.add(brikke);
    }
}
