package dat109;

public class Spiller {

    private String navn;
    private Brikke brikke;
    private Brett brett;

    //Konstruktør for spiller
    public Spiller(String navn, Brikke brikke, Brett brett) {
        this.navn = navn;
        this.brikke = brikke;
        this.brett = brett;
    }

    public Rute getRute(){
        return brikke.getRute();
    }

    public void spillTrekk() {

        //Triller terning
        int sum = Terning.trill();

        //finner den nye ruten
        Rute nyRute = brett.finnNyRute(sum, brikke.getRute());

        //Oppdater brikken med ny rute
        brikke.setRute(nyRute);

    }

    public String getNavn(){
        return this.navn;
    }

    public void skrivUt(){
        System.out.println("navn: " + this.navn + " | " + "rute: " + this.brikke.getRute().getNr());
    }

}
