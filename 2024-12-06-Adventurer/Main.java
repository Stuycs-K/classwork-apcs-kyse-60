import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    //do this once
    Scanner userInput = new Scanner(System.in);
    CodeWarrior a = new CodeWarrior();

    System.out.println("Enter name of Mage");
    //Read one line of user input
    String userName = userInput.nextLine();
    //Do something with the input
    Mage b = new Mage(userName);
    System.out.println("Mage name is: " + userName);
    System.out.prinln("The following two fighters step into the arena:");
    System.out.println(a.printStats);
    System.out.println(b.printStats);
    System.out.prinln("3..");
    System.out.prinln("2..");
    System.out.prinln("1..");
    System.out.prinln("FIGHT!");
    for(a.getHP() >= 0 && b.getHP() >= 0){
        System.out.println("Type: (a)ttack / (sp)ecial / (su)pport / quit");
        String action = user.Input.nextLine();
        if (action.equals("a")) b.attack(a);
        else if (action.equals("sp")) b.specialAttack(a);
        else if (action.equals("su")) b.support();
        else if (action.equals("quit")) break;
        int randomacc = (int) Math.random() * 3;
        if (randomacc = 0) a.attack(b);
        else if (randomacc = 1) a.specialAttack(b);
        else if (randomacc = 2) a.support();

    }
  }

  public String printStats(Adventurer character){
    return character + ", " + character.getHP()
     +  "/" + character.getmaxHP() + "HP , " + 
     character.getSpecial() + "/" + charcter.getSpecialMax() + " Rage";
  }
}