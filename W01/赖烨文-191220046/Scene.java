public class Scene {

    SixWa sixWa;
    Snake snake;

    public Scene() {
        sixWa = new SixWa();
        snake = new Snake();
    }

    public void play() {
        snake.speakTo(sixWa,"死到临头还嘴硬，看我来收拾你");
        sixWa.speakTo(snake,"好啊，我在这等着你，快来抓我吧");
        snake.sayMagicalWords();
        snake.throwSomethingTo(sixWa,"grass");
        sixWa.beInsertedByGrass();
        snake.throwSomethingTo(sixWa,"cover");
        sixWa.hideFromAttack();
        sixWa.becomeInvisible();
        sixWa.beTrapped();
        snake.laughAt(sixWa);
    }

    public static void main(String[] args) {
        new Scene().play();
    }

}
