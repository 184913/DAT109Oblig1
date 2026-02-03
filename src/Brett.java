import java.util.List;

public class Brett {

    //Liste med alle rutene våres
    private List<Rute> ruter;

    //Liste av alle brikkene
    private List<Brikke> brikker;

    //Metoden som finner ruten brikken skal flyttes til
    private Rute finnNyRute(int sum, Rute rute){

        int nyIndex = sum + rute.getNr();

        if(nyIndex > 100){
            nyindex = 100 - (nyindex - 100);
        }

        return ruter.get(nyIndex);
    }

    public boolean brikkePaaSisteRute() {
        for (Brikke brikke : brikker) {
            if (brikke.getRute().getNr() == 100) {
                return true;
            }
        }
        return false;
    }
}
