package com.learning.springboot;

public class GameRunner {

    // GameRunner is tightly coupled to MarioGame class.
    // What if we have a new game in future? Do we add another class here?
    // This violates the open-closed principle(SOLID principles),
    // as everytime we have a new game, we need to modify this class adding a new game.
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
