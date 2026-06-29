import java.util.*;
public class fibonacciRecursion {
    static int fibo(int n)
    {
        if(n<=1)
            return n;
        int last=fibo(n-1);
        int slast=fibo(n-2);
        return last+slast;
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the term to print");
        int n=s.nextInt();
        System.out.println(fibo(n));
    }
}
