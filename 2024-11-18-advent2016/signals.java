import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayList;


public class signals{
  public static void main(String[] args) {
    System.out.println(Decode("input.txt."));
  }

  public static String maxoflist(ArrayList<character> a){
    ArrayList<Character , Integer> answer = new ArrayList<Character , Integer>();
    for( int i = 0 ; i < a.size(); i++){
        
    }
  }

  public static String findMax(Scanner scan , int index){
    ArrayList<character> result = new ArrayList<character>();

    while( scan.hasNextLine()){
        String a = scan.nextLine();
        if(index != a.length()-1 ){
            result.add(a.substring(index,index + 1));
        }
        else result.add(a.substring(a.length()-1));
    }


  }

  public static String Decode(String filename){
    try {
      File file = new File(filename);
      Scanner a = new Scanner(file);
      for (int i = 0; i < a.nextLine().length(); i++){
        Scanner b = new Scanner(file);

      }

      
      
      a.close();
      return null;
    }catch (FileNotFoundException ex) {
      System.out.println("File not found" + filename);
      return "no";
  }
}
}
