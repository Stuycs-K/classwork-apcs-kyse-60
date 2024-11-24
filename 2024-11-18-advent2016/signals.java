import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayList;


public class signals{
  public static void main(String[] args) {
    System.out.println(Decode("input.txt."));
  }

  public static int maxoflist(int[] list){
    int max = 0;
    int maxindex = 0;
    for(int i = 0; i < list.length; i++){
      if (list[i] > max){
        max = list[i];
        maxindex = i;
      } 
    }
    return maxindex;
  }

  public static char findMax(Scanner scan , int index){
    int[] count = new int[26];
    while( scan.hasNextLine()){
        String a = scan.nextLine();
        for( int i = 0; i < 26; i ++){
          char character = (char) (i + 97);
          if (a.charAt(index) == character) count[i]++;
          }
    }
    char ans = (char)(maxoflist(count) + 'a');
    return ans;
  }

  public static String Decode(String filename){
    try {
      File file = new File(filename);
      Scanner a = new Scanner(file);
      String ans = "";
      for (int i = 0; i < a.nextLine().length(); i++){
        Scanner b = new Scanner(file);
        ans += findMax(b, i);
      }
      
      a.close();
      return ans;
    }catch (FileNotFoundException ex) {
      System.out.println("File not found" + filename);
      return "no";
  }
}
}
