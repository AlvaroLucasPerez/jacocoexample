package org.example;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assumptions.assumeTrue;

public class ProvaCicleVida {

    public ProvaCicleVida(){
        System.out.println("--- Constructor ---");
    }

    @BeforeAll
    static void setup() {
        System.out.println("@BeforeAll => setup(): S'executa ABANS de començar les proves");
    }

    @AfterAll
    static void tear() {
        System.out.println("@AfterAll => tear(): S'executa al FINAL de totes les proves");
    }

    @BeforeEach
    void setupThis(){
        System.out.println("@BeforeEach => setupThis(): S'executa ABANS de cada PROVA");
    }

    @AfterEach
    void tearThis(){
        System.out.println("@AfterEach => tearThis(): S'executa DESPRES de cada PROVA");
    }

    @DisplayName("Primer test...")
    @RepeatedTest(3)
    void testOne(){
        boolean isServerUp = Math.random() >= 0.5;
        assumeTrue(isServerUp, "Ignoring test, server is down");

        int resultatEsperat = 3;
        assertEquals(resultatEsperat, 1+2);

        System.out.println("====== TEST ONE EXECUTAT ======");
    }


    @DisplayName("Segon test...")
    @RepeatedTest(value = 2, name = "--> {currentRepetetion}/{totalRepetitions}")
    void testTwo(){
        int resultatEsperat = 3;
        assertEquals(resultatEsperat, 1+2);

        System.out.println("====== TEST TWO EXECUTAT ======");
    }

}
