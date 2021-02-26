package com.github.agatagolonka.GuessGame;


public class Main {

    public static void main(String[] args) {

        System.out.println(Messages.START.giveMsg());
        GetDigit num1=new GetDigit();
        GetDigit num2=new GetDigit();
        DrawRange ran=new DrawRange();
        ran.SetRange(num1,num2);
        GenerateDigit hideDigit=ran.generate();
        System.out.println(Messages.LOS.giveMsg());
        Hints hint;
        Hints toLow=new ToLow();
        Hints toHigh=new ToHigh();

        do{
            System.out.println(Messages.ASK.giveMsg());
            num2.setDigit();
            switch (hideDigit.compareTo(num2.userDigit())) {
                case -1:
                    hint=toLow;
                    break;
                case 0:
                    hint=new YouGuess();
                    break;
                case 1:
                    hint=toHigh;
                    break;
                default:
                    throw new IllegalStateException("Unexpected value: " + hideDigit.compareTo(num2.userDigit()));
            }
            System.out.println(hint.giveAnswer());
        }while(hint.KeepPlaying);


    }
}
