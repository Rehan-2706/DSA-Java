import java.util.*;
public class sumofnoFunctional {
    static int sumation(int n)
    {
      if(n==0)  
        return 0;
    return n+sumation(n-1);
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the value of n");
        int n=s.nextInt();
        System.out.println("Sum of first "+n+" numbers is "+sumation(n));
    }
}
