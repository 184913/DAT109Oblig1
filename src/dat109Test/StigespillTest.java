package dat109Test;

import dat109.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StigespillTest {

    @Test
    void testStartRuter() {
        Stigespill spill = new Stigespill();

        for (Spiller s : spill.getSpillere()) {
            assertEquals(1, s.getRute().getNr(), "Alle spillere skal starte på rute 1");
        }
    }

    @Test
    void testSpillRunde() {
        // Opprett brett og spiller
        Brett brett = new Brett();
        Brikke b = new Brikke("b1", brett.getRuter().get(0));
        brett.leggTilBrikke(b);
        Spiller s = new Spiller("Test", b, brett);

        // Fake terningsum
        int terningsum = 3;
        Rute nyRute = brett.finnNyRute(terningsum, s.getRute());
        s.getRute().setNr(nyRute.getNr());

        assertEquals(4, s.getRute().getNr(), "Brikken skal flytte til rute 4 etter 3 i terningsum");
    }
}