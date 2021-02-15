package finalProject;

import java.util.Arrays;

public enum ShipType {
    BATTLESHIP(1, 4, "четырехпалубного"),
    CRUISER(2, 3, "трехпалубного"),
    DESTROYER(3, 2, "двухпалубного"),
    PATROL_BOAT(4, 1, "однопалубного");

    private final int maxAvailableCount;
    private final int length;
    private final String typeName;

    ShipType(int maxAvailableCount, int length, String typeName) {
        this.maxAvailableCount = maxAvailableCount;
        this.length = length;
        this.typeName = typeName;
    }

    public static ShipType findShipTypeByLength(int size) {
        return Arrays.stream(ShipType.values())
                .filter(f -> f.length == size)
                .findFirst()
                .get();
    }

    public String getTypeName() {
        return typeName;
    }

    public int getMaxAvailableCount() {
        return maxAvailableCount;
    }

    public int getLength() {
        return length;
    }
}
