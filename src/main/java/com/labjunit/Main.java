package com.labjunit;

public class Main {
    public static void main(String[] args) {
        Calculatrice calculatrice = new Calculatrice();
        
        double s = calculatrice.addition(1, 2);
        System.out.println("1 + 2 = " + s);

        double p = calculatrice.multiplication(2, 3);
        System.out.println("2 * 3 = " + p);

        double d = calculatrice.division(6, 3);
        System.out.println("6 / 3 = " + d);

        double pui = calculatrice.puissance(2, 3);
        System.out.println("2 ^ 3 = " + pui);

        double f = calculatrice.factorielle(5);
        System.out.println("5! = " + f);

        double fib = calculatrice.fibonacci(5);
        System.out.println("Fibonacci(5) = " + fib);

        double pgcd = calculatrice.pgcd(12, 15);
        System.out.println("PGCD(12, 15) = " + pgcd);

        double ppcm = calculatrice.ppcm(12, 15);
        System.out.println("PPCM(12, 15) = " + ppcm);

        double somme = calculatrice.sommeDesImpairs(5);
        System.out.println("Somme des impairs de 1 à 5 = " + somme);
    }
}