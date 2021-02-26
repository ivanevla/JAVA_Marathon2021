package finalProject;

public class GameRunner {
    public static void main(String[] args) throws Exception {
        Player player1 = new Player("Player 1");
//        player1.getBattleField().addShip("8,5;8,6;8,7;8,8");
//        player1.getBattleField().addShip("0,6;1,6;2,6");
//        player1.getBattleField().addShip("4,4;5,4;6,4");
//        player1.getBattleField().addShip("1,9;2,9");
//        player1.getBattleField().addShip("5,7;5,8");
//        player1.getBattleField().addShip("6,0;6,1");
//        player1.getBattleField().addShip("0,0");
//        player1.getBattleField().addShip("0,2");
//        player1.getBattleField().addShip("4,0");
//        player1.getBattleField().addShip("9,2");
//        player1.getBattleField().print();
//        System.out.println();

        Player player2 = new Player("Player 2");
//        player2.getBattleField().addShip("2,2;2,3;2,4;2,5");
//        player2.getBattleField().addShip("0,0;0,1;0,2");
//        player2.getBattleField().addShip("5,8;6,8;7,8");
//        player2.getBattleField().addShip("0,7;0,8");
//        player2.getBattleField().addShip("1,5;1,6");
//        player2.getBattleField().addShip("9,1;9,2");
//        player2.getBattleField().addShip("3,0");
//        player2.getBattleField().addShip("4,4");
//        player2.getBattleField().addShip("7,5");
//        player2.getBattleField().addShip("9,7");
//        player2.getBattleField().print();

        IOManager ioManager = new IOManager();
        ioManager.fillBattleFieldWithShips(player1);
        ioManager.fillBattleFieldWithShips(player2);
        ioManager.startGame(player1, player2);
    }
}
