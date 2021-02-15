package finalProject;

import java.util.Arrays;

public class CoordinatesValidator {

    private CoordinatesValidator() {
    }

    public static void validate(String userInput, ShipType shipType, BattleField battleField) throws Exception {
        String[] coordinatesArray = userInput.split(";");
        validateNumbers(coordinatesArray);
        validateLength(coordinatesArray, shipType);
        validateIsShipValid(coordinatesArray);
        validateEmptyPlaceInBattleField(coordinatesArray, battleField);
    }

    // Каждая из координат, введенных пользователем, корректна (корректные координаты
    // - это два числа от 0 до 9, эти два числа разделены запятой).
    private static void validateNumbers(String[] coordinatesArray) throws Exception {
        for (String coordinate : coordinatesArray) {
            String[] split = coordinate.split(",");

            if (split.length != 2) {
                throw new Exception("координаты должны быть из 2 чисел");
            }

            for (String s : split) {
                int number = Integer.parseInt(s);
                if (!(number >= 0 && number <= 9)) {
                    throw new Exception("0 до 9");
                }
            }
        }
    }

    // Количество координат правильное (для четырехпалубного корабля координат должно быть 4,
    // для трехпалубного - 3, и так далее).
    private static void validateLength(String[] coordinatesArray, ShipType shipType) throws Exception {
        if (shipType.getLength() != coordinatesArray.length) {
            throw new Exception("Количество координат не правильное");
        }
    }

    // Введенные координаты - это валидный корабль. Валидный корабль - это одна или
    // несколько последовательно идущих клеток (по вертикали или горизонтали). То
    // есть несколько координат, разбросанных по карте - это невалидный корабль.
    // Вам нужно проверить это.
    private static void validateIsShipValid(String[] coordinatesArray) throws Exception {
        int arrayLength = coordinatesArray.length;
        int[] arrayI = new int[arrayLength];
        int[] arrayY = new int[arrayLength];

        for (int n = 0; n < coordinatesArray.length; n++) {
            String[] coordinate = coordinatesArray[n].split(",");

            arrayI[n] = Integer.parseInt(coordinate[0]);
            arrayY[n] = Integer.parseInt(coordinate[1]);
        }

        boolean isVertical = Arrays.stream(arrayI).distinct().count() == 1;
        boolean isHorizontal = Arrays.stream(arrayY).distinct().count() == 1;

        if ((isVertical && isHorizontal) || (!isVertical && !isHorizontal)) throw new Exception("не валидный корабль");

        if (isVertical) {
            Arrays.sort(arrayY);
            for (int y = 1; y < arrayY.length; y++) {
                if (arrayY[y - 1] + 1 != arrayY[y]) throw new Exception("не валидный корабль");
            }
        }

        if (isHorizontal) {
            Arrays.sort(arrayI);
            for (int i = 1; i < arrayI.length; i++) {
                if (arrayI[i - 1] + 1 != arrayI[i]) throw new Exception("не валидный корабль");
            }
        }
    }

    // Корабль размещается на свободном месте на карте.
    private static void validateEmptyPlaceInBattleField(String[] coordinatesArray, BattleField battleField) throws Exception {
        for (String c : coordinatesArray) {
            String[] coordinate = c.split(",");

            int i = Integer.parseInt(coordinate[0]);
            int j = Integer.parseInt(coordinate[1]);

            if (!battleField.getField()[i][j].equals(BattleField.EMPTY)) {
                throw new Exception("Корабль размещается на занятом месте на карте");
            }
        }
    }

    // Размещаемый корабль не касается других кораблей сторонами и углами. То есть,
    // вокруг каждого корабля должен быть “ореол” из одной клетки, на который не могут
    // размещаться какие-либо другие корабли.
    // РЕАЛИЗОВАННО в BattleField методе addShip -> addBuffer

}
