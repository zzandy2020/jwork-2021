public class Creature {
    String name;
    int health;
    int attack;
    Creature(int health, int attack, String name){
        this.health = health;
        this.attack = attack;
        this.name = name;
   }

   public void speak(String lines){
       System.out.println(name + " says :"+ lines);
   }

   public void move(){
       //TODO
   }
}
