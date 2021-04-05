package edu.wctc.bowling.test;

import edu.wctc.bowling.Game;
import org.junit.jupiter.api.Test;

public class GameTest {
    @Test
    void canCreateGame() {
        Game g = new Game();
    }

    @Test
    void canRoll()
    {
        Game g = new Game();
        g.roll(0);
    }

}
