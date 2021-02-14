package com.github.agatagolonka.GuessGame;

public class SaySomething {
    private String message;

    SaySomething() {
    }

    protected void askForRange() {
        System.out.println("Podaj zakres z jakiego chcesz żebym wylosował liczbę?");
    }

    protected void isDrawn() {
        System.out.println("Wylosowałem już");
    }

    protected void askAboutDigit() {
        System.out.println("Proszę spróbuj zgadnąć, Jak myślisz jaką liczbę wylosowałem?");
    }

    protected void toHigh() {
        System.out.println("Podałeś zbyt dużą liczbę, podaj mniejszą");
    }

    protected void toLow() {
        System.out.println("Podałęś zbyt małą liczbę, Podaj większą");
    }

    protected void youWin() {
        System.out.println("Zgadłeś, Brawo!");
    }


}
