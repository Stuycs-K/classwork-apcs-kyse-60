import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Bathroom{
    public static void main(String[] args) {
        System.out.println(Decode("input.txt."));
      }

      static int x = 2;
      static int y = 3;

    
    public static String Decode(String filename){
        try {
          File file = new File(filename);
          Scanner a = new Scanner(file);
          int current = 5;
          String ans = "";
          while(a.hasNextLine()){
            String str = a.nextLine();
            for (int i = 0; i < str.length(); i++){
                if (str.substring(i,i+1).equals("U") && y != 0) y -= 3;
                if (str.substring(i,i+1).equals("D") && y != 6) y += 3;
                if (str.substring(i,i+1).equals("R") && x != 3) x++;
                if (str.substring(i,i+1).equals("L") && x!= 1) x--;
            }
            int add = x + y;
            ans += add ; 
          }
          a.close();
          return ans;
        }catch (FileNotFoundException ex) {
          System.out.println("File not found" + filename);
          return "no";
      }
    }
}