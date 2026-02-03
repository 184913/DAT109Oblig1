/**
 * Klasse for å initialisere stigespillet
 */
public class Stigespill {

    private List<Spiller> spillere;

    /**
     * Metode for å initalisere spillet
     */
    public void spill() {

        while(!Brett.brikkePaaSisteRute()) {
            spillRunde();
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
