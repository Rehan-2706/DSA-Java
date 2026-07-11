import java.util.*;
public class CountSubArraysWithSumK {
    static int countSubArray(int[] arr,int k)
    {
        HashMap<Integer,Integer> map=new HashMap<>();
        map.put(0, 1);
        int count=0;
        int sum=0;
        for(int i=0;i<arr.length;i++)
        {
            sum+=arr[i];

            if(map.containsKey(sum-k))
            {
                count+=map.get(sum-k);
            }
            map.put(sum, map.getOrDefault(sum, 0)+1);
        }
        return count;

    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n=s.nextInt();
        System.out.println("Enter array elements");
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=s.nextInt();
        }
        System.out.println("Enter the target value k");
        int k=s.nextInt();
        System.out.println("No. of subarrays that sums up to k are : "+countSubArray(arr,k));
    }
}
