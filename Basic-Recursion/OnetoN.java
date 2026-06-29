import java.util.Scanner;
public class OnetoN {
    static void printnumber(int count,int n)
    {
         if(count>n)
            return;
        System.out.println(count);
        printnumber(count+1, n);
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the value of N");
        int n=s.nextInt();
        int count=0;
        printnumber(count, n);
    }
}
