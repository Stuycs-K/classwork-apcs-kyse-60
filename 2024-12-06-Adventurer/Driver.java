public class Driver{
    public static void main(String[] args){
        Adventurer p1 = new Mage("Jaina", 150, 8);
        Adventurer p2 = new Mage("Tony");

        System.out.println(p1.getSpecialName() + " should return mana");
        System.out.println(p1.getSpecial() + " should return 8");
        p1.setSpecial(9);
        System.out.println(p1.getSpecial() + " should return 9");
        System.out.println(p1.getSpecialMax() + " should return 9");

        System.out.println(p1.attack(p2));
        System.out.println(p2.support(p1));
        System.out.println(p2.support());
        System.out.println(p1.specialAttack(p2)); 

        System.out.println(" check variable changes");
        System.out.println(p1.getSpecial() + " should return 8");

    }

}