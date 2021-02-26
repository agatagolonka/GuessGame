package com.github.agatagolonka.GuessGame;

public class YouGuess extends Hints{


    public YouGuess() {
        this.KeepPlaying=false;
    }

    @Override
    protected String giveAnswer() {
        return "Brawo";
    }
}
