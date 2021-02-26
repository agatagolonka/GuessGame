package com.github.agatagolonka.GuessGame;

import java.util.Scanner;

public class GetDigit {
    private int userDigit;




    GetDigit() {
        //this.userDigit = new Scanner(System.in).nextInt();
    }
   protected void setDigit(){
        this.userDigit = new Scanner(System.in).nextInt();
    }


    public Integer userDigit() {
        //this.userDigit = new Scanner(System.in).nextInt();
        return this.userDigit;
    }
}

