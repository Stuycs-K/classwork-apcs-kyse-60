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
        int damage = (int) (Math.random() * 2 + 3); // if you add two randoms you can make it into a normal distribution ish  ( the middle values will be more likely and extremes less likely)
        other.applyDamage(damage);
        return this + " summons 20  tacos to attack " + other + ", " + other + " loses " + damage + " hp";
    }

    public String support(Adventurer other){
        int heal = (int) (Math.random() * 4 - 7);
        other.applyDamage(heal);
        if (other.getHP() > other.getmaxHP()) other.setHP(other.getmaxHP());
        return this + " uses the power of the light of a lava lamp to heal " + other + ", " + other + " gains " + Math.abs(heal) + " hp";
    }
    

    public String support(){
        int heal = (int) (Math.random() * 4 - 7);
        this.applyDamage(heal);
        if (this.getHP() > this.getmaxHP()) this.setHP(this.getmaxHP());
        return this + " uses the power of 5 singing sheep to heal " + Math.abs(heal) + " hp";
    }

    public String specialAttack(Adventurer other){
        if (getSpecial() > 0 ) setSpecial(getSpecial() - 1); // if none than just do normal (design choice)
        else return "insufficient mana";
        int damage = (int) (Math.random() * 3 + 5);
        other.applyDamage(damage); 
        return this + " uses alignment of 16 stars to summon a star beam on " + other + " dealing " + damage + " damage"; 
    }

}