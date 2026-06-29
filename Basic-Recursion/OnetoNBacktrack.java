import java.util.*;
public class OnetoNBacktrack {

    static void print_number(int i)
    {
        if(i<1)
        {
            return;
        }
        print_number(i-1);
        System.out.println(i);
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the value of N");
        int n=s.nextInt();
        print_number(n);
    }
}
