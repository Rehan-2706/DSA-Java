import java.util.*;

public class NtoOne {
    static void printnumber(int n) {
        if (n<1) {
            return;
        }
        System.out.println(n);
        printnumber(n-1);
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the value of N");
        int n = s.nextInt();
        printnumber(n);
    }
}
