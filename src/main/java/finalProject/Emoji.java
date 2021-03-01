package finalProject;

// https://medium.com/swlh/how-to-easily-handle-emoji-unicode-in-java-ff905f264f98
public enum Emoji {
    WHITE_LARGE_SQUARE(0x2B1C),
    BLUE_SQUARE(0x1F7E6),
    RED_SQUARE(0x1F7E5),
    SHIP(0x1F6A2);

    private int[] codePoints;

    Emoji(int... codePoints) {
        this.codePoints = codePoints;
    }

    @Override
    public String toString() {
        final StringBuilder stringBuilder = new StringBuilder();

        for (Integer codePoint : codePoints) {
            for (Character character : Character.toChars(codePoint)) {
                stringBuilder.append(character);
            }
        }

        return stringBuilder.toString();
    }
}
