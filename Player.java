package com.company;

public class Player {

    private int lives;

    public int getLives() {
        return lives;
    }

    public void setLives(int lives) {
        this.lives = lives;
    }

    public Player () {
        this.lives = 6;
    }
    public boolean stillAlive() {
        return lives > 0;
    }
}
