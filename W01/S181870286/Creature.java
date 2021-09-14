package W01.S181870286;

import java.util.ArrayList;

class Creature extends Entity {
    // 拿一样东西做防御，防御的hp先掉。拿一个人做肉盾是可行的
    Entity armour;
    // 拿一样东西做武器。
    Entity weapon;
    Wand wand;

    Creature(String name, int hp, int damage) {
        super(name, hp, damage);
    }
    void speak(String words) {
        System.out.println(name + "说：“" + words + "”。");
    }

    void doSomething(String sth) {
        System.out.println(name + sth + "。");
    }

    // 生物不同的地方在于可以拿其他东西防御
    @Override
    void getHarm(int damage) {

        if (armour == null || armour.alive == false) {
            armour = null;
            hp -= damage;
            if (hp <= 0) {
                alive = false;
                System.out.println(name + "死了。。。");
            }
        } else {
            armour.getHarm(damage);
            if (armour.alive == false)
                armour = null;
        }
        System.out.println(name + "受到" + damage + "点伤害。");
    }

    void attack(Entity e) {
        if (weapon == null || weapon.alive == false) {
            e.getHarm(damage);
        } else {
            weapon = null;
            e.getHarm(weapon.damage);
        }
        System.out.println(name + "攻击" + e.name);
    }

    void holdArmour(Entity e) {
        if(e instanceof Creature)
            System.out.println(name+"挟持"+e.name+"作为人质");
        else
            System.out.println(name+"捡起"+e.name+"作为防御");
        
        armour = e;
    }

    void holdWeapon(Entity e) {
        System.out.println(name + "捡起" + e.name + "作为武器");
    }

    void holdWand(Wand wand) {
        System.out.println(name + "捡起" + wand.name + "作为法宝");
    }

    void useWandTo(ArrayList<Entity> targets) {
        if (wand != null) {
            System.out.println(name + "使用" + wand.name);
            wand.useSuperPower(targets);
        }
    }

    void throwTo(Entity e) {
        if (weapon != null && weapon.alive == true) {
            System.out.println(name + "抛下" + weapon.name);
            weapon.fallTo(e);
            weapon = null;
        }
    }
}
