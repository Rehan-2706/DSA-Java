import java.util.*;
public class NtoOneBacktrack {
    static void print_number(int i,int n)
    {
        if(i>n)
        {
            return;
        }
        print_number(i+1, n);
        System.out.println(i);
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter value of N");
        int n=s.nextInt();
        print_number(1, n);
    }
}
