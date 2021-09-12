package Feng;

public class Scene 
{
    public void Play()
    {
        Creature test1 = new Creature("test1", 20);
        Creature test2 = new Creature("test2", 20);
        Bogy atker = new Bogy("attacker", 50, 15);
        test1.Speak2("i'm test1", null);
        test1.Speak2(null, test1);
        test2.Speak2("i know that", test1);
        atker.Attack(atker);
        atker.Attack(test1);
        atker.Attack(test1);
        atker.Attack(test2);
        atker.Attack(atker);
        atker.Attack(test2);
        atker.Attack(test2);
        //System.out.println(test.Name());
    }  
}

