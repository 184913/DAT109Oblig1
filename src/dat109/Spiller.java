package dat109;

/**
 * Klasse for å opprette en spiller
 */

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

    //Returnerer ruten spilleren står på
    public Rute getRute(){
        return brikke.getRute();
    }

    //Metode for trille terning, og flytte brikken til en ny rute
    public void spillTrekk() {

        //Triller terning
        int sum = Terning.trill();

        //finner den nye ruten
        Rute nyRute = brett.finnNyRute(sum, brikke.getRute());

        //Oppdater brikken med ny rute
        brikke.setRute(nyRute);

    }

    //Returnerer navnet på spilleren
    public String getNavn(){
        return this.navn;
    }

    //Skrivet ut navnet og ruten til spilleren
    public void skrivUt(){
        System.out.println("navn: " + this.navn + " | " + "rute: " + this.brikke.getRute().getNr());
    }

}
