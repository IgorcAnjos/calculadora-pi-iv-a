package org.example;

import Calculadora.Calculadora;

public class Main {
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();

        System.out.println("Somando 10+5: " + calc.somar(10, 5));             // 15.0
        System.out.println("Subtraindo 10-5: " + calc.subtrair(10, 5));       // 5.0
        System.out.println("Multiplicando 10*5: " + calc.multiplicar(10, 5)); // 50.0
        System.out.println("Dividindo 10/5: " + calc.dividir(10, 5));         // 2.0
    }

}