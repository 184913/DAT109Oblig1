public class Brett {

    //Liste med alle rutene våres
    private List<Rute> r;

    //Liste av alle brikkene
    private List <Brikke > b;

    //Metoden som finnerRuten brikken står på
    private Rute finnRute(){
        int pos = Brikke.getPosisjon();

        return r.get(pos);
    }
}
