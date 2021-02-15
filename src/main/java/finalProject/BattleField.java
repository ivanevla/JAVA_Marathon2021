package finalProject;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class BattleField {
    public static final String EMPTY = ".";
    public static final String SHIP = "X";
    public static final String BUFFER = "0";
    public static final String SPACE = "  ";

    private final Map<ShipType, Integer> usedShipsCount;
    private final String[][] field;

    public BattleField() {
        this.usedShipsCount = new HashMap<>();
        this.field = new String[10][10];

        // FILL EMPTIES
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field[i].length; j++) {
                this.field[i][j] = EMPTY;
            }
        }

        // populate usedShipsCount for all ships types with zero
        Arrays.stream(ShipType.values())
                .forEach(shipType -> usedShipsCount.put(shipType, 0));
    }

    public Map<ShipType, Integer> getUsedShipsCount() {
        return usedShipsCount;
    }

    public String[][] getField() {
        return field;
    }

    // prints battleField
    //    0  1  2  3  4  5  6  7  8  9
    // 0  0  0  0  -  -  -  0  X  0  X
    // 1  0  X  0  -  -  -  0  0  0  0
    // 2  0  X  0  -  -  -  0  X  0  -
    // 3  0  X  0  -  -  -  0  0  0  -
    // 4  0  0  0  -  -  -  -  -  -  -
    // 5  -  -  -  -  -  -  -  -  -  -
    // 6  -  -  -  -  -  -  -  -  -  -
    // 7  -  -  -  -  0  0  0  0  0  0
    // 8  -  -  -  -  0  X  X  X  X  0
    // 9  -  -  -  -  0  0  0  0  0  0
    public void print() {
        System.out.print(" " + SPACE);
        for (int i = 0; i < field.length; i++) {
            System.out.print(i + SPACE);
        }
        System.out.println();

        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field[i].length; j++) {
                if (j == 0) System.out.print(i + SPACE);
                System.out.print(this.field[i][j] + SPACE);
            }
            System.out.println();
        }
    }

    public boolean addShip(String coordinates) {
        String[] coordinatesArray = coordinates.split(";");

        // increase usedShipsCount
        int shipLength = coordinatesArray.length;
        ShipType shipType = ShipType.findShipTypeByLength(shipLength);
        int newCount = this.usedShipsCount.get(shipType) + 1;
        this.usedShipsCount.put(shipType, newCount);

        // Add ship and buffer
        for (String c : coordinatesArray) {
            String[] coordinate = c.split(",");

            int i = Integer.parseInt(coordinate[0]);
            int j = Integer.parseInt(coordinate[1]);

            // Add ship
            this.field[i][j] = SHIP;

            // Add buffer
            if (i - 1 >= 0 && j - 1 >= 0 && !this.field[i - 1][j - 1].equals(SHIP))
                this.field[i - 1][j - 1] = BUFFER;
            if (i - 1 >= 0 && !this.field[i - 1][j].equals(SHIP))
                this.field[i - 1][j] = BUFFER;
            if (i - 1 >= 0 && j + 1 <= 9 && !this.field[i - 1][j + 1].equals(SHIP))
                this.field[i - 1][j + 1] = BUFFER;

            if (j - 1 >= 0 && !this.field[i][j - 1].equals(SHIP))
                this.field[i][j - 1] = BUFFER;
            if (j + 1 <= 9 && !this.field[i][j + 1].equals(SHIP))
                this.field[i][j + 1] = BUFFER;

            if (i + 1 <= 9 && j - 1 >= 0 && !this.field[i + 1][j - 1].equals(SHIP))
                this.field[i + 1][j - 1] = BUFFER;
            if (i + 1 <= 9 && !this.field[i + 1][j].equals(SHIP))
                this.field[i + 1][j] = BUFFER;
            if (i + 1 <= 9 && j + 1 <= 9 && !this.field[i + 1][j + 1].equals(SHIP))
                this.field[i + 1][j + 1] = BUFFER;
        }
        return false;
    }
}
