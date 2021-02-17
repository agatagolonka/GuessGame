package com.github.agatagolonka.GuessGame;

import java.util.Random;
import java.util.StringTokenizer;

public class GenerateDigit {
    private int hideDigit;

    GenerateDigit() {
    }

    //co tu przekazywać, DrawRange?, int start, end? w tej formie losuje liczbę z podanego zakresu
    public void setHideDigit(int start, int end) {
        //DrawRange setRange=new DrawRange();
        Random rand = new Random();
        this.hideDigit = rand.nextInt(end-start+1) + start;

        /*StringTokenizer st = new StringTokenizer(range.giveMeARange());//8
        Random rand = new Random();//9

        int start = Integer.parseInt(st.nextToken(), 10);
        st.nextToken();
        int end = Integer.parseInt(st.nextToken(), 10);


        this.hideDigit = rand.nextInt(end) + start;*/
    }


    protected int giveMeYouValue() {
        return this.hideDigit;
    }
}
