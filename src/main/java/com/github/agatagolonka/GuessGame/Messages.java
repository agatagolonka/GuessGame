package com.github.agatagolonka.GuessGame;

enum Messages {
        START("Podaj zakres z jakiego chcesz żebym wylosował liczbę?"),
        LOS("Wylosowałem już"),
        ASK("Proszę spróbuj zgadnąć, Jak myślisz jaką liczbę wylosowałem?");



        String msg;

    Messages(String s) {
        msg=s;
    }

    String giveMsg(){
            return msg;
        }
}
