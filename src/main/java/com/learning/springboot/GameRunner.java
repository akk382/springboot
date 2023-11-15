package com.learning.springboot;

public class GameRunner {

    // Now this is loosely coupled, as we can insert any new game of type Game.
    Game game;

    public GameRunner(Game game) {
        this.game = game;
    }

    public void run() {
        System.out.println("Game running: " + game);
        game.up();
        game.down();
        game.left();
        game.right();
    }
}
