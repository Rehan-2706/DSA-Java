import java.util.*;
public class MinimumOperationsToMakeSumDivByK{

    static int getOperations(int[] arr,int k)
    {
        int sum=0;

        for(int i=0;i<arr.length;i++)
        {
            sum+=arr[i];
        }
        return sum%k;
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter size of array");
        int n=s.nextInt();
        System.out.println("Enter array elements ");
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=s.nextInt();
        }
        System.out.println("Enter the value of K ");
        int k=s.nextInt();
        System.out.println("Minimum Operations to make array sum divisible by k : "+getOperations(arr,k));
    }
}