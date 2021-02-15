package finalProject;

public class GameRunner {
    public static void main(String[] args) throws Exception {
        Player player1 = new Player("Player 1");
        Player player2 = new Player("Player 2");

        IOManager ioManager = new IOManager();
        ioManager.fillBattleFieldWithShips(player1);
        ioManager.fillBattleFieldWithShips(player2);
//        ioManager.startGame();
//
//        BattleField battleField = new BattleField();
//
//        battleField.addShip("8,5;8,6;8,7;8,8");
//        battleField.addShip("8,5;8,6;8,7;8,8");
//        battleField.addShip("1,1;2,1;3,1");
//        battleField.addShip("0,7");
//        battleField.addShip("2,7");
//        battleField.addShip("0,7");
//
//        battleField.print();
    }
}
