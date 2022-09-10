package ru.job4j.condition;

public class Triangle {
    public static boolean exist(double ab, double ac, double bc) {
        return (ab + bc > ac) && (bc + ac > ab) && (ac + ab > bc);
    }

    public static void main(String[] args) {
        boolean out = exist(2.0, 2.0, 5.3);
        System.out.println(out);
    }
}
