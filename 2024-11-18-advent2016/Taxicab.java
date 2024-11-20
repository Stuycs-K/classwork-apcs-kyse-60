import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Taxicab{
  public static void main(String[] args) {
    System.out.println(Distance("input.txt."));
  }

  static int x = 0;
  static int y = 0;
  static int facing = 0;

  public static void change(int a){
    if (facing == 0) y += a;
    if (facing == 1) x += a;
    if (facing == 2) y -= a;
    if (facing == 3) x -= a;
  }

  public static int Distance(String filename){
    try {
      File file = new File(filename);
      Scanner a = new Scanner(file);
      String[]dir = a.nextLine().split(", ");
      for(int i = 0; i < dir.length; i++){
        if (dir[i].substring(0,1).equals("R")){
          facing = (facing + 1) % 4;
          change(Integer.parseInt(dir[i].substring(1)));
        }
        if (dir[i].substring(0,1).equals("L")){
          facing = (facing + 3) % 4;
          change(Integer.parseInt(dir[i].substring(1)));
        }
      }
      a.close();
      return Math.abs(x) + Math.abs(y);
    }catch (FileNotFoundException ex) {
      System.out.println("File not found" + filename);
      return -1;
  }
}
}
