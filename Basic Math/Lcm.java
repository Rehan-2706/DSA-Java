import java.util.*;
public class Lcm {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter two numbers to calculate their LCM");
        int n1=s.nextInt();
        int n2=s.nextInt();
        n1=Math.abs(n1);
        n2=Math.abs(n2);
        if(n1==0 && n2==0)
        {
            System.out.println("LCM does not exist if both the numbers are 0 ");
            return;
        }
        if(n1==0 || n2==0)
        {
            System.out.println("LCM = "+0);
            return;
        }
        int LCM=Math.max(n1, n2);
        while (true) {
            if(LCM%n1==0 && LCM%n2==0)
            {
                break;
            }
            LCM++;
        }
        System.out.println("LCM = "+LCM);
    }
}
