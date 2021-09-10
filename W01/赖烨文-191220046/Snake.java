public class Snake extends Monster{

    Snake() {
        name = "Snake";
    }

    public void sayMagicalWords() {
        System.out.println(name+" said 一二三四五金木水火土");
    }

    public void laughAt(Creature creature) {
        speakTo(creature,"hahahahaha");
    }

    public void throwSomethingTo(Creature creature, String something) {
        System.out.println(name+" throws "+something+" to "+creature.name);
    }

}
