package ru.job4j.loop;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class FactorialTest {

    @Test
    void whenCalculateFactorialForFiveThenOneHundredTwenty() {
        int in = 5;
        int out = Factorial.calc(in);
        int expected = 120;
        assertThat(out).isEqualTo(expected);
    }

    @Test
    void whenCalculateFactorialForZeroThenOne() {
        int in = 0;
        int out = Factorial.calc(in);
        int expected = 1;
        assertThat(out).isEqualTo(expected);
    }
}