package com.github.agatagolonka.GuessGame;

import java.util.Random;
import java.util.StringTokenizer;

public class GenerateDigit implements Comparable<Integer>{
    private int number;


    public GenerateDigit(int number) {
        this.number = number;
    }

    @Override
    public int compareTo(Integer o) {
        return Integer.compare(o.intValue(), this.number);
    }
}
