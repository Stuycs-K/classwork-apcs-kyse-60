

public class Driver{
    public static void main(String[] args){
        System.out.print(Text.HIDE_CURSOR);
        System.out.print(Text.CLEAR_SCREEN);
        border(30,80);
        threeRandoms(2, 80);
        line(0,3,80);
        Text.go(15,20);
        Text.color(Text.MAGENTA);
        System.out.print("This is my creative drawing of words and wisdom!");
        Text.go(31,0);
        System.out.print(Text.RESET);
    }
    public static void border(int height, int length){
        for(int j = 1; j <=length; j ++){
            Text.go(0,j);
            Text.color(Text.background(Text.BLUE));
            System.out.print("= ");
        }
        for(int i = 2; i < height ; i++){
            Text.go(i,0);
            Text.color(Text.background(Text.BLUE));
            System.out.print("| ");
            Text.go(i,length);
            Text.color(Text.background(Text.BLUE));
            System.out.print("|");
                
            }
        for(int j = 1; j <=length ; j ++){
            Text.go(height,j);
            Text.color(Text.background(Text.BLUE));
            System.out.print(" =");
        }
    }

    public static void threeRandoms(int rownumber, int rowlength){
        int column = 0;
        for(int i = 0; i < 3; i++){
            column += rowlength/4 ;
            Text.go(rownumber, column);
            int num = (int) (Math.random() * 99);
            if (num < 25)
                Text.color(Text.RED);
            if (num > 75) 
                Text.color(Text.GREEN);
            else
                Text.color(Text.WHITE);
            System.out.println(num );
        }
    }

    public static void line (int rownumber, int length, int startrow){
        for(int j = startrow; j <=length; j ++){
            Text.go(rownumber,j);
            Text.color(Text.background(Text.BLUE));
            System.out.print("-");
        }
    }

}