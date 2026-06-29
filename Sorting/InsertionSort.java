import java.util.*;
public class InsertionSort {
    static void insert(int[] arr,int n)
    {
        for(int i=0;i<n;i++)
        {
            int j=i;
            while(j>0&&arr[j-1]>arr[j])
            {
                int temp=arr[j-1];
                arr[j-1]=arr[j];
                arr[j]=temp;
                j--;
            }
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
        insert(arr,n);
    }
}
