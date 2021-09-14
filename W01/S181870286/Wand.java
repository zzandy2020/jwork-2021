package W01.S181870286;

import java.util.ArrayList;

abstract class Wand extends Entity implements SuperPower {

    Wand(String name, int hp, int damage) {
        super(name, hp, damage);
    }

}

class AsYouWish extends Wand {
    AsYouWish(String name, int hp, int damage) {
        super("如意", 20, 20);
        //TODO Auto-generated constructor stub
    }

    @Override
    public void useSuperPower(ArrayList<Entity> targets) {
        System.out.print("如意放出一阵妖风, 把");
        for (Entity target : targets) {
            System.out.print(target.name + "、");
        }
        System.out.print("刮着了。");
        for (Entity target : targets) {
            target.getHarm(50);
        }
    }
}
