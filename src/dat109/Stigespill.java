package dat109;

import java.util.ArrayList;
import java.util.List;

/**
 * Klasse for å håndtere stigespillet
 * <p>
 * Inneholder logikk for å opprette spillere, brett og brikker,
 * samt spill løkken som stryrer spillets gang
 *
 */
public class Stigespill {

    private List<Spiller> spillere;
    private Brett brett;

    /**
     * Oppretter stigespillet med hardkodet data
     * <p>
     * Oppretter nytt brett, spillere og brikker
     *
     */
    public Stigespill(){

        this.brett = new Brett();
        this.spillere = new ArrayList<>();

        Brikke b1 = new Brikke("a sin brikke", brett.getRuter().get(0));
        Brikke b2 = new Brikke("b sin brikke", brett.getRuter().get(0));

        Spiller s1 = new Spiller("a", b1, brett);
        Spiller s2 = new Spiller("b", b2, brett);

        spillere.add(s1);
        spillere.add(s2);

        brett.leggTilBrikke(b1);
        brett.leggTilBrikke(b2);

    }

    /**
     * Starter spill løkken
     * <p>
     * Løkken kjører så lenge ingen spillere er på siste rute.
     * For hver spiller kjøres spillRunde().
     */
    public void spill() {

        while(!brett.brikkePaaSisteRute()){
            spillRunde();
            for(Spiller spiller : spillere) {
                spiller.skrivUt();

            }
        }

        for(Spiller spiller : spillere) {
            if (spiller.getRute().getNr() == 100) {
                System.out.println("Spillet er ferdig! Vinneren er: " + spiller.getNavn());
                break;
            }
        }

    }

    /**
     * Representerer en spill runde
     * <p>
     * Hver spiller gjør et trekk.
     * Etter hvert trekk sjekkes det om det er en brikke på siste rute.
     */
    public void spillRunde() {

        for (Spiller spiller : spillere) {
            spiller.spillTrekk();

            if (brett.brikkePaaSisteRute()) {
                break; // stopper runden så snart noen vinner
            }
        }

    }
}
