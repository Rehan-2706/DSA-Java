    import java.util.*;
public class array_deletion {
    public static void main(String []args){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter length of array");
        int n=s.nextInt();
        int arr[]=new int[n];
        System.out.println("enter array elements");
        for(int i=0;i<n;i++)
        {
            arr[i]=s.nextInt();
        }
        System.out.println("Array before Deletion : ");
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println("\nEnter position to Delete");
        int pos=s.nextInt();
        for(int i=pos;i<n-1;i++)
        {
            arr[i]=arr[i+1];
        }
        n--;
          System.out.println("Array After Deletion : ");
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}

