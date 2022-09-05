package ru.job4j.converter;

public class Converter {
    public static float rubleToEuro(float value) {
        float rsl = value / 70;
        return rsl;
    }

    public static float rubleToDollar(float value) {
        float rsl = value / 60;
        return rsl;
    }

    public static void main(String[] args) {
        float euro = Converter.rubleToEuro(140);
        float dollar = Converter.rubleToDollar(140);
        System.out.println("140 rubles are " + euro + " euro.");
        System.out.println("140 rubles are " + dollar + " dollars.");

        float inEuro = 140;
        float inDollar = 150;
        float expectedEuro = (float) 2;
        float expectedDollar = (float) 2.5;
        float outEuro = Converter.rubleToEuro(inEuro);
        float outDollar = Converter.rubleToDollar(inDollar);
        boolean passedEuro = expectedEuro == outEuro;
        boolean passedDollar = expectedDollar == outDollar;
        System.out.println("140 rubles are 2 euro. Test result: " + passedEuro);
        System.out.println("150 rubles are 2,5 dollars. Test result: " + passedDollar);
    }
}
