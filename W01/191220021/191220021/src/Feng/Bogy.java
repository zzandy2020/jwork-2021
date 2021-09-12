package Feng;

public class Bogy extends Creature
{
    private float baseDamage; 
    Bogy(String name, float maxHealth, float baseDamage)
    {
        super(name, maxHealth);
        this.baseDamage = baseDamage;
    }

    public void Attack(Creature atkTarget)
    {
        if(atkTarget != null)
        {
            System.out.println(m_name + " attacked " + atkTarget.Name() + ":");
            atkTarget.TakeDamage(baseDamage, this);
        }
    }
}