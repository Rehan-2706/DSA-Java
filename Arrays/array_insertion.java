import java.util.*;
public class array_insertion {
    public static void main(String []args){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter length of array");
        int n=s.nextInt();
        int arr[]=new int[n+1];
        System.out.println("enter array elements");
        for(int i=0;i<n;i++)
        {
            arr[i]=s.nextInt();
        }
        System.out.println("Array before insertion : ");
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println("\nEnter value and position to insert");
        int val=s.nextInt();
        int pos=s.nextInt();
        for(int i=n-1;i>=pos;i--)
        {
            arr[i+1]=arr[i];
        }
        arr[pos]=val;
          System.out.println("Array After insertion : ");
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}
