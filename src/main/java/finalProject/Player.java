package finalProject;

public class Player {
    private final String name;
    private final BattleField battleField;

    public Player(String name) {
        this.name = name;
        this.battleField = new BattleField();
    }

    public String getName() {
        return name;
    }

    public BattleField getBattleField() {
        return battleField;
    }
}
