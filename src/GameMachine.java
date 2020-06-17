
import java.util.Map;

public class GameMachine {
    private Map<String,Game> games= Map.of
            ("Counter-Strike GO", new Game("Counter-Strike GO", 50),
            "League of Legends", new Game("League of Legends", 80),
            "Sims 2", new Game("Sims 2", 100),
            "Tibia", new Game("Tibia", 200),
            "Fifa 20", new Game("Fifa 20", 269)
    );



    public Game buy (String gameTitle, double money){
        if(!games.containsKey(gameTitle))
            throw new GameNotFoundException(gameTitle);
        Game game = games.get(gameTitle);
        if(money<game.getPrice())
            throw new NotEnoughMoneyException(game.getPrice(),money);
        return game;

    }
}
