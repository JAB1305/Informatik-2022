package de.jab_1305.info22.maths;

public class Meth {
    public static int dreieckszahl(int n) {
        if (n == 0) return 0;
        return n + dreieckszahl(n - 1);
    }


    public static int fakultaet(int n) {
        if (n == 0) return 1;
        return n * fakultaet(n - 1);
    }

    public static int potenz(int base, int exp) {
        if (exp == 0) return 1;
        return base * potenz(base, exp - 1);
    }
}
