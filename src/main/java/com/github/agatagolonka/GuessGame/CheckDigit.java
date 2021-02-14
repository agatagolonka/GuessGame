package com.github.agatagolonka.GuessGame;

import java.util.stream.IntStream;

public class CheckDigit {

    public CheckDigit() {

    }

    public static String checkIsWin(GenerateDigit hide, GetDigit tryDigit) {

        return switch (Integer.compare(hide.giveMeYouValue(), tryDigit.giveMeYouValue())) {
            case 1 -> "Za mała liczba, podaj większą";
            case 0 -> "Brawo!";
            case -1 -> "Za duża liczba, podaj mniejszą";
            default -> throw new IllegalStateException("Unexpected value: " + Integer.compare(hide.giveMeYouValue(), tryDigit.giveMeYouValue()));
        };

    }

}
