public class Bathroom{
    public static void main(String[] args) {
        System.out.println(Decode("input.txt."));
      }
    
    public static int Decode(String filename){
        try {
          File file = new File(filename);
          Scanner a = new Scanner(file);

          a.close();
          return null;
        }catch (FileNotFoundException ex) {
          System.out.println("File not found" + filename);
          return -1;
      }
    }
}