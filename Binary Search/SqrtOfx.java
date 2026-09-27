import java.util.*;
public class SqrtOfx {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the value of x");
        int x=s.nextInt();
        int answer=getSqrt(x);
        System.out.println("Answer : "+answer);
    }
    static int getSqrt(int x){
        int low=1;
        int high=x;
        int answer=1;
        if (x==1) {
            return 0;
        }
        while (low<=high) {
            int mid=(low+(high-low)/2);

            long val=(long)mid*mid;
            if (val<=x) {
                answer=mid;
                low=mid+1;
            }else{
                high=mid-1;
            }
        }
        return answer;
    }
}
