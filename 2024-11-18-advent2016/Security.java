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

    public static String topFive( ArrayList<String[]> a){
        ArrayList<String[]> newarry = new ArrayList<String[]>();
        String ans = "";
        while(a.length > 0){
            
        }
    }
    
    public static ArrayList<String[]> sumSector(String filename){
        try {
          File file = new File(filename);
          Scanner a = new Scanner(file);
          while(a.hasNextLine()){
            String[]dir = a.nextLine().split("-");
            int sectorID = Integer.parseInt((dir[dir.length-1]).substring(0,3));
            String checksum = (dir[dir.length-1]).substring(4,9);
            
            char[] characters= combine(dir).toCharArray();
            Arrays.sort(characters);
            ArrayList<String[]> results = new ArrayList<String[]>();
            while(characters.length > 0){
                int counter = 1;
                int i = 0; 
                while(characters[i] == (characters[i+1])){
                    counter ++ ;
                    i ++;
                }
                String[] arry = { counter + "" , characters[0] + ""};
                results.add(arry);
                characters = Arrays.copyOfRange(characters, i + 1, characters.length);
            }

            }
            a.close();
          }catch (FileNotFoundException ex) {
          System.out.println("File not found" + filename);
          return null;
      }
    }
}