import java.util.*;
public class RepeatingAndMissingOptimal1 {
    public static void main(String[] args) {
         Scanner s=new Scanner(System.in);
        System.out.println("Enter size of array");
        int n=s.nextInt();
        System.out.println("Enter array elements ");
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=s.nextInt();
        }
        List<Long>ans=getValues(arr);
        System.out.println("Repeating and missing no. are : ");
        System.out.println(ans);
    }
    static  List<Long> getValues(int arr[]){
        ArrayList<Long> ans=new ArrayList<>();
        int n=arr.length;

        long s=0;
        long sn=((long)n*(n+1))/2;
        long s2n=0;
        long sn2=(((long) n*(n+1))*(2*n+1))/6;

        for(int i=0;i<arr.length;i++){
            s+=arr[i];
            s2n+=((long)arr[i]*arr[i]);
        }


        long val1=s-sn; //x-y
        long val2=s2n-sn2; // x^2-y^2

        val2=val2/val1; //x+y

        long x=(val1+val2)/2;
        long y=val2-x;

        ans.add(x);
        ans.add(y);
        return ans;
    }
}
