package edu.wctc.bowling.test;

import edu.wctc.bowling.Game;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GameTest {
    private Game g;

    @BeforeEach
    void setUp() {
        g = new Game();
    }

    @Test
    void canCreateGame() {
//        Game g = new Game();
    }

    @Test
    void canRoll()
    {
//        Game g = new Game();
        g.roll(0);
    }

    @Test
    void gutterGame() {
        for (int i = 0; i < 20; i++) {
            g.roll(0);
        }

        assertEquals(0, g.score());
    }

}
