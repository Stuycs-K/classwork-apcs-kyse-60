import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TriangleTester{
  public static void main(String[] args){

    System.out.println(isTriangle(3,4,5) + " should print true");
    System.out.println(isTriangle(5,10,25) + " should print false");

    System.out.println("---- TEST CASES----");

    System.out.println(countTrianglesA("inputTri.txt") + " should print 2 at first");
    System.out.println(countTrianglesB("inputTri.txt") + " should print 2 at first");
}

  public static int countTrianglesA(String filename){
    try {
      File file = new File(filename);
      Scanner a = new Scanner(file);
      int ans = 0;
      while(a.hasNextLine()){
        if (isTriangle(a.nextInt(), a.nextInt(), a.nextInt())) ans++;
      }
      return ans;
    } catch (FileNotFoundException ex) {
      System.out.println("File not found");
      return -1;
    }
  }

  public static int countTrianglesB(String filename){
    try{
      File file = new File(filename);
      Scanner a = new Scanner(file);
      int ans = 0;
      while(a.hasNextLine()){
        Scanner x = new Scanner(a.nextLine());
        Scanner y = new Scanner(a.nextLine());
        Scanner z = new Scanner(a.nextLine());
/* 
        String x = a.nextLine();
        String y = a.nextLine();
        String z = a.nextLine();
        */
        for(int j = 0; j < 3; j++){
          if (isTriangle(x.nextInt(), y.nextInt(), z.nextInt())) ans++;
        }
        a.hasNextLine();
        a.hasNextLine();
      }
      return ans;
    }catch(FileNotFoundException ex){
      System.out.println("File not found");
      return -1;
    }
  }

  public static boolean isTriangle(int a , int b, int c){
    boolean x = (a + b > c);
    boolean y = (a + c > b);
    boolean z = (c + b > a);

    return (x && y && z);
  }

}
