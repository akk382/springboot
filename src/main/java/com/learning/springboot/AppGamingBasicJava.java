package com.learning.springboot;

public class AppGamingBasicJava {

    public static void main(String[] args) {
        var marioGame = new MarioGame();
        var gameRunner = new GameRunner(marioGame);
        gameRunner.run();
    }
}
