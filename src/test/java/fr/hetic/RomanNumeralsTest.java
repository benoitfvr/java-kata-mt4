package fr.hetic;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

public class RomanNumeralsTest {

    @Test
    public void testToRoman_singleDigits() {
        assertThat(RomanNumerals.toRoman(1)).isEqualTo("I");
        assertThat(RomanNumerals.toRoman(2)).isEqualTo("II");
        assertThat(RomanNumerals.toRoman(5)).isEqualTo("V");
        assertThat(RomanNumerals.toRoman(7)).isEqualTo("VII");
        assertThat(RomanNumerals.toRoman(9)).isEqualTo("IX");
    }

    @Test
    public void testToRoman_doubleDigits() {
        assertThat(RomanNumerals.toRoman(10)).isEqualTo("X");
        assertThat(RomanNumerals.toRoman(40)).isEqualTo("XL");
        assertThat(RomanNumerals.toRoman(50)).isEqualTo("L");
        assertThat(RomanNumerals.toRoman(80)).isEqualTo("LXXX");
        assertThat(RomanNumerals.toRoman(90)).isEqualTo("XC");
    }

    @Test
    public void testToRoman_tripleDigits() {
        assertThat(RomanNumerals.toRoman(100)).isEqualTo("C");
        assertThat(RomanNumerals.toRoman(400)).isEqualTo("CD");
        assertThat(RomanNumerals.toRoman(500)).isEqualTo("D");
        assertThat(RomanNumerals.toRoman(800)).isEqualTo("DCCC");
        assertThat(RomanNumerals.toRoman(900)).isEqualTo("CM");
    }

    @Test
    public void testToRoman_quadrupleDigits() {
        assertThat(RomanNumerals.toRoman(1000)).isEqualTo("M");
        assertThat(RomanNumerals.toRoman(3000)).isEqualTo("MMM");
    }

    @Test
    public void testToRoman_variousNumbers() {
        assertThat(RomanNumerals.toRoman(1987)).isEqualTo("MCMLXXXVII");
        assertThat(RomanNumerals.toRoman(2024)).isEqualTo("MMXXIV");
    }

    @Test
    public void testToRoman_invalidNumbers() {
        assertThatThrownBy(() -> RomanNumerals.toRoman(0))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("Le nombre doit être compris entre 1 et 3000");

        assertThatThrownBy(() -> RomanNumerals.toRoman(-1))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("Le nombre doit être compris entre 1 et 3000");

        assertThatThrownBy(() -> RomanNumerals.toRoman(3001))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("Le nombre doit être compris entre 1 et 3000");
    }
}
