import java.util.*;
public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        for(int i=0;i<=num ;i++){
            System.out.print(fib(i)+" ");
        }
    }

    public static int fib(int num) {
        if (num <= 0) return 0;
        if (num == 1) return 1;
        return fib(num-1) + fib(num-2);
    }
}
