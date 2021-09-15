public class Scene{
    Monster toadMonster;            //癞蛤蟆
    Monster centipedeMonster;       //蜈蚣
    Human waSixHuman;               //六娃
    Weapon tridentWeapon;           //三叉戟
    Weapon maceWeapon;              //狼牙棒
    Stone smallStone;               //石块
    public Scene() {
        toadMonster = new Monster(10, 2, 2, 1);
        centipedeMonster = new Monster(10, 3, 1, 1);
        waSixHuman = new Human(50, 5, 5);
        tridentWeapon = new Weapon(1);
        maceWeapon = new Weapon(1);
        smallStone = new Stone();
    }

    public void play() {

    }

    public static void main(String[] args) {
        
    }
}