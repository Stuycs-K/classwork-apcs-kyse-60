public class Driver{
  public static void main(String[] args){
    Animal a = new Animal("buzz",5,"bee");
    a.speak();

    Bird b = new Bird("tweet", 2, "bob", 12.0, "brown");
    b.speak();
    System.out.println(b.getName() + " should return something with Mighty");
    System.out.println(a.getName() + " should not return something with Mighty");
  }
}
