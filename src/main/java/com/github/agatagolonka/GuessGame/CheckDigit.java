package com.github.agatagolonka.GuessGame;

import java.util.stream.IntStream;

public class CheckDigit {

    CheckDigit() {

    }
//sprawdza 2 liczby, tylko tyle
    public static String checkIsWin(int hideDigit, int tryDigit) {
        SaySomething result = new SaySomething();

        return switch (Integer.compare(hideDigit, tryDigit)) {
           //? case 1 -> result.toLow();
            case 1-> "Za mała liczba, podaj większą";
            case 0 -> "Brawo!";
            case -1 -> "Za duża liczba, podaj mniejszą";
            default -> throw new IllegalStateException("Unexpected value: " + Integer.compare(hideDigit, tryDigit));
        };

    }

}
