public class Words{
    public static void makeWords( int remaining , String result, String alphabet){
        if (remaining == 0) System.out.println(result);
        else{ 
            for(int i = 0; i < alphabet.length(); i++){
                makeWords(remaining - 1, result + alphabet.charAt(i), alphabet);
            }
        }
    }
/* 
    public static String toWords(int x){
        if (x < 10){

        }
    }
*/
    public static void main(String[] args){
        makeWords(Integer.parseInt(args[0]), "", args[1]);
        //makeWords(0, "", "abc");
    }
}
