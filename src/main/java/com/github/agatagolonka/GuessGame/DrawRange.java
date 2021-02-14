package com.github.agatagolonka.GuessGame;

import java.util.Scanner;

public class DrawRange {

    private int start;
    private int end;

    DrawRange() {
        this.start = new Scanner(System.in).nextInt();//ob6
        this.end = new Scanner(System.in).nextInt();//ob7
    }

    public String giveMeARange() {
        return String.format("%d , %d%n", start, end);

    }


}
