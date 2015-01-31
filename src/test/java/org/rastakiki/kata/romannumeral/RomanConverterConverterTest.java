package org.rastakiki.kata.romannumeral;


import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class RomanConverterConverterTest {

    @Test
    public void should_convert_decimal_to_numeral() {
        RomanConverter romanConverter = new RomanConverter();

        assertThat(romanConverter.toRoman(1)).isEqualTo("I");
        assertThat(romanConverter.toRoman(2)).isEqualTo("II");
        assertThat(romanConverter.toRoman(3)).isEqualTo("III");
        assertThat(romanConverter.toRoman(5)).isEqualTo("V");
        assertThat(romanConverter.toRoman(6)).isEqualTo("VI");
        assertThat(romanConverter.toRoman(7)).isEqualTo("VII");
        assertThat(romanConverter.toRoman(10)).isEqualTo("X");
        assertThat(romanConverter.toRoman(11)).isEqualTo("XI");
        assertThat(romanConverter.toRoman(20)).isEqualTo("XX");
        assertThat(romanConverter.toRoman(50)).isEqualTo("L");
        assertThat(romanConverter.toRoman(100)).isEqualTo("C");
        assertThat(romanConverter.toRoman(500)).isEqualTo("D");
        assertThat(romanConverter.toRoman(1000)).isEqualTo("M");
        assertThat(romanConverter.toRoman(4)).isEqualTo("IV");
    }

    @Test
    public void should_convert_decimal_to_numeral2() {
        RomanConverter romanConverter = new RomanConverter();

        assertThat(romanConverter.toRoman(6)).isEqualTo("VI");
    }

}
