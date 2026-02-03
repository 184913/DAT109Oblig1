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
        Rute nyRute = brett.finnNyRute(brikke.getRute(), sum);

        //Oppdater brikken med ny rute
        brikke.setRute(nyRute);

    }

    public void skrivUt(){
        System.out.println("navn: " + this.navn + "brett: " + this.brett + "brikke: " + this.brikke);
    }

}
