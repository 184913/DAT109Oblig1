package dat109Test;

import dat109.Brett;
import dat109.Rute;
import dat109.Brikke;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BrettTest {


    @Test
    void testOpprettRuter() {
        Brett brett = new Brett();
        assertEquals(100, brett.getRuter().size(), "Brettet skal ha 100 ruter");
        assertEquals(1, brett.getRuter().get(0).getNr(), "Første rute skal ha nummer 1");
        assertEquals(100, brett.getRuter().get(99).getNr(), "Siste rute skal ha nummer 100");
    }

    @Test
    void testFinnNyRuteInBounds() {
        Brett brett = new Brett();
        Rute start = brett.getRuter().get(0); // rute 1
        Rute nyRute = brett.finnNyRute(3, start);
        assertEquals(4, nyRute.getNr(), "Brikken skal flyttes til rute 4");
    }

    @Test
    void testFinnNyRuteBounceBack() {
        Brett brett = new Brett();
        Rute start = brett.getRuter().get(98); // rute 99
        Rute nyRute = brett.finnNyRute(5, start);
        // nyIndex = 99 + 5 = 104 -> bounce back: 100 - (104 - 100) = 96
        assertEquals(96, nyRute.getNr(), "Brikken skal bounce tilbake til rute 96");
    }

    @Test
    void testBrikkePaaSisteRuteFalse() {
        Brett brett = new Brett();
        Brikke b = new Brikke("b1", brett.getRuter().get(0));
        brett.leggTilBrikke(b);
        assertFalse(brett.brikkePaaSisteRute(), "Ingen brikke på siste rute ennå");
    }

    @Test
    void testBrikkePaaSisteRuteTrue() {
        Brett brett = new Brett();
        Brikke b = new Brikke("b1", brett.getRuter().get(99)); // rute 100
        brett.leggTilBrikke(b);
        assertTrue(brett.brikkePaaSisteRute(), "En brikke står på siste rute");
    }
}