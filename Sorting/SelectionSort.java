import java.util.*;
public class SelectionSort {
    static void selection(int[] arr,int n)
    {
        for(int i=0;i<=n-2;i++)
        {
            int minindex=i;
            for(int j=i+1;j<=n-1;j++)
            {
                if(arr[j]<arr[minindex])
                {
                    minindex=j;
                }
            }
            int temp=arr[minindex];
            arr[minindex]=arr[i];
            arr[i]=temp;
        }
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(" "+arr[i]);
        }
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
        selection(arr,n);
    }
}
