package com.learning.springboot;

public class AppGamingBasicJava {

    public static void main(String[] args) {
        var marioGame = new MarioGame();
        var marioRunner = new GameRunner(marioGame);
        marioRunner.run();

        // we are using the same GameRunner class to inject contraGame. Since GameRunner is loosely coupled
        var contraGame = new SuperContra();
        var contraRunner = new GameRunner(contraGame);
        contraRunner.run();
    }
}
