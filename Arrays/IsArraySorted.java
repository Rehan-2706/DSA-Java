import java.util.*;
public class IsArraySorted {
    static boolean checkSorted(int[] arr)
    {
        for(int i=1;i<arr.length;i++)
        {
            if(arr[i]>=arr[i-1])
            {

            }
            else
            {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter size of array ");
        int n=s.nextInt();
        System.out.println("Enter array elements ");
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=s.nextInt();
        }
        boolean isSorted=checkSorted(arr);
        if(isSorted)
        {
            System.out.println("Array is Sorted ");
        }
        else
        {
            System.out.println("Array is not sorted");
        }
    }
}
