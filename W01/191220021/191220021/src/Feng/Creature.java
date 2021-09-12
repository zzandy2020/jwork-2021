package Feng;

public class Creature extends Being
{
    private float m_health;
    private float m_maxHealth;
    
    Creature (String name, float maxHealth)
    {
        if(name == null || name.trim().isEmpty())
        {
            throw new IllegalArgumentException("\033[1;91m invalid name!\033[0m");          
        }
        else 
        {
            m_name = name;
            m_health = maxHealth;
            m_maxHealth = maxHealth;         
        }
       
    }

    public void Speak2(String words, Creature target)
    {
        if(words == null) return;
        if(target != null)
        {
            System.out.println("\033[0;32m" + m_name + " told " + target.Name() + ": \033[0m" + words);
        }
        else System.out.println("\033[0;32m" + m_name + ": \033[0m" + words);
    }
    
    protected void TakeDamage(float damage, Being damageSource)
    {
        if(!IsDead())
        {
            m_health -= (m_health < damage) ? m_health : damage;
            System.out.println("\033[0;31m>" + m_name + " take " + damage + " points of damage from " + damageSource.Name() + ".\033[0m");       
        }
        if(IsDead())
        {
            System.out.println("\033[0;31m>" + m_name + " died...\033[0m");
        }
    }
    
    private boolean IsDead()
    {
        return m_health == 0;
    }
}