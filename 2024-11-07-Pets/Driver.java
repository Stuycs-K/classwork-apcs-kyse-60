  //Step 8 answer
  //calling getName from a bird object uses the overridden method of getName method. However
  //calling getName from a Animal object uses the original getName method. 

public class Driver{
  public static void main(String[] args){
    Animal a = new Animal("buzz",5,"bee");
    a.speak();

    Bird b = new Bird("tweet", 2, "bob", 12.0, "brown");
    b.speak();
    System.out.println(b.getName() + " should return something with Mighty");
    System.out.println(a.getName() + " should not return something with Mighty");

    //Testing what can work:
    Animal a1 = new Animal("ok",4,"me");
    Bird b1 = new Bird("yes", 8, "you", 5.0 , "blue");
    //Bird b2 = new Animal("ok1",41,"me1"); - animal cannot be converted to bird
    Animal a2 = new Bird("yes0", 80, "you0", 50.0 , "blue0");
  }

 
}
