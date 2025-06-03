package Calculadora;

public class Calculadora {
    public static double somar(double a, double b) {
        return a + b;
    }

    public static double subtrair(double a, double b) {
        return a - b;
    }

    public static double multiplicar(double a, double b) {
        return a * b;
    }

    public static double dividir(double a, double b) throws IllegalArgumentException  {
        if (b == 0) {
            throw new IllegalArgumentException("O divisor não pode ser 0");
        }

        return a/b;
    }
}
