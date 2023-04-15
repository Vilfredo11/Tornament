package Game;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class GameTest {

    @Test
    public void testWhenFirsPlayerWin() {
        Game game = new Game();
        Player viktor = new Player(1, "Виктор", 40);
        Player rustam = new Player(2, "Рустам", 25);

        game.register(viktor);
        game.register(rustam);
        int actual = game.round("Виктор", "Рустам");
        int expected = 1;

        Assertions.assertEquals(expected, actual);

    }

    @Test

    public void TestWhenSecondPlayerWin9() {
        Game game = new Game();
        Player viktor = new Player(1, "Виктор", 40);
        Player rustam = new Player(2, "Рустам", 67);

        game.register(viktor);
        game.register(rustam);
        int actual = game.round("Виктор", "Рустам");
        int expected = 2;

        Assertions.assertEquals(expected, actual);

    }

    @Test

    public void testWhenTie() {

        Game game = new Game();
        Player viktor = new Player(1, "Виктор", 67);
        Player rustam = new Player(2, "Рустам", 67);

        game.register(viktor);
        game.register(rustam);
        int actual = game.round("Виктор", "Рустам");
        int expected = 0;

        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void testWhenFirstPlayerNotExist() {
        Game game = new Game();
        Player viktor = new Player(1, "Виктор", 67);
        Player rustam = new Player(2, "Рустам", 67);

        game.register(viktor);
        game.register(rustam);

        Assertions.assertThrows(NotExistsException.class,
                () -> game.round("Александр", "Рустам"));

    }

    @Test
    public void testWhenSecondPlayerNotExist() {
        Game game = new Game();
        Player viktor = new Player(1, "Виктор", 67);
        Player rustam = new Player(2, "Рустам", 67);

        game.register(viktor);
        game.register(rustam);

        Assertions.assertThrows(NotExistsException.class,
                () -> game.round("Виктор", "Максим"));
    }

    @Test
    public void testWhenBothPlayersNotExist() {
        Game game = new Game();
        Player viktor = new Player(1, "Виктор", 67);
        Player rustam = new Player(2, "Рустам", 67);

        game.register(viktor);
        game.register(rustam);

        Assertions.assertThrows(NotExistsException.class,
                () -> game.round("Буда", "Пешт"));
    }
}
