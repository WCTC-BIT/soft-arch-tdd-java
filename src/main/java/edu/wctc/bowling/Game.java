package edu.wctc.bowling;

public class Game {
    private int score = 0;

    public void roll(int pins) {
        score += pins;
    }

    public int score() {
//        return 0;
        return score;
    }
}
