import java.util.*;
public class MergeSort
{
    static void mergesort(int[] arr,int low,int high)
    {
        if(low>=high)
            return;
        int mid=(low+high)/2;

        mergesort(arr,low,mid);
        mergesort(arr,mid+1,high);
        merge(arr,low,mid,high);
    }
    static void merge(int[] arr,int low,int mid,int high)
    {
        int left=low;
        int right=mid+1;

        List<Integer> temp=new ArrayList<>();

        while(left<=mid && right<=high)
        {
            if(arr[left]<=arr[right])
            {
                temp.add(arr[left]);
                left++;
            }
            else{
                temp.add(arr[right]);
                right++;
            }
        }
        while(left<=mid)
        {
            temp.add(arr[left]);
            left++;
        }
         while(right<=high)
        {
            temp.add(arr[right]);
            right++;
        }
        int k=0;
        for(int i=low;i<=high;i++)
        {
            arr[i]=temp.get(k);
            k++;
        }
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter Size of Array");
        int n=s.nextInt();
        int []arr=new int[n];
        System.out.println("Enter Array Elements");
        for(int i=0;i<n;i++)
        {
            arr[i]=s.nextInt();
        }
        System.out.println("Original Array : ");
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
        mergesort(arr,0,n-1);
        System.out.println();
        System.out.println("Array After SOrting : ");
         for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}