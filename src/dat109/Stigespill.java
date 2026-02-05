package dat109;

import java.util.ArrayList;
import java.util.List;

/**
 * Klasse for å initialisere stigespillet
 */
public class Stigespill {

    private List<Spiller> spillere;
    private Brett brett;

    /**
     * Metode som oppretter alle modulene i stigespillet
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
     * Metode for å initalisere spillet
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
     * Metode som representerer en spill runde
     */
    public void spillRunde() {

        for (Spiller spiller : spillere) {
            spiller.spillTrekk();
        }

    }
}
