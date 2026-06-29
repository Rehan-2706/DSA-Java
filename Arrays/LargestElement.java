import java.util.*;
public class LargestElement
{
    static int largest(int[] arr)
    {
        int large=arr[0];
        for(int i=1;i<arr.length;i++)
        {
            if(arr[i]>large)
            {
                large=arr[i];
            }
        }
        return large;
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter size of Array");
        int n=s.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter Array Elements : ");
        for(int i=0;i<n;i++)
        {
            arr[i]=s.nextInt();
        }
        int large=largest(arr);
        System.out.println("Largest Element : "+large);

    }
}