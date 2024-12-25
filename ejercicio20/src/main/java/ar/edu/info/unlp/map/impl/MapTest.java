package ar.edu.info.unlp.map.impl;

import static org.junit.jupiter.api.Assertions.*;

import java.util.HashMap;
import java.util.Map;



public class MapTest {
	public static void main(String[] args) {
		
		Map<String, Integer> tuplas = new HashMap<>();
		tuplas.put("Lionel Messi", 111);
		tuplas.put("Gabriel Batistuta", 56);
		tuplas.put("Kun Aguero", 42);
		
		
		// Eliminar la clave 
		tuplas.remove("Kun Aguero");
		assertFalse(tuplas.containsKey("Kun Aguero"));
		
		//Actualizar goles
		tuplas.put("Lionel Messi", 112);
		assertEquals(112, tuplas.get("Lionel Messi"));
		
		// Intentar repetir la clave, se sobreescribe
		tuplas.put("Gabriel Batistuta", 56);
		
		
		
		int golesTotales=0;
		for(int goles : tuplas.values()) {
			golesTotales+=goles;
		}
		System.out.println("Total de goles "+golesTotales);
		assertEquals(168, golesTotales);
	}
}
