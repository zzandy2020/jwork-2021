package Assignment1;

import java.util.ListIterator;

public class Scene {
    Scorpion scorpion;
    Snake snake;
    Bigbro bigbro;
    Monster centipede;
    Subtitle subtitle;
    Scene(){
        scorpion = Scorpion.getInstance();
        snake = Snake.getInstance();
        bigbro = Bigbro.getInstance();
        centipede = new Monster(500, 10, 0, "centipede");
        subtitle = new Subtitle("Assignment1/Dialogue.txt");
    }

    void play(){
        ListIterator<String> line = subtitle.Iterator();
        System.out.println("*******\nAction!\n*******");
        bigbro.speak(line.next());
        snake.pondering(2);
        snake.speak(line.next());
        bigbro.speak(line.next());
        scorpion.speak(line.next());
        bigbro.speak(line.next());
        scorpion.speak(line.next());
        scorpion.getarmed("arrow", 50);
        scorpion.attack(bigbro);
        scorpion.lostArm();
        snake.magic(bigbro);
        centipede.attack(bigbro);
        centipede.attack(bigbro);
        bigbro.attack(centipede);
        centipede.transform();
        bigbro.becomeMega();
        bigbro.attack(centipede);
        centipede.isDead();
        bigbro.becomeNormal();
        System.out.println("*******\n  End  \n*******");
    }

    public static void main(String args[]){
        Scene p3 = new Scene();
        p3.play();
    }
    
}
