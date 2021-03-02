package principal;

import static org.junit.jupiter.api.Assertions.*;

class EcuacionLinealTest {

    @org.junit.jupiter.api.Test
    void haySolucion() {
        assertTrue(new EcuacionLineal().haySolucion());
        assertTrue(new EcuacionLineal(1,2).haySolucion());
        assertFalse(new EcuacionLineal(0,2).haySolucion());
        assertTrue(new EcuacionLineal(1,0).haySolucion());
        assertTrue(new EcuacionLineal(-1,2).haySolucion());
        assertTrue(new EcuacionLineal(1,-2).haySolucion());
        assertTrue(new EcuacionLineal(-1,-2).haySolucion());
    }

    @org.junit.jupiter.api.Test
    void solucion() {
        assertEquals(0, new EcuacionLineal().solucion());
        assertEquals(-2, new EcuacionLineal(1,2).solucion());
        assertEquals(0, new EcuacionLineal(1,0).solucion());
        assertEquals(2, new EcuacionLineal(-1,2).solucion());
        assertEquals(2, new EcuacionLineal(1,-2).solucion());
        assertEquals(-2, new EcuacionLineal(-1,-2).solucion());
    }
}