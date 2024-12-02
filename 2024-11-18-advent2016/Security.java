import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;



public class Security{
    public static void main(String[] args) {
        System.out.println(sumSector("input.txt."));
      }
    
    public static String combine(String[] a){
        String ans ="";
        for (int i = 0; i < a.length - 1; i++){
            ans += a[i];
        }
        return ans;
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
    
    public static String findMax5(String a){
      String result = "";
      int[] count = new int[26];
        for(int j = 0; j <a.length(); j++){
            for( int i = 0; i < 26; i ++){
              char character = (char) (i + 97);
              if (a.charAt(j) == character) count[i]++;
             }
        }
      for(int x = 0; x < 5;x++){
        char ans = (char)(maxoflist(count) + 'a');
        result += ans;
        count[maxoflist(count)] = 0;
      }
    return result; 
  }
    
    
    public static int sumSector(String filename){
        try {
          File file = new File(filename);
          Scanner a = new Scanner(file);
          int answer = 0;
          while(a.hasNextLine()){
            String[]dir = a.nextLine().split("-");
            int sectorID = Integer.parseInt((dir[dir.length-1]).substring(0,3));
            String checksum = (dir[dir.length-1]).substring(4,9);
            if (findMax5(combine(dir)).compareTo(checksum) == 0) answer += sectorID;

            } 
            a.close();
            return answer;
          }catch (FileNotFoundException ex) {
          System.out.println("File not found" + filename);
          return 0;
      }
    }
}