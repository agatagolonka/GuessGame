package com.github.agatagolonka.GuessGame;


public class Main {

    public static void main(String[] args) {

        final SaySomething SayMeStart = new SaySomething();
        final SaySomething SayMeEnd = new SaySomething();
        final DrawRange range = new DrawRange();
        final AskUser startRange = new AskUser();
        final AskUser endRange = new AskUser();
        final GenerateDigit hideDigit = new GenerateDigit();
        final SaySomething ask = new SaySomething();
        CheckDigit compareDigit = new CheckDigit();
        AskUser userDigit = new AskUser();

        //czy obiekty tworzyć u góry czy jak jest potrzeba?

        SayMeStart.askForStartRange();
        int start=range.findStartRange(startRange.AskUserAboutDigit());

        SayMeEnd.askForEndRange();
        int end = range.findStartRange(endRange.AskUserAboutDigit());
        hideDigit.setHideDigit(start,end);
        int digitFromUser;
        
        ask.askAboutDigit();
        do{
            digitFromUser = userDigit.AskUserAboutDigit();
            System.out.println(compareDigit.checkIsWin(hideDigit.giveMeYouValue(), digitFromUser));
            //System.out.println("sdfg");
        }while(compareDigit.checkIsWin(hideDigit.giveMeYouValue(), digitFromUser)!="Brawo!");



    }
}
