package Game;

public class NotExistsException extends RuntimeException {
    public NotExistsException(String playerName) {
        super("Игрок c именем " + playerName + "не найден");
    }
}
