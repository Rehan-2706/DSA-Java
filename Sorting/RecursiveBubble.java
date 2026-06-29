import java.util.*;
public class RecursiveBubble {
    static void bubble(int[] arr,int n)
    {
     if(n==1)
        return;
    int didswap=0;
    for(int j=0;j<=n-2;j++)
    {
        if(arr[j]>arr[j+1])
        {
            int temp=arr[j];
            arr[j]=arr[j+1];
            arr[j+1]=temp;
            didswap=1;
        }
    }

    if(didswap==0) return;
    bubble(arr,n-1);
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n;
        System.out.println("Enter size of array ");
        n=s.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter array elements");
        for(int i=0;i<n;i++)
        {
            arr[i]=s.nextInt();
        }
        System.out.println("Original array : ");
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(" "+arr[i]);
        }
        System.out.println();
        System.out.println("Array after sorting : ");
        bubble(arr,n);
            for(int i=0;i<arr.length;i++)
        {
            System.out.print(" "+arr[i]);
        }
    }
}
