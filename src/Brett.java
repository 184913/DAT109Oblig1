import java.util.List;

public class Brett {

    //Liste med alle rutene våres
    private List<Rute> ruter;

    //Liste av alle brikkene
    private List<Brikke> brikker;

    //Metoden som finner ruten brikken skal flyttes til
    private Rute finnNyRute(int sum, Rute rute){

        return new Rute(Brikke.getRute().getNr() + sum);
    }
}
