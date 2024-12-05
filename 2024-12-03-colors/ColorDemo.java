public class ColorDemo{
    public static final String CLEAR_SCREEN =  "\u001b[2J";
    public static final String HIDE_CURSOR =  "\u001b[?25l";
    public static final String SHOW_CURSOR =  "\u001b[?25h";
    public static int BLACK = 30;
    public static int RED = 31;

    public static void color(int foreground,int background){
    System.out.print( "\u001b[" + foreground + ";" + (10+background) + "m");
    }

    public static void color(int foreground, int background, int modifier) {
        System.out.print("\u001b[" + foreground + ";" + (10 + background) + ";" + modifier + "m");
    }

    public static void go(int r,int c){
        System.out.print("\u001b[" + r + ";" + c + "f");
      }
    public static void main(String[] args){
        //go(1,2);
        color(BLACK, RED, RED);
        System.out.println("different color");
        //System.out.println("\u001b[31m");
        //System.out.println("now its red");
        System.out.println("\u001b[0m");
        System.out.println("set back to normal");
        
        for(int r = 0; r < 256; r+=32){
            for(int g = 0; g <= 256; g+=32){
              for(int b = 0; b <= 256; b+=32){
                System.out.print("\u001b[38;2;"+r+";"+g+";"+b+";7m.");
              }
            }
              System.out.println();
          }
              
    }
}