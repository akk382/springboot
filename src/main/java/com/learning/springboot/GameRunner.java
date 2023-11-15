package com.learning.springboot;

public class GameRunner {
    
    MarioGame game;
    public GameRunner(MarioGame marioGame) {
        this.game = marioGame;
    }

    public void run() {
        System.out.println("Game running: " + game);
        game.up();
        game.down();
        game.left();
        game.right();
    }
}
