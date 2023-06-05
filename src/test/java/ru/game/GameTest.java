package ru.game;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class GameTest {
    @Test
    public void testFirstGamerWinner() {
        Game game = new Game();
        Player james = new Player(1, "James", 20);
        Player piter = new Player(2, "Piter", 10);

        game.register(james);
        game.register(piter);

        int actual = game.round("James", "Piter");
        int expected = 1;

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void testSecondGamerWinner() {
        Game game = new Game();
        Player james = new Player(1, "James", 10);
        Player piter = new Player(2, "Piter", 20);

        game.register(james);
        game.register(piter);

        int actual = game.round("James", "Piter");
        int expected = 2;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testSecondNoWinner() {
        Game game = new Game();
        Player james = new Player(1, "James", 20);
        Player piter = new Player(2, "Piter", 20);

        game.register(james);
        game.register(piter);

        int actual = game.round("James", "Piter");
        int expected = 0;

        Assertions.assertEquals(expected, actual);
    }
}



