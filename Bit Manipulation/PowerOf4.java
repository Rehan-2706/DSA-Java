import java.util.*;
class PowerOf4{
    static boolean isPowerOf4(int n){
        if(n<1) return false;

        return ((n & n-1)==0 && (n-1)%3==0);
    }
    public static void main(String []args){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter a number to check whether it is power of 4 or not  ");
        int n=s.nextInt();
        if(isPowerOf4(n)){
            System.out.println("Given number is power of 4 ");
        }
        else{
            System.out.println("The Given number is not a power of 4 ");
        }
    }
}