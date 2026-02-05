package dat109Test;

import dat109.Brett;
import dat109.Brikke;
import dat109.Rute;
import dat109.Spiller;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SpillerTest {

    @Test
    void testSpillTrekk() {
        Brett brett = new Brett();
        Rute start = brett.getRuter().get(0);
        Brikke brikke = new Brikke("b1", start);
        brett.leggTilBrikke(brikke);

        Spiller spiller = new Spiller("Ole", brikke, brett);

        // Fake terningsum
        int terningsum = 3;
        Rute nyRute = brett.finnNyRute(terningsum, brikke.getRute());
        brikke.setRute(nyRute);

        assertEquals(4, spiller.getRute().getNr(), "Brikken skal ha flyttet til rute 4");
    }

    @Test
    void testGetNavn() {
        Spiller spiller = new Spiller("Ole", new Brikke("b1", new Rute(1)), new Brett());
        assertEquals("Ole", spiller.getNavn());
    }
}