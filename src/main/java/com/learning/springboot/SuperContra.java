package com.learning.springboot;

public class SuperContra implements Game {
    public void up() {
        System.out.println("Jump");
    }

    public void down() {
        System.out.println("Lie low");
    }

    public void left() {
        System.out.println("Shoot");
    }

    public void right() {
        System.out.println("Move forward");
    }
}
