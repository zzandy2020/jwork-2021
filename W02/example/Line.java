package W02.example;

public class Line {

    private Position[] positions = new Position[7];

    public void put(Gourd gourd, int i) {
        if (this.positions[i] == null) {
            this.positions[i] = new Position(null);
        }
        this.positions[i].hold(gourd);
    }

    public Gourd get(int i) {
        if ((i < 0) || (i > positions.length)) {
            return null;
        } else {
            return positions[i].gourd;
        }
    }

    public void swapGourd(Gourd g1, Gourd g2) {

        Position p1 = null, p2 = null;

        for (Position p : positions) {
            if ((p.gourd == g1) || (p.gourd == g2)) {
                if (p1 == null) {
                    p1 = p;
                } else {
                    p2 = p;
                }
            }
        }
        Gourd g = null;
        g = p1.gourd;
        p1.gourd = p2.gourd;
        p2.gourd = g;

    }

    class Position {

        private Gourd gourd;

        Position(Gourd gourd) {
            this.gourd = gourd;
        }

        public void hold(Gourd gourd) {
            this.gourd = gourd;
        }
    }

    public String printLine() {
        String lineString = "";
        for (Position p : positions) {
            lineString += p.gourd.toString();
        }
        return(lineString);
    }

    public int[] getArray() {

        int[] gourds = new int[7];

        for (int i = 0; i < 7; i++) {
            gourds[i] = positions[i].gourd.rank();
        }

        return gourds;

    }

}
