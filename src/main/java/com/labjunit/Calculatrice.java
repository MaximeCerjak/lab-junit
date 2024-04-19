package com.labjunit;

public class Calculatrice {

    public int addition(int a, int b) {
        // control data
        if(a < 0 || b < 0) {
            throw new IllegalArgumentException("a and b must be positive");
        }
        return a + b;
    }

    public int soustraction(int a, int b) {
        // control data
        if(a < 0 || b < 0) {
            throw new IllegalArgumentException("a and b must be positive");
        }
        return a - b;
    }

    public int multiplication(int a, int b) {
        // control data
        if(a < 0 || b < 0) {
            throw new IllegalArgumentException("a and b must be positive");
        }
        return a * b;
    }

    public int division(int a, int b) {
        // control data
        if(a < 0 || b < 0) {
            throw new IllegalArgumentException("a and b must be positive");
        }
        if (b == 0) {
            throw new ArithmeticException("Division by zero");
        }
        return a / b;
    }

    public int puissance(int a, int b) {
        // control data
        if(a < 0 || b < 0) {
            throw new IllegalArgumentException("a and b must be positive");
        }
        return (int) Math.pow(a, b);
    }

    public int factorielle(int a) {
        // control data
        if(a < 0) {
            throw new IllegalArgumentException("a must be positive");
        }
        if (a == 0) {
            return 1;
        }
        return a * factorielle(a - 1);
    }

    public static int fibonacci(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Fibonacci of a negative number is not defined.");
        }
        if (n == 0) return 0;
        if (n == 1) return 1;
        return fibonacci(n - 1) + fibonacci(n - 2);
    }    

    public int pgcd(int a, int b) {
        if (a < 0 || b < 0) {
            throw new IllegalArgumentException("PGCD of a negative number is not defined.");
        }
        if (b == 0) {
            return a;
        }
        return pgcd(b, a % b);
    }

    public int ppcm(int a, int b) {
        return a * b / pgcd(a, b);
    }

    public int sommeDesImpairs(int a) {
        // control data and Exception
        if(a < 0) {
            throw new IllegalArgumentException("a must be positive");
        }
        int somme = 0;
        for (int i = 1; i <= a; i++) {
            if (i % 2 != 0) {
                somme += i;
            }
        }
        return somme;
    }

    public int sommeDesPairs(int a) {
        //  control data and Exception
        if(a < 0) {
            throw new IllegalArgumentException("a must be positive");
        }
        int somme = 0;
        for (int i = 1; i <= a; i++) {
            if (i % 2 == 0) {
                somme += i;
            }
        }
        return somme;
    }

}
