package com.github.agatagolonka.GuessGame;

import java.util.Random;
import java.util.Scanner;

public class DrawRange{

    private int start;
    private int end;

    public void SetRange(GetDigit Digit1, GetDigit Digit2){
        Digit1.setDigit();
        Digit2.setDigit();
        this.start=Math.min(Digit1.userDigit(),Digit2.userDigit());
        System.out.println(start);
        this.end=Math.max(Digit1.userDigit(),Digit2.userDigit());
        System.out.println(end);
    }
    public GenerateDigit generate(){
        final int hideDigit = new Random().nextInt(end-start+1) + start;
        return new GenerateDigit(hideDigit);
    }


}
