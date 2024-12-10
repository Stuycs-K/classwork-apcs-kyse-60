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
    System.out.println(b + " and " + a + " step into the arena:");
    System.out.println("3..");
    System.out.println("2..");
    System.out.println("1..");
    System.out.println("FIGHT!");
    while(a.getHP() >= 0 && b.getHP() >= 0){
        System.out.println(printStats(a));
        System.out.println(printStats(b));
        System.out.println("Type: (a)ttack / (sp)ecial / (su)pport / quit");
        String action = userInput.nextLine();
        if (action.equals("a")) System.out.println(b.attack(a));
        else if (action.equals("sp")) System.out.println(b.specialAttack(a));
        else if (action.equals("su")) System.out.println(b.support());
        else if (action.equals("quit")) break;
        int randomacc = (int) Math.random() * 3;
        if (randomacc == 0) System.out.println(a.attack(b));
        else if (randomacc == 1) System.out.println(a.specialAttack(b));
        else if (randomacc == 2) System.out.println(a.support());
    }
    if(a.getHP() < 0) System.out.println("Congratulations! You have won " + b +" has beaten " +  a);
    if(b.getHP() < 0) System.out.println("Game Over! You have lost " + a +" has beaten " +  b);
  } 

  public static String printStats(Adventurer character){
    return character + ", " + character.getHP()
     +  "/" + character.getmaxHP() + "HP , " + 
     character.getSpecial() + "/" + character.getSpecialMax() + " " + character.getSpecialName();
  }
}