import java.util.ArrayList;
import java.util.List;

public class Brett {

    //Liste med alle rutene våres
    private List<Rute> ruter;

    //Liste av alle brikkene
    private List<Brikke> brikker;

    private static final int ANTALL_RUTER = 100;

    public Brett() {

        ruter = new ArrayList<>();
        brikker = new ArrayList<>();
        opprettRuter();
    }

    private void opprettRuter() {
        for (int i = 0; i < ANTALL_RUTER; i++) {
            ruter.add(new Rute(i));
        }
    }

    //Metoden som finner ruten brikken skal flyttes til
    public Rute finnNyRute(int sum, Rute rute){

        int nyIndex = sum + rute.getNr();

        if(nyIndex > ANTALL_RUTER){
            nyIndex = ANTALL_RUTER - (nyIndex - ANTALL_RUTER);
        }

        return ruter.get(nyIndex);
    }

    public boolean brikkePaaSisteRute() {
        for (Brikke brikke : this.brikker) {
            if (brikke.getRute().getNr() == ANTALL_RUTER) {
                return true;
            }
        }
        return false;
    }
}
