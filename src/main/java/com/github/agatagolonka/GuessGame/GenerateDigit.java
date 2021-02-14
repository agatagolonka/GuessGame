package com.github.agatagolonka.GuessGame;

import java.util.Random;
import java.util.StringTokenizer;

public class GenerateDigit {
    private int hideDigit;

    GenerateDigit(DrawRange range) {
        StringTokenizer st = new StringTokenizer(range.giveMeARange());//8
        Random rand = new Random();//9

        int start = Integer.parseInt(st.nextToken(), 10);
        st.nextToken();
        int end = Integer.parseInt(st.nextToken(), 10);


        this.hideDigit = rand.nextInt(end) + start;
    }

    protected int giveMeYouValue() {
        return this.hideDigit;
    }
}
