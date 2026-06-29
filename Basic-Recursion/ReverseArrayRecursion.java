import java.util.*;
public class ReverseArrayRecursion {
    static void reverse(int arr[],int i,int n)
    {
        if(i>=n/2)
            return;
        int temp=arr[i];
         arr[i]=arr[n-i-1];
         arr[n-i-1]=temp;

         reverse(arr,i+1,n);
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter size of an array");
        int n=s.nextInt();
        System.out.println("Enter array elements");
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {

            arr[i]=s.nextInt();
        }
        reverse(arr,0,n);

        System.out.println("Array after reversal");
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}
