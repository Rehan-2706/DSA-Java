import java.util.Scanner;

public class MissingNumber {

        static int findMissing(int[] arr)
        {
            int n=arr.length;
            int totalsum=(n*(n+1))/2;
            int sum=0;
            for(int i=0;i<n;i++)
            {
                sum+=arr[i];
            }

            return totalsum-sum;
        }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter length of array");
        int n=s.nextInt();
        int arr[]=new int[n];
        System.out.println("enter array elements");
        for(int i=0;i<n;i++)
        {
            arr[i]=s.nextInt();
        }
        int missing=findMissing(arr);
        System.out.println("Missing Number is Array : "+missing);
    }
}
