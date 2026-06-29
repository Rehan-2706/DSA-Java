import java.util.*;
public class Sum_Of_N {
    static void sumofvalues(int i,int sum)
    {
        if(i<1)
        {
            System.out.println(sum);
            return;
        }
        sumofvalues(i-1, sum+i);
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the value of N");
        int n=s.nextInt();
        int sum=0;
        sumofvalues(n,sum);
    }
}
