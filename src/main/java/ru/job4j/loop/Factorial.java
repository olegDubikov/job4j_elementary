package ru.job4j.loop;

public class Factorial {
    public static int calc(int n) {
        int times = 1;
        if (n == 0) {
            return times;
        }
        for (int i = 1; i <= n; i++) {
            times = times * i;
        }
        return times;
    }
}
