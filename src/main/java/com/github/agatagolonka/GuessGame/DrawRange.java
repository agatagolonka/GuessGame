package com.github.agatagolonka.GuessGame;

import java.util.Scanner;

public class DrawRange{

    private int start;
    private int end;


    //czy powinnam tu wołać AskUser i say something? czy to wydzielić? czy ona powinna zwracać? Czy raczej powinna przyjmować inta?
    public int findStartRange(int startDigit){
        //AskUser startDigit=new AskUser();
       /* SaySomething askAboutStart = new SaySomething();
        askAboutStart.askForStartRange();*/

        this.start=startDigit;
        return this.start;
    }

    public int findEndRange(int endDigit){
        //AskUser endDigit=new AskUser();
        /*SaySomething askAboutEnd = new SaySomething();
        askAboutEnd.askForEndRange();*/

        this.start=endDigit;
        return this.end;
    }

}
