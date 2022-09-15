package ru.job4j.array;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SquareTest {

    @Test
    void whenBound3Then014() {
        int bound = 3;
        int[] out = Square.calculate(bound);
        int[] expected = new int[]{0, 1, 4};
        assertThat(out).containsExactly(expected);
    }

    @Test
    void whenBound4Then0149() {
        int bound = 4;
        int[] out = Square.calculate(bound);
        int[] expected = new int[]{0, 1, 4, 9};
        assertThat(out).containsExactly(expected);
    }

    @Test
    void whenBound5Then014916() {
        int bound = 5;
        int[] out = Square.calculate(bound);
        int[] expected = new int[]{0, 1, 4, 9, 16};
        assertThat(out).containsExactly(expected);
    }
}