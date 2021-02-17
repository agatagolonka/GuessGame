package com.github.agatagolonka.GuessGame;

import java.util.Scanner;

public class GetDigit {
    private int digitFromUser;


    GetDigit() {

    }

    protected void newDigit() {

        this.digitFromUser = new Scanner(System.in).nextInt();
    }

    /*protected int giveMeYouValue() {
        return this.digitFromUser;
    }*/
}
