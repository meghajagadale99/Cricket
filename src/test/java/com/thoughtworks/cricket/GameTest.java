package com.thoughtworks.cricket;

import org.junit.jupiter.api.Test;

import static com.thoughtworks.cricket.Result.LOSE;
import static com.thoughtworks.cricket.Result.WIN;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public
class GameTest {


    @Test
    void shouldWonGameWhenTargetTwelveForBatsmanIsReaches() {
        Batsman batsman = new Batsman();
        Bowler bowler = new Bowler();
        Game game = new Game(12, 2,batsman, bowler);

        game.play();

        Result result = game.finalResult();
        assertThat(result, is(WIN));
    }

    @Test
    void shouldLossGameWhenTargetTwelveForBatsmanIsNotReaches() {
        Batsman batsman = new Batsman();
        Bowler bowler = new Bowler();
        Game game = new Game(12, 2,batsman, bowler);

        game.play();

        Result result = game.finalResult();
        assertThat(result, is(LOSE));
    }

    @Test
    void shouldWinGameWhenTargetTwelveForBatsmanInOverReaches() {
        Batsman batsman = new Batsman();
        Bowler bowler = new Bowler();
        Game game = new Game(20,2, batsman, bowler);

        game.play();

        Result result = game.finalResult();
        assertThat(result, is(WIN));
    }

}
