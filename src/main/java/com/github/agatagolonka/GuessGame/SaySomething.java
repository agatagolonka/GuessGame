package com.github.agatagolonka.GuessGame;

public class SaySomething {
    private String message;
//klasa odpowiedzialna za wyświetlanie komunikatu, czy powinnam np. stworzyć nadrzędną klasę Say something,
// która w argumencie będzie przyjmowała co ma powiedzieć?

    SaySomething() {
    }

    protected void askForStartRange() {
        System.out.println("Podaj zakres z jakiego chcesz żebym wylosował liczbę? Podaj początek zakresu");
    }

    protected void askForEndRange() {
        System.out.println("Podaj zakres z jakiego chcesz żebym wylosował liczbę? Podaj koniec zakresu");
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
