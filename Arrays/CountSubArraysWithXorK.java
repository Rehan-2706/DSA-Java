import java.util.*;
public class CountSubArraysWithXorK {
    static int countSubArray(int[] arr,int k)
    {
        HashMap<Integer,Integer> map=new HashMap<>();
        int count=0;
        int xor=0;
        map.put(0, 1);
        for(int i=0;i<arr.length;i++)
        {
            xor=xor^arr[i];

            int x=xor^k;

            if(map.containsKey(x))
            {
                count+=map.get(x);
            }
            map.put(xor, map.getOrDefault(xor, 0)+1);
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
        System.out.println("No. of subarrays with Xor K are : "+countSubArray(arr,k));
    }
}
