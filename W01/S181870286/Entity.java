package W01.S181870286;

abstract class Entity {
    // 所有东西都有寿命
    boolean alive;
    int hp;
    int damage;
    String name;

    Entity(String name, int hp, int damage) {
        this.name = name;
        this.hp = hp;
        this.damage = damage;
    }
    
    void getHarm(int damage) {
        hp -= damage;
        if (hp <= 0) {
            alive = false;
            System.out.println(name + "没了");
        }
    }

    void fallTo(Entity e) {
        e.getHarm(damage);
        getHarm(e.damage);
        System.out.println(name + "摔向" + e.name + "。");
    }
}
