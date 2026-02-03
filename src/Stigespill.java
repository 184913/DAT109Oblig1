/**
 * Klasse for å initialisere stigespillet
 */
public class Stigespill {

    private List<Spiller> spillere;

    /**
     * Metode for å initalisere spillet
     */
    public void spill() {

        Spiller s1 = new Spiller("a", new  Brikke("a sin brikke", new Rute(0)));
        Spiller s2 = new Spiller("b", new  Brikke("b sin brikke", new Rute(0)));

        while(!Brett.brikkePaaSisteRute()) {
            spillRunde();
            for(Spiller spiller : spillere) {
                system.out.println();
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
