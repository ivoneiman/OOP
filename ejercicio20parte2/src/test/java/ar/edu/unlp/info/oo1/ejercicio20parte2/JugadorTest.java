package ar.edu.unlp.info.oo1.ejercicio20parte2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

public class JugadorTest {
    private Map<Jugador, Integer> jugadores;

    @BeforeEach
    void setUp() {
        jugadores = new HashMap<>();
        jugadores.put(new Jugador("Messi", "Lionel"), 111);
        jugadores.put(new Jugador("Batistuta", "Gabriel"), 56);
    }

    @Test
    void testAgregarJugador() {
        jugadores.put(new Jugador("Aguero", "Kun"), 42);
        assertEquals(42, jugadores.get(new Jugador("Aguero", "Kun")));
    }

    @Test
    void testEliminarJugador() {
        jugadores.remove(new Jugador("Batistuta", "Gabriel"));
        assertFalse(jugadores.containsKey(new Jugador("Batistuta", "Gabriel")));
    }

    @Test
    void testActualizarGoles() {
        jugadores.put(new Jugador("Messi", "Lionel"), 112);
        assertEquals(112, jugadores.get(new Jugador("Messi", "Lionel")));
    }

    @Test
    void testDuplicarClave() {
        jugadores.put(new Jugador("Batistuta", "Gabriel"), 60); // Sobrescribe el valor
        assertEquals(60, jugadores.get(new Jugador("Batistuta", "Gabriel")));
    }

    @Test
    void testObtenerTotalDeGoles() {
    	int golesTotales = 0;
        for (int goles : jugadores.values()) {
            golesTotales += goles;
        }

        System.out.println("Total de goles: " + golesTotales);
        assertEquals(167, golesTotales); // 111 + 56
    }
}
