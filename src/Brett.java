public class Brett {

    //Liste med alle rutene våres
    private List<Rute> r;

    //Liste av alle brikkene
    private List <Brikke > b;

    //Metoden som finner ruten brikken står på
    private Rute finnRute(int sum, Rute rute){

        return Brikke.getPosisjon() + sum;
    }
}
