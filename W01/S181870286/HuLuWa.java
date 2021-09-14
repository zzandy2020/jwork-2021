package W01.S181870286;

import java.util.ArrayList;

// 四娃喷火
class SiWa extends Creature implements SuperPower{

    SiWa() {
        super("四娃", 100, 10);
        //TODO Auto-generated constructor stub
    }

    @Override
    public void useSuperPower(ArrayList<Entity> targets) {
        System.out.print("四娃喷出地狱烈焰, 把");
        for (Entity target : targets) {
            System.out.print(target.name + "、");
        }
        System.out.print("烧着了。");
        for (Entity target : targets) {
            target.getHarm(50);
        }
    }
}
// 五娃喷水
class WuWa extends Creature implements SuperPower{

    WuWa() {
        super("五娃", 100, 10);
        //TODO Auto-generated constructor stub
    }

    @Override
    public void useSuperPower(ArrayList<Entity> targets) {
        System.out.print("五娃喷出灭绝洪水, 把");
        for (Entity target : targets) {
            System.out.print(target.name + "、");
        }
        System.out.print("淹着了。");
        for (Entity target : targets) {
            target.getHarm(50);
        }
    }
}

