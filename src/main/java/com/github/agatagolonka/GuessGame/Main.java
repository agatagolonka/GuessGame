package com.github.agatagolonka.GuessGame;


public class Main {

    public static void main(String[] args) {
        final SaySomething SayMe = new SaySomething();//1
        SayMe.askForRange();
        final DrawRange range = new DrawRange();//2
        final GenerateDigit hideDigit = new GenerateDigit(range);//3
        SayMe.isDrawn();
        GetDigit userDigit = new GetDigit();//4
        CheckDigit isWin = new CheckDigit();//5
        SayMe.askAboutDigit();
        while (isWin.checkIsWin(hideDigit, userDigit) != "Brawo!") {

            userDigit.newDigit();
            System.out.println(isWin.checkIsWin(hideDigit, userDigit));
        }


    }
}
