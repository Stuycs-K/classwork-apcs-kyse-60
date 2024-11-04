import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TriangleTester{

  public boolean isTriangle(Integer a , Integer b, Integer c){
    boolean x = (a + b < c);
    boolean y = (a + c < b);
    boolean z = (c + b < a);
    return (x && y && z);
  }

}
