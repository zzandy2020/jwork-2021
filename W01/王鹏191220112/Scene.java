package W01.王鹏191220112;

public class Scene {

    Human oldman;
    Monster snake;
    Monster scorpion;
    Monster minion;
    Entity baolian;

    public Scene() {
        oldman = new Human("oldman");
        snake = new Monster("snake", 200, 10, 20, 2);
        scorpion = new Monster("snake", 500, 50, 50, 2);
        minion = new Monster("minion", 100, 5, 10, 1);
        baolian = new Entity("baolian");
    }

    public void play() {

    }

    public static void main(String[] args) {
        System.out.println("abab");
    }
}
