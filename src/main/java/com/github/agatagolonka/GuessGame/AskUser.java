package com.github.agatagolonka.GuessGame;

import java.util.Scanner;

public class AskUser {
    private int userDigit;

    public int AskUserAboutDigit() {
        this.userDigit = new Scanner(System.in).nextInt();
        return this.userDigit;//powinna tu zwracać?
}
}
