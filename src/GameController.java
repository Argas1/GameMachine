import java.util.Scanner;

public class GameController {
    public static void main(String[] args) {
        buyGame();
    }

    private static void buyGame() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj nazwę gry");
        String gameTitle= scanner.nextLine();
        System.out.println("Wpłać pieniądze");
        double money = scanner.nextDouble();

        GameMachine gameMachine = new GameMachine();
        try{
            Game game = gameMachine.buy(gameTitle,money);

            System.out.println("Odbierz grę :" + gameTitle);
            System.out.println("Odbierz resztę" + (money - game.getPrice()));
        }
        catch (NotEnoughMoneyException | GameNotFoundException e){
            System.err.println(e.getMessage());
        }
    }
}
