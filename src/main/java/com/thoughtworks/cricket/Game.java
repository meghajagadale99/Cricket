package com.thoughtworks.cricket;


public
class Game {
    private final int target;
    private final int numberOfOvers;
    private final Batsman batsman;
    private final Bowler bowler;
    private int score;

    public
    Game(int target, int numberOfOvers, Batsman batsman, Bowler bowler) {
        this.target = target;
        this.numberOfOvers = numberOfOvers;
        this.batsman = batsman;
        this.bowler = bowler;
    }

    public
    void play() {
        int STARTS = 1;
        int END = 6;
        for (int ball = STARTS; ball <= END; ball++) {
            batsman.bats();
            if (isBatsmanOut())
                break;

            score += batsman.bats();

            if (isWin())
                break;
        }
    }

    public
    boolean isBatsmanOut() {
        return score >= target;
    }


    public
    Result finalResult() {
        if (isWin())
            return Result.WIN;
        return Result.LOSE;
    }

    private
    boolean isWin() {
      return score > target;
    }
}


