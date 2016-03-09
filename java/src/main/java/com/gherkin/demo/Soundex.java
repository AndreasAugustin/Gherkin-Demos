/*
 * Copyright (c) 2016.
 */

package com.gherkin.demo;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * Created by andy on 1/30/16.
 */

public class Soundex {

    private static final int MAX_CODE_LENGTH = 4;
    private static final Map<Character, String> encodingsMap = createMap();
    private static final String NOT_A_DIGIT = "*";

    private static Map<Character, String> createMap() {
        Map<Character, String> map = new HashMap<>();
        map.put('b', "1");
        map.put('f', "1");
        map.put('p', "1");
        map.put('v', "1");

        map.put('c', "2");
        map.put('g', "2");
        map.put('j', "2");
        map.put('k', "2");
        map.put('q', "2");
        map.put('s', "2");
        map.put('x', "2");
        map.put('z', "2");

        map.put('d', "3");
        map.put('t', "3");

        map.put('l', "4");

        map.put('m', "5");
        map.put('n', "5");

        map.put('r', "6");

        return map;
    }

    public String encode(final String word) {
        return zeroPad(upperFront(head(word))
                + tail(encodedDigits(word)));
    }

    public String encodedDigit(char letter) {
        final String ret = encodingsMap.get(lower(letter));
        return ret != null ? ret : NOT_A_DIGIT;
    }

    private Character lower(final Character character) {
        return Character.toLowerCase(character);
    }

    private String upperFront(final String string) {
        return string.substring(0, 1).toUpperCase();
    }

    private String head(final String word) {
        return word.substring(0, 1);
    }

    private String tail(final String word) {
        return word.substring(1);
    }

    private String encodedDigits(final String word) {
        if (word.length() == 0) {
            return NOT_A_DIGIT;
        }

        return encodeTail(encodeHead(word), word).toString();
    }

    private StringBuilder encodeHead(final String word) {

        return new StringBuilder(encodedDigit(word.charAt(0)));
    }

    private StringBuilder encodeTail(StringBuilder encoding, final String word) {
        int wordLength = word.length();
        for (int i = 1; i < wordLength; i++) {
            if (!isComplete(encoding)) {
                encodeLetter(encoding, word.charAt(i), word.charAt(i - 1));
            }
        }

        return encoding;
    }

    private void encodeLetter(StringBuilder encoding, final Character letter,
                              final Character lastLetter) {
        String digit = encodedDigit(letter);
        if (!Objects.equals(digit, NOT_A_DIGIT) &&
                (!Objects.equals(digit, lastDigit(encoding.toString()))) || isVowel(lastLetter)) {
            encoding.append(digit);
        }
    }

    private String lastDigit(final String encoding) {
        if (encoding.isEmpty()) {
            return NOT_A_DIGIT;
        }

        return encoding.substring(encoding.length() - 1);
    }

    private Boolean isComplete(final StringBuilder encoding) {
        return encoding.length() == MAX_CODE_LENGTH;
    }

    private String zeroPad(String word) {
        final int zerosNeeded = MAX_CODE_LENGTH - word.length();

        StringBuilder builder = new StringBuilder(word);

        for (int i = 0; i < zerosNeeded; i++) {
            builder.append("0");
        }

        return builder.toString();
    }

    private Boolean isVowel(final Character letter) {
        final String vowels = "aeiouy";
        return vowels.indexOf(lower(letter)) >= 0;
    }
}
