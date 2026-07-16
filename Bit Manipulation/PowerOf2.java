import java.util.*;
public class PowerOf2 {
    static boolean isPowerOf2(int n){
        if(n<=0) return false;

        return (n&(n-1))==0;
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter a number to check whether it is power of 2 or not ");
        int n=s.nextInt();
        if(isPowerOf2(n)){
            System.out.println("Given number is power of 2 ");
        }
        else{
            System.out.println("The Given number is not a power of 2 ");
        }
    }
}
