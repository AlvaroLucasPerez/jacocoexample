package org.example;

import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assumptions.*;

public class ProvaCicleVidaActivitats {

    /*
     Es importante el orden de los valores esperado y obtenido.
     */

    @Test
    void assertNotEqualsProof() {
        String string = "test";
        String string1 = "test1";
        assertNotEquals(string, string1);
    }

    /*
    Comprueba que la condición es cierta o falsa
     */

    @Test
    void assertTrueProof() {
        boolean cadena1 = true;
        String cadena2 = "HOLA";
        assertTrue(cadena1, cadena2);
    }

    /*
     Comprueba que la condición es cierta o falsa
     */

    @Test
    void assertFalseProof() {
        boolean cadena1 = false;
        String cadena2 = "ADIOS";
        assertFalse(cadena1, cadena2);
    }

    /*
     Comprueba que el objeto obtenido es nulo o no.
     */

    @Test
    void assertNullProof() {
        String cadena = null;
        assertNull(cadena);
    }

    /*
     Comprueba que el objeto obtenido es nulo o no.
     */

    @Test
    void assertNotNullProof() {
        String cadena = "JUnit";
        assertNotNull(cadena);
    }

    /*
     Verifica que ambos objetos no se refieran al mismo objeto.
     */

    @Test
    void assertSameProof() {
        String string = "test";
        String string1 = "test";
        assertSame(string, string1);
    }

    /*
    Verifica que ambos objetos no se refieran al mismo objeto.
     */

    @Test
    void assertNotSameProof() {
        String string = "test";
        String string1 = "test1";
        assertNotSame(string, string1);
    }

    /*
    Permite probar múltiples excepciones dentro de la misma prueba.
     */

    @Test
    void assertThrowsProof() {
        assertThrows(IOException.class,
                ()->{
                    FileReader fileReader = new FileReader("/Pachi");
                    fileReader.read();
                });
    }

    /*
     Si se llama con una expresión que se evalúa como true, la prueba se detendrá y se ignorará.
     */

    @Test
    void assumeFalseProof(){
        boolean esCierto = false;

        int num1 = 3;
        int num2 = 6;

        int resultado = num1 + num2;

        esCierto = true;
        assumeFalse(false);
    }

    /*
      Llama para asumir que actualmente cumple la condición especificada
     */

    @Test
    void assumingThatProof(){
        assertEquals(2, 1 + 1);

        assumingThat("DEV".equals(System.getenv("APP_MODE")),
                () -> {
                    // run this only if assumingThat condition is true
                    assertEquals(2, 1 + 1);
                });

        // run these assertions always, just like normal test
        assertEquals(2, 1 + 1);
    }
}
