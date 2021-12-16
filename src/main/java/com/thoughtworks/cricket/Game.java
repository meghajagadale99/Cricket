package com.thoughtworks.cricket;


public
class Game {
    private final int target;
    private final Batsman batsman;
    private int score;

    public
    Game(int target, Batsman batsman) {
        this.target = target;
        this.batsman = batsman;
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


