public class GameNotFoundException extends RuntimeException {
    public GameNotFoundException(String gameTitle){
        super ("Game is not found: " + gameTitle);
    }
}
