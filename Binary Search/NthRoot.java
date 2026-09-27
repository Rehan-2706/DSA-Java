import java.util.*;
public class NthRoot {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the value of m");
        int m=s.nextInt();
        System.out.println("Enter the value of n");
        int n=s.nextInt();
        System.out.println("Nth Root of M : "+getRoot(n,m));
    }
    static int getRoot(int n,int m){
        int low=1;
        int high=m;
        while (low<=high) {
            int mid=(low+(high-low)/2);
            int val=getValue(n,mid,m);
            if (val==1) {
                return mid;
            }else if (val==0) {
                low=mid+1;
            }else{
                high=mid-1;
            }
        }
        return -1;
    }
    static int getValue(int n,int mid,int m){
        long ans=1;
        for(int i=1;i<=n;i++){
             ans*=(long)mid;


             if (ans>m) {
                return 2;
             }

        }
        if (ans==m) {
            return 1;
        }else{
            return 0;
        }
    }
}
