public class fib{
    public static int fibon(int n){
        if (n < 2) return n;
        else return fibon(n-1) + fibon(n - 2);
    }

    public static void main(String[] args){
        System.out.println(fibon(Integer.parseInt(args[0])));
    }
}
//largest fibonacci number you can calculate in under 10 seconds and also the largest n that does not overflow : 46
