import java.util.ArrayList;
import java.util.List;

/**
 * Klasse for å initialisere stigespillet
 */
public class Stigespill {

    private List<Spiller> spillere;
    private Brett brett;

    public Stigespill(){

         this.brett = new Brett();
         this.spillere = new ArrayList<>();

        Spiller s1 = new Spiller("a", new  Brikke("a sin brikke", new Rute(0)), brett);
        Spiller s2 = new Spiller("b", new  Brikke("b sin brikke", new Rute(0)), brett);

        spillere.add(s1);
        spillere.add(s2);

    }

    /**
     * Metode for å initalisere spillet
     */
    public void spill() {

        while(!brett.brikkePaaSisteRute()) {
            spillRunde();
            for(Spiller spiller : spillere) {
                spiller.skrivUt();
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
