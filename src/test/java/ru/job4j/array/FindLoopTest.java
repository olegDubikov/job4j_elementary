package ru.job4j.array;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class FindLoopTest {

    @Test
    void whenArrayHas5Then0() {
        int[] data = new int[]{5, 10, 3};
        int el = 5;
        int out = FindLoop.indexOf(data, el);
        int expected = 0;
        assertThat(out).isEqualTo(expected);
    }

    @Test
    void whenArrayHasNot10ThenMinus1() {
        int[] data = new int[]{6, 1, 14, 8};
        int el = 10;
        int out = FindLoop.indexOf(data, el);
        int expected = -1;
        assertThat(out).isEqualTo(expected);
    }
}