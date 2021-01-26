package day7;

public class Player {
    private final static int MAX_PLAYERS = 6;
    private final static int MIN_STAMINA = 0;
    private final static int MAX_STAMINA = 100;
    private static int countPlayers = 0;

    private int stamina;

    public Player(int stamina) {
        this.stamina = stamina;
        if (countPlayers < MAX_PLAYERS) countPlayers++;
    }

    public static int getCountPlayers() {
        return countPlayers;
    }

    public static void info() {
        String message;
        if (countPlayers < MAX_PLAYERS) {
            int countPlacesLeft = MAX_PLAYERS - countPlayers;
            message = String.format("Команды неполные. На поле еще есть %d свободных мест", countPlacesLeft);
        } else {
            message = "На поле нет свободных мест";
        }
        System.out.println(message);
    }

    public int getStamina() {
        return stamina;
    }

    public void run() {
        if (this.stamina == MIN_STAMINA) {
            return;
        } else if (this.stamina == MIN_STAMINA + 1) {
            countPlayers--;
        }
        this.stamina--;
    }
}
