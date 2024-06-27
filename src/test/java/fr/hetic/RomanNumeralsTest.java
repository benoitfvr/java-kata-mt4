package fr.hetic;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

public class RomanNumeralsTest {

    @Test
    public void testToRoman_singleDigits() {
        assertThat(RomanNumerals.toRoman(1)).isEqualTo("I");
    }
}