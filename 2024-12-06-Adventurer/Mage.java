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
        int damage = (int) (Math.random(11) + 20);
        other.applyDamage(damage);
        return this.getName() + " summons 20  tacos to attack " + other.getName() + ", " + other.getName() + " loses " + damage + " hp";
    }

    public String support(Adventurer other){
        int heal = (int) (Math.random(6) - 10);
        other.applyDamage(heal);
        return this.getName() + " uses the power of the light of a lava lamp to heal " + other.getName() + ", " + other.getName() + " gains " + heal + " hp";
    }
    

    public String support(){
        int heal = (int) (Math.random(6) - 10);
        this.applyDamage(heal);
        return this.getName() + " uses the power of 5 singing sheep to heal " + heal + " hp";
    }

    public String specialAttack(Adventurer other){
        int damage = (int) (Math.random(11) + 40);
        other.applyDamage(damage);
        return this.getName() + " uses alignment of 16 stars to summon a star beam on" + other.getName() + " dealing " + damage + " damage";
    }

}