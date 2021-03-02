package principal;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class EcuacionCuadraticaTest {

    @Test
    void haySolucion() {
        assertFalse(new EcuacionCuadratica().haySolucion());
        assertFalse(new EcuacionCuadratica(0,0,1).haySolucion());
        assertFalse(new EcuacionCuadratica(1,0,1).haySolucion());
        assertFalse(new EcuacionCuadratica(0,1,1).haySolucion());
        assertTrue(new EcuacionCuadratica(1,1,0).haySolucion());
        assertTrue(new EcuacionCuadratica(-1,0,1).haySolucion());
    }

    @Test
    void solucion() {
   //     assertEquals(new double[]{0, 0}, new EcuacionCuadratica().solucion());
   //     assertEquals(new double[]{-1, 0}, new EcuacionCuadratica(0,1,1).solucion());
        List<Double> v = new ArrayList<>();
        v.add(0.0);
        v.add(-1.0);
        assertEquals(v, new EcuacionCuadratica(1,1,0).solucion());
        v = new ArrayList<>();
        v.add(-1.0);
        v.add(1.0);
        assertEquals(v, new EcuacionCuadratica(-1,0,1).solucion());
    }
}