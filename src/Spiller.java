public class Spiller {

    private String navn;
    private Brikke brikke;

    //Konstruktør for spiller
    public Spiller(String navn, Brikke brikke) {
        this.navn = navn;
        this.brikke = brikke;
    }


    public void spillTrekk() {

        //Triller terning
        int sum = Terning.trill();

        //finner den nye ruten
        Rute nyRute = flytt(brikke.getRute(), sum);

        //Oppdater brikken med ny rute
        brikke.setRute(nyRute);

    }

}
