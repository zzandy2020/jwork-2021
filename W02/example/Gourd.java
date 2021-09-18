package W02.example;

public enum Gourd {

    ONE(204, 0, 0),

    TWO(255, 165, 0),

    THREE(252, 233, 79),

    FOUR(78, 154, 6),

    FIVE(50, 175, 255),

    SIX(114, 159, 207),

    SEVEN(173, 127, 168);

    private final int r;
    private final int g;
    private final int b;

    Gourd(int r, int g, int b) {
        this.r = r;
        this.g = g;
        this.b = b;
    }

    public static Gourd getGourdByRank(int rank) {

        for (Gourd gourd : Gourd.values()) {
            if (gourd.rank() == rank) {
                return gourd;
            }
        }
        return null;

    }

    public int rank() {
        return this.ordinal() + 1;
    }

    @Override
    public String toString() {
        return "\033[48;2;" + this.r + ";" + this.g + ";" + this.b + "m    " + this.rank() + "\033[0m";
    }

}