package finalProject;

import java.util.Map;
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
        } while (startAskFrom != 0);
        print20EmptyLines();
    }

    public void startGame() {
    }

    private void print20EmptyLines() {
        IntStream.range(0, 20)
                .forEach(value -> System.out.println());
    }
}
