public class Brett {

    private List<Rute> r;
    private List <Brikke > b;

    private Rute finnRute(){
        int pos = Brikke.getPosisjon();

        return r.get(pos);
    }
}
