package Calculadora;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculadoraTest {

    @Test
    public void deveSomarDoisNumerosPositivos() {
        Assertions.assertEquals(5, new Calculadora().somar(0, 5));
        Assertions.assertEquals(1 + 6, new Calculadora().somar(1, 6));
        Assertions.assertEquals(2 + 7, new Calculadora().somar(2, 7));
        Assertions.assertEquals(3 + 8, new Calculadora().somar(3, 8));
        Assertions.assertEquals(4 + 9, new Calculadora().somar(4, 9));
        Assertions.assertEquals(5 + 10, new Calculadora().somar(5, 10));
    }

    @Test
    public void deveSomarDoisNumerosNegativos() {
        Assertions.assertEquals((-5), new Calculadora().somar(-0, -5));
        Assertions.assertEquals(-1 + (-6), new Calculadora().somar(-1, -6));
        Assertions.assertEquals(-2 + (-7), new Calculadora().somar(-2, -7));
        Assertions.assertEquals(-3 + (-8), new Calculadora().somar(-3, -8));
        Assertions.assertEquals(-4 + (-9), new Calculadora().somar(-4, -9));
        Assertions.assertEquals(-5 + (-10), new Calculadora().somar(-5, -10));
    }

    @Test
    public void deveSomarUmNumeroPositivoEUmNegativo() {
        Assertions.assertEquals((-5), new Calculadora().somar(0, -5));
        Assertions.assertEquals(1 + (-6), new Calculadora().somar(1, -6));
        Assertions.assertEquals(2 + (-7), new Calculadora().somar(2, -7));
        Assertions.assertEquals(3 + (-8), new Calculadora().somar(3, -8));
        Assertions.assertEquals(4 + (-9), new Calculadora().somar(4, -9));
        Assertions.assertEquals(5 + (-10), new Calculadora().somar(5, -10));

        Assertions.assertEquals((5), new Calculadora().somar(-0, 5));
        Assertions.assertEquals(-1 + 6, new Calculadora().somar(-1, 6));
        Assertions.assertEquals(-2 + 7, new Calculadora().somar(-2, 7));
        Assertions.assertEquals(-3 + 8, new Calculadora().somar(-3, 8));
        Assertions.assertEquals(-4 + 9, new Calculadora().somar(-4, 9));
        Assertions.assertEquals(-5 + 10, new Calculadora().somar(-5, 10));
    }

    @Test
    public void deveSubtrairDoisNumerosPositivos() {
        Assertions.assertEquals(-5, new Calculadora().subtrair(0, 5));
        Assertions.assertEquals(1 - 6, new Calculadora().subtrair(1, 6));
        Assertions.assertEquals(2 - 7, new Calculadora().subtrair(2, 7));
        Assertions.assertEquals(3 - 8, new Calculadora().subtrair(3, 8));
        Assertions.assertEquals(4 - 9, new Calculadora().subtrair(4, 9));
        Assertions.assertEquals(5 - 10, new Calculadora().subtrair(5, 10));
    }

    @Test
    public void deveSubtrairDoisNumerosNegativos() {
        Assertions.assertEquals((5), new Calculadora().subtrair(-0, -5));
        Assertions.assertEquals(-1 - (-6), new Calculadora().subtrair(-1, -6));
        Assertions.assertEquals(-2 - (-7), new Calculadora().subtrair(-2, -7));
        Assertions.assertEquals(-3 - (-8), new Calculadora().subtrair(-3, -8));
        Assertions.assertEquals(-4 - (-9), new Calculadora().subtrair(-4, -9));
        Assertions.assertEquals(-5 - (-10), new Calculadora().subtrair(-5, -10));
    }

    @Test
    public void deveSubtrairUmNumeroPositivoEUmNegativo() {
        Assertions.assertEquals((-5), new Calculadora().somar(0, -5));
        Assertions.assertEquals(1 + (-6), new Calculadora().somar(1, -6));
        Assertions.assertEquals(2 + (-7), new Calculadora().somar(2, -7));
        Assertions.assertEquals(3 + (-8), new Calculadora().somar(3, -8));
        Assertions.assertEquals(4 + (-9), new Calculadora().somar(4, -9));
        Assertions.assertEquals(5 + (-10), new Calculadora().somar(5, -10));

        Assertions.assertEquals((5), new Calculadora().somar(-0, 5));
        Assertions.assertEquals(-1 + 6, new Calculadora().somar(-1, 6));
        Assertions.assertEquals(-2 + 7, new Calculadora().somar(-2, 7));
        Assertions.assertEquals(-3 + 8, new Calculadora().somar(-3, 8));
        Assertions.assertEquals(-4 + 9, new Calculadora().somar(-4, 9));
        Assertions.assertEquals(-5 + 10, new Calculadora().somar(-5, 10));
    }

    @Test
    public void deveMultiplicarDoisNumerosPositivos() {
        Assertions.assertEquals(0, new Calculadora().multiplicar(0, 5));
        Assertions.assertEquals(6, new Calculadora().multiplicar(1, 6));
        Assertions.assertEquals(2 * 7, new Calculadora().multiplicar(2, 7));
        Assertions.assertEquals(3 * 8, new Calculadora().multiplicar(3, 8));
        Assertions.assertEquals(4 * 9, new Calculadora().multiplicar(4, 9));
        Assertions.assertEquals(5 * 10, new Calculadora().multiplicar(5, 10));
    }

    @Test
    public void deveMultiplicarDoisNumerosNegativos() {
        Assertions.assertEquals(-0, new Calculadora().multiplicar(-0, -5));
        Assertions.assertEquals(-1 * (-6), new Calculadora().multiplicar(-1, -6));
        Assertions.assertEquals(-2 * (-7), new Calculadora().multiplicar(-2, -7));
        Assertions.assertEquals(-3 * (-8), new Calculadora().multiplicar(-3, -8));
        Assertions.assertEquals(-4 * (-9), new Calculadora().multiplicar(-4, -9));
        Assertions.assertEquals(-5 * (-10), new Calculadora().multiplicar(-5, -10));
    }

    @Test
    public void deveMultiplicarUmNumeroPositivoEUmNegativo() {
        Assertions.assertEquals(0, new Calculadora().multiplicar(0, -5));
        Assertions.assertEquals((-6), new Calculadora().multiplicar(1, -6));
        Assertions.assertEquals(2 * (-7), new Calculadora().multiplicar(2, -7));
        Assertions.assertEquals(3 * (-8), new Calculadora().multiplicar(3, -8));
        Assertions.assertEquals(4 * (-9), new Calculadora().multiplicar(4, -9));
        Assertions.assertEquals(5 * (-10), new Calculadora().multiplicar(5, -10));

        Assertions.assertEquals(0, new Calculadora().multiplicar(-0, 5));
        Assertions.assertEquals(-1 * 6, new Calculadora().multiplicar(-1, 6));
        Assertions.assertEquals(-2 * 7, new Calculadora().multiplicar(-2, 7));
        Assertions.assertEquals(-3 * 8, new Calculadora().multiplicar(-3, 8));
        Assertions.assertEquals(-4 * 9, new Calculadora().multiplicar(-4, 9));
        Assertions.assertEquals(-5 * 10, new Calculadora().multiplicar(-5, 10));
    }

    @Test
    public void deveDividirDoisNumerosPositivos() {
        Assertions.assertEquals((double) 0 / 5, new Calculadora().dividir(0, 5));
        Assertions.assertEquals((double) 1 / 6, new Calculadora().dividir(1, 6));
        Assertions.assertEquals((double) 2 / 7, new Calculadora().dividir(2, 7));
        Assertions.assertEquals((double) 3 / 8, new Calculadora().dividir(3, 8));
        Assertions.assertEquals((double) 4 / 9, new Calculadora().dividir(4, 9));
        Assertions.assertEquals((double) 5 / 10, new Calculadora().dividir(5, 10));
    }

    @Test
    public void deveDividirDoisNumerosNegativos() {
        Assertions.assertEquals((double) -0 / -5, new Calculadora().dividir(-0, -5));
        Assertions.assertEquals((double) -1 / (-6), new Calculadora().dividir(-1, -6));
        Assertions.assertEquals((double) -2 / (-7), new Calculadora().dividir(-2, -7));
        Assertions.assertEquals((double) -3 / (-8), new Calculadora().dividir(-3, -8));
        Assertions.assertEquals((double) -4 / (-9), new Calculadora().dividir(-4, -9));
        Assertions.assertEquals((double) -5 / (-10), new Calculadora().dividir(-5, -10));
    }

    @Test
    public void deveDividirUmNumeroPositivoEUmNegativo() {
        Assertions.assertEquals((double) 0 / -5, new Calculadora().dividir(0, -5));
        Assertions.assertEquals((double) 1 / (-6), new Calculadora().dividir(1, -6));
        Assertions.assertEquals((double) 2 / (-7), new Calculadora().dividir(2, -7));
        Assertions.assertEquals((double) 3 / (-8), new Calculadora().dividir(3, -8));
        Assertions.assertEquals((double) 4 / (-9), new Calculadora().dividir(4, -9));
        Assertions.assertEquals((double) 5 / (-10), new Calculadora().dividir(5, -10));

        Assertions.assertEquals((double) -0 / 5, new Calculadora().dividir(-0, 5));
        Assertions.assertEquals((double) -1 / 6, new Calculadora().dividir(-1, 6));
        Assertions.assertEquals((double) -2 / 7, new Calculadora().dividir(-2, 7));
        Assertions.assertEquals((double) -3 / 8, new Calculadora().dividir(-3, 8));
        Assertions.assertEquals((double) -4 / 9, new Calculadora().dividir(-4, 9));
        Assertions.assertEquals((double) -5 / 10, new Calculadora().dividir(-5, 10));
    }

    @Test
    public void deveLancarErroAoDividirPorZero() {
        Assertions.assertThrows(ArithmeticException.class, () -> {
            new Calculadora().dividir(1, 0);
        });
    }


}
