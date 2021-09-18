package W02.example;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Geezer {

    private static String[] parsePlan(String plan) {
        return plan.split("\n");
    }

    private static void execute(String step, Line line) {
        String[] couple = step.split("<->");

        line.swapGourd(Gourd.getGourdByRank(Integer.parseInt(couple[0])),
                Gourd.getGourdByRank(Integer.parseInt(couple[1])));

    }

    public static void main(String[] args) {

        Line line = new Line();
        line.put(Gourd.ONE, 6);
        line.put(Gourd.TWO, 3);
        line.put(Gourd.THREE, 1);
        line.put(Gourd.FOUR, 5);
        line.put(Gourd.FIVE, 2);
        line.put(Gourd.SIX, 4);
        line.put(Gourd.SEVEN, 0);

        for (int i : line.getArray()) {
            System.out.print(i);
        }

        System.out.println();

        line.printLine();

        Sorter s = new Sorter(line.getArray());

        s.bubbleSort();

        System.out.println(parsePlan(s.plan).length);

        

        String result = "";
        for (String step : Geezer.parsePlan(s.plan)){
            Geezer.execute(step, line);

            result += line.printLine();
            result += "[frame]\n";

        }

        BufferedWriter writer;
        try {
            writer = new BufferedWriter(new FileWriter("result.txt"));
            writer.write(result);

        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }

}
