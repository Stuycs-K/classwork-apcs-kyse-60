import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Taxicab{
  public static void main(String[] args) {
  }

  public static int Distance(String filename){
    try {
      File file = new File(filename);
      Scanner a = new Scanner(file);
      int x = 0
      int y = 0
      String[]dir = a.split(",")
      }
      return ans;
    } catch (FileNotFoundException ex) {
      System.out.println("File not found");
      return -1;
  }
}
