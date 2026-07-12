import java.util.*;
public class BuildArrayFromPermutation {
    static int[] buildPermutation(int[] arr)
    {
        int newArray[]=new int[arr.length];

        for(int i=0;i<arr.length;i++)
        {
            newArray[i]=arr[arr[i]];
        }
        return newArray;
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter size of array ");
        int n=s.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter array Elements ");
        for(int i=0;i<n;i++)
        {
            arr[i]=s.nextInt();
        }
        System.out.println("Original Array : ");
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        int temp[]=buildPermutation(arr);
        System.out.println("New Array : ");
        for(int i=0;i<temp.length;i++)
        {
            System.out.print(temp[i]+" ");
        }
    }
}
