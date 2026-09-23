import java.util.*;
public class MaximumProductSubarray {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter size of array ");
        int n=s.nextInt();
        System.out.println("Enter array elements");
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=s.nextInt();
        }
        int ans=getMaxProduct(arr);
        System.out.println("Maximum product of a subarray : "+ans);
    }
    static int getMaxProduct(int arr[]){
        int max=Integer.MIN_VALUE;
        int prefix=1;
        int suffix=1;
        int n=arr.length;
        for(int i=0;i<arr.length;i++){
            if (prefix==0) {
                prefix=1;
            }
            if (suffix==0) {
                suffix=1;
            }

            prefix*=arr[i];
            suffix*=arr[n-1-i];

            max=Math.max(max, Math.max(prefix,suffix));
        }
        return max;
    }
}
