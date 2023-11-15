package com.learning.springboot;

// This solves the OCP issue, as the GameRunner and Game class
// can be closed for modification and open for extension.
public interface Game {

    void up();

    void down();

    void left();

    void right();
}
