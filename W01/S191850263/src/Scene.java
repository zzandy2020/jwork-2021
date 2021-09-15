
public class Scene {
    Rock rock;
    stretchHandMonster stretchHandMonster;
    huluKingKong huluKingKong;
    Monster hedgehog;
    public Scene(){
        rock=new Rock(1000,"extremely sharp");
        rock.name="rock";
        stretchHandMonster=new stretchHandMonster(100,500,10);
        stretchHandMonster.name="StretchHandMonster";
        huluKingKong=new huluKingKong(500,1000,100);
        huluKingKong.name="HuluKingKong";
        hedgehog=new Monster(50,100,20);
        hedgehog.name="Hedgehog";
    }
    public void play(){
        stretchHandMonster.speakTo(huluKingKong,"I'm streching hand King！My hand is so long！Even if you are 天王老子，leave your money and life!");
        huluKingKong.speakTo(stretchHandMonster,"You are shameless!I only have the thing which is in my stomach!");
        stretchHandMonster.speakTo(huluKingKong,"what?");
        huluKingKong.speakTo(stretchHandMonster,"you want my wind?");
        huluKingKong.laugh();
        hedgehog.laugh();
        stretchHandMonster.speakTo(huluKingKong,"You have many good things! All of them must be left! Even your little chicken chicken！hhhhhhhh....");
        huluKingKong.spit();
        huluKingKong.speakTo(stretchHandMonster,"you lose face!");
        stretchHandMonster.speakTo(huluKingKong,"Or, give me your heart there!");
        huluKingKong.angry();
        huluKingKong.fireAttack(stretchHandMonster,10);
        stretchHandMonster.isDead();
        stretchHandMonster.laugh();
        stretchHandMonster.speakTo(huluKingKong,"hhhhhh,I don't scare fire and water! I only scare that things are not enough!");
        stretchHandMonster.catchAttack(hedgehog,45);
        hedgehog.spitBlood();
        hedgehog.isDead();
        huluKingKong.evade();
        huluKingKong.move("jumps","cliff");
        huluKingKong.rockAttack(stretchHandMonster,1000,rock,true);
        stretchHandMonster.isDead();
    }
    public static void main(String[] args){
        new Scene().play();
    }
}
