import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;



public class Security{
    public static void main(String[] args) {
        System.out.println(sumSector("input.txt."));
      }
    
    public static int sumSector(String filename){
        try {
          File file = new File(filename);
          Scanner a = new Scanner(file);
          while(a.hasNextLine()){
            String[]dir = a.nextLine().split("-");
            int sectorID = Integer.parseInt((dir[dir.length-1]).substring(0,3));
            String checksum = (dir[dir.length-1]).substring(4,9);
            
            char[] characters= combine(dir).toCharArray();     // this includes the [asdkasdas] code make sure u change it
            Arrays.sort(characters);
            String [][] results = new String[26][2];            // ASCII EXISTS make a 1d array of ints[26] 0 corresponds to 'a'
            for(int i = 0; characters.length > 0; i++){
                int count = 1;
                while(characters[i] == (characters[i+1])){
                    i ++;
                }
                results[i][0] = 
                String[] arry = { counter + "" , characters[0] + ""};
                results.add(arry);
                characters = Arrays.copyOfRange(characters, i + 1, characters.length);
            }

            }
            return null; 
            a.close();
          }catch (FileNotFoundException ex) {
          System.out.println("File not found" + filename);
          return null;
      }
    }
}