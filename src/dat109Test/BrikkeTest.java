package dat109Test;

import dat109.Brikke;
import dat109.Rute;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BrikkeTest {

    @Test
    void testGetRute() {
        Rute rute = new Rute(5);
        Brikke brikke = new Brikke("TestBrikke", rute);
        assertEquals(rute, brikke.getRute(), "getRute skal returnere korrekt rute");
    }

    @Test
    void testSetRute() {
        Rute rute1 = new Rute(5);
        Rute rute2 = new Rute(10);
        Brikke brikke = new Brikke("TestBrikke", rute1);
        brikke.setRute(rute2);
        assertEquals(rute2, brikke.getRute(), "setRute skal oppdatere ruten korrekt");
    }
}