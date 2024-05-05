package com.planealo.harninasantiago.utils;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class UtilesTest {

	@Test
	@DisplayName("Generar Referencias")
	void testGenerateReferencia() {
		
		ArrayList<String> referencias = new ArrayList<>();
		// genero referencias
		for (int i = 0; i < 25; i++) {
			referencias.add(Utiles.generateReferencia());
		}
		referencias.forEach(r-> System.out.println(r));
		
		// comprobamos el formato
		 String regex = "^#[0-9A-F]{6}-[0-9A-F]{2}$";
	       
		for (String referencia : referencias) {
			assertTrue(referencia.matches(regex));
		}
		
	}

}
