public class Brikke {

    private String navn;
    private Rute rute;

    public Brikke(String navn, Rute rute){
        this.navn = navn;
        this.rute = rute;
    }

    public Rute getRute(){
        return rute;
    }

    public void setRute(Rute rute){
        this.rute = rute;
    }

}
