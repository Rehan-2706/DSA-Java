import java.util.*;
public class ReverseArray {
    static void reverse(int arr[],int start,int end)
    {
        while(start<end)
        {
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;

            start++;
            end--;
        }
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter Size of an array");
        int n=s.nextInt();
        System.out.println("Enter array elements");
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=s.nextInt();
        }
        System.out.println("Original Array : ");
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+"  ");
        }
        System.out.println();
        int start=0;
        int end=arr.length-1;
        reverse(arr,start,end);
        System.out.println("Array after reversal : ");
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+"  ");
        }
    }
}
