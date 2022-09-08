package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class PointTest {

    @Test
    public void when52To34Then2dot82() {
        int x1 = 5;
        int y1 = 2;
        int x2 = 3;
        int y2 = 4;
        double expected = 2.82;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when34To52Then10() {
        int x1 = 3;
        int y1 = -4;
        int x2 = -5;
        int y2 = 2;
        double expected = 10.00;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when11To07Then6dot08() {
        int x1 = 1;
        int y1 = 1;
        int x2 = 0;
        int y2 = 7;
        double expected = 6.08;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }
}