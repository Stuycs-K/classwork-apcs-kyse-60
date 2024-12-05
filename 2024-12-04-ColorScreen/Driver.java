

public class Driver{
    public static void main(String[] args){
        border(30,80);
        //System.out.print("\033[0m");
    }
    public static void border(int height, int length){
        for(int j = 0; j <=length; j ++){
            Text.go(0,j);
            Text.color(Text.background(Text.RED));
            System.out.print(" ");
        }
        for(int i = 1; i < height; i++){
            Text.go(i,0);
            Text.color(Text.background(Text.RED));
            System.out.print(" ");
            Text.go(i,length);
            Text.color(Text.background(Text.RED));
            System.out.print(" ");
                
            }
        for(int j = 0; j <=length; j ++){
            Text.go(height,j);
            Text.color(Text.background(Text.RED));
            System.out.print(" ");
        }
    }

    public static void threeRandoms(int rownumber, int rowlenght){
        for(in)
    }
}