package ru.job4j.loop;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class CounterTest {

    @Test
    void whenSumEvenNumbersFromOneToTenThenThirty() {
        int start = 1;
        int finish = 10;
        int out = Counter.sumByEven(start, finish);
        int expected = 30;
        assertThat(out).isEqualTo(expected);
    }

    @Test
    void whenSumEvenNumbersFromThreeToSevenThenTen() {
        int start = 3;
        int finish = 7;
        int out = Counter.sumByEven(start, finish);
        int expected = 10;
        assertThat(out).isEqualTo(expected);
    }
}