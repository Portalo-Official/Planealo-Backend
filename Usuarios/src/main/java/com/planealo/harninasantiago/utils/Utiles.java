package com.planealo.harninasantiago.utils;

import java.util.Random;

public class Utiles {
	
    private static final int DIGITOS_HEX = 16; // 16 elementos desde 0 a F
    private static final int CABECERA = 6; // Cabezera: #34AF0C  Cola: -6A
    private static final int COLA = 2;
    
    /**
     * Metodo que genera una referencia, tiene 2 partes,
     * una cabecera (#34AF0C) y una cola (-6A), de tal forma
     * #34AF0C-6A
     * @return Return una referencia en hexadecimal.
     */
    public static String generateReferencia() {
        Random rnd = new Random();
        StringBuilder referencia = new StringBuilder("#");

        for (int i = 0; i < CABECERA; i++) {
            int digito = rnd.nextInt(DIGITOS_HEX);
            referencia.append(Integer.toHexString(digito).toUpperCase());
        }
        
        //Cola
        referencia.append("-");
        for (int i = 0; i < COLA; i++) {
        	int digito = rnd.nextInt(DIGITOS_HEX);
        	referencia.append(Integer.toHexString(digito).toUpperCase());
        }
        
        return referencia.toString();
    }
	
}
