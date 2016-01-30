package com.gherkin.demo;

/**
 * Created by andy on 1/30/16.
 */

public class Soundex {

    private static final String EMPTY_STRING = "";
    private static final int MAX_CODE_LENGTH = 4;

    public String encode(final String word) {

        return zeroPad(head(word) + encodedDigits(word));
    }

    private String head(final String word) {
        return word.substring(0, 1);
    }

    private String encodedDigits(final String word) {
        if (word.length() > 1) {
            return encodedDigit();
        }

        return EMPTY_STRING;
    }

    private String encodedDigit() {
        return "1";
    }

    private String zeroPad(String word) {
        final int zerosNeeded = MAX_CODE_LENGTH - word.length();

        StringBuilder builder = new StringBuilder(word);

        for (int i = 0; i < zerosNeeded; i++) {
            builder.append("0");
        }

        return builder.toString();
    }
}
