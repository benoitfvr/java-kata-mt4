package fr.hetic;

public class RomanNumerals {

    private static final int[] VALUES = { 1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1 };
    private static final String[] SYMBOLS = { "M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I" };

    private RomanNumerals() {
    }

    public static String toRoman(int number) {
        validateNumber(number);

        StringBuilder roman = new StringBuilder();
        int remainingNumber = number;

        for (int i = 0; i < VALUES.length; i++) {
            remainingNumber = appendRomanSymbols(remainingNumber, VALUES[i], SYMBOLS[i], roman);
        }

        return roman.toString();
    }

    private static void validateNumber(int number) {
        if (number <= 0 || number > 3000) {
            throw new IllegalArgumentException("Le nombre doit être compris entre 1 et 3000");
        }
    }

    private static int appendRomanSymbols(int number, int value, String symbol, StringBuilder roman) {
        while (number >= value) {
            number -= value;
            roman.append(symbol);
        }
        return number;
    }
}
