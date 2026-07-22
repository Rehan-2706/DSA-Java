import java.util.*;
class ContiguousUnsortedSubarray{

    static int getSubarryLength(int arr[],int n)
    {
        int left=-1;
        int right=-1;
        int max=arr[0];
        for(int i=1;i<arr.length;i++)
        {
            if(arr[i]<max)
            {
                right=i;
            }
            else{
                max=arr[i];
            }
        }
        int min=arr[n-1];

        for(int i=n-2;i>=0;i--)
        {
            if(arr[i]>min)
            {
                left=i;
            }
            else{
                min=arr[i];
            }
        }
        if(right==-1)
        {
            return 0;
        }

        return right-left+1;
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

        System.out.println("Length Of Contiguous Unsorted subarray is : "+getSubarryLength(arr,n));
}
}