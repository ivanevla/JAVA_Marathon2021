package finalProject;

import java.util.Map;
import java.util.Random;
import java.util.Scanner;
import java.util.stream.IntStream;

public class IOManager {
    private final Scanner scanner = new Scanner(System.in);

    public void fillBattleFieldWithShips(Player player) {
        int startAskFrom = 4; // start from length 4, after 3, after 2, after 1
        BattleField battleField = player.getBattleField();
        Map<ShipType, Integer> usedShipsCount = battleField.getUsedShipsCount();

        System.out.printf("Начнем расставлать корабли на поле %s. Другой игрок не смотри!%n", player.getName());

        do {
            ShipType shipType = ShipType.findShipTypeByLength(startAskFrom);
            Integer usedShipCount = usedShipsCount.get(shipType);
            int maxShipCount = shipType.getMaxAvailableCount();

            if (usedShipCount >= maxShipCount) {
                startAskFrom--;
                continue;
            }

            String countString = "";
            switch (++usedShipCount) {
                case 1:
                    if (shipType == ShipType.BATTLESHIP) break;
                    countString = "первого ";
                    break;
                case 2:
                    countString = "второго ";
                    break;
                case 3:
                    countString = "третьего ";
                    break;
                case 4:
                    countString = "четвертого ";
                    break;
            }
            System.out.printf("Введите координаты %s%s корабля%n", countString, shipType.getTypeName());
            String userInput = scanner.nextLine();

            // VALIDATION
            try {
                CoordinatesValidator.validate(userInput, shipType, battleField);
            } catch (Exception e) {
                System.out.println(e.getMessage());
                continue;
            }

            battleField.addShip(userInput);
            battleField.print();
        } while (startAskFrom != 0);
        print20EmptyLines();
    }

    public void startGame(Player player1, Player player2) {
        Random random = new Random();
        int whoStartsGame = random.nextInt(2);

        Player[] players;
        if (whoStartsGame == 0) {
            players = new Player[]{player1, player2};
        } else {
            players = new Player[]{player2, player1};
        }
        System.out.printf("Игрок %s начинает%n", players[0].getName());


        while (!players[0].getBattleField().isWinner() && !players[1].getBattleField().isWinner()) {
            System.out.printf("Игрок %s введите координаты: %n", players[0].getName());
            String[] coordinates = scanner.nextLine().split(",");
            int i = Integer.parseInt(coordinates[0]);
            int j = Integer.parseInt(coordinates[1]);
            boolean extraMove = players[1].getBattleField().target(i, j);

            if (!extraMove) {
                Player temp1 = players[0];
                Player temp2 = players[1];
                players[0] = temp2;
                players[1] = temp1;
            }
        }

        for (Player player : players) {
            if (player.getBattleField().isWinner()) {
                System.out.printf("Игрок %s победил!%n", player);
            }
        }

        players[0].printBattleField();
        players[1].printBattleField();

    }

    private void print20EmptyLines() {
        IntStream.range(0, 20)
                .forEach(value -> System.out.println());
    }
}
