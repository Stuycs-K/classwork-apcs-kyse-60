public class Mage extends Adventurer{
    private int mana;
    private int manaMax;
    
    public Mage(String name){
        super(name);
        this.mana = 10;
        this.manaMax = 10;
    }

    public Mage(String name, int hp, int mana){
        super(name, hp);
        this.mana = mana;
        this.manaMax = mana;
    }

    public String getSpecialName(){
        return "mana";
    }

    public int getSpecial(){
        return mana;
    }

    public int getSpecialMax(){
        return manaMax;
    }

    public void setSpecial(int n){
        mana = n;
    }

    public String attack( Adventurer other){
        int damage = (int) (Math.random() * 11 + 20); // if you add two randoms you can make it into a normal distribution ish  ( the middle values will be more likely and extremes less likely)
        other.applyDamage(damage);
        return this + " summons 20  tacos to attack " + other + ", " + other + " loses " + damage + " hp";
    }

    public String support(Adventurer other){
        int heal = (int) (Math.random() * 6 - 10);
        other.applyDamage(heal);
        return this + " uses the power of the light of a lava lamp to heal " + other + ", " + other + " gains " + Math.abs(heal) + " hp";
    }
    

    public String support(){
        int heal = (int) (Math.random() * 6 - 10);
        this.applyDamage(heal);
        return this + " uses the power of 5 singing sheep to heal " + Math.abs(heal) + " hp";
    }

    public String specialAttack(Adventurer other){
        if (getSpecial() > 0 ) setSpecial(getSpecial() - 1); // if none than just do normal (design choice)
        else return "insufficient mana";
        int damage = (int) (Math.random() * 11 + 40);
        other.applyDamage(damage); 
        return this + " uses alignment of 16 stars to summon a star beam on " + other + " dealing " + damage + " damage"; 
    }

}