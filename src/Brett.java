import java.util.List;

public class Brett {

    //Liste med alle rutene våres
    private List<Rute> ruter;

    //Liste av alle brikkene
    private List<Brikke> brikker;

    //Metoden som finner ruten brikken står på
    private Rute finnRute(int sum, Rute rute){

        return Brikke.getPosisjon() + sum;
    }
}
