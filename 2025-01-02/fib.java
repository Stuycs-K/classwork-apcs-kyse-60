public class fib{
    public static int fibon(int n){
        if (n < 2) return n;
        else return fibon(n-1) + fibon(n - 2);
    }

    public static void main(String[] args){
        System.out.println(fibon(Integer.parseInt(args[0])));
    }
}