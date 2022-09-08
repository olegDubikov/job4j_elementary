package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class SqAreaTest {

    @Test
    public void whenSquareP6K2Then2() {
        double p = 6;
        double k = 2;
        double expected = 2.00;
        double out = SqArea.square(p, k);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenSquareP3K3Then0dot42() {
        double p = 3;
        double k = 3;
        double expected = 0.42;
        double out = SqArea.square(p, k);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenSquareP10K3Then4dot27() {
        double p = 10.1;
        double k = 3.7;
        double expected = 4.27;
        double out = SqArea.square(p, k);
        Assert.assertEquals(expected, out, 0.01);
    }
}