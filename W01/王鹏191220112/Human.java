package W01.王鹏191220112;

public class Human extends Creature {

    Human(String name) {
        super(name);
        health = 100;
        attack = 20;
        defense = 1;
    }

    public void laugh() {
        this.tellName();
        System.out.println("HAHAHAHA... ");
    }

    public void stretchArms() {
        this.tellName();
        System.out.println("I stretch my arms. ");
    }

    public void takeOut(Being something) {
        this.tellName();
        String name = "";

        if (something != null) {
            name = something.getName();
        } else {
            name = "nothing";
        }

        System.out.println("I take out " + name + ". ");
    }

}
