package org.rastakiki.kata.romannumeral;

public class RomanConverter {

    public String toRoman(int decimal) {
        String result = "";

        int remaining = decimal;


        for (RomanCharacter romanCharacter : RomanCharacter.values()) {
            while (remaining >= romanCharacter.decimal) {
                result += romanCharacter.name();
                remaining -= romanCharacter.decimal;
            }
        }

        return result;
    }

    private enum RomanCharacter {

        M(1000),
        D(500),
        C(100),
        L(50),
        X(10),
        V(5),
        IV(4),
        I(1);

        private final int decimal;

        private RomanCharacter(int decimal) {
            this.decimal = decimal;
        }
    }
}
