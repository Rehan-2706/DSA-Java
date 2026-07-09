import java.util.*;
public class ConcatenationOfArray
{
    static int[] cocatenate(int[] arr)
    {
        int n=arr.length;
        int temp[]=new int[2*n];

        for(int i=0;i<arr.length;i++)
        {
            temp[i]=arr[i];
            temp[i+n]=arr[i];
        }
        return temp;
    }
    public static void main(String[] args) 
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter size of Array");
        int n = s.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter Array Elements : ");
        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }
        System.out.println("Array before concatenation : ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]);
        }
        System.out.println();
        System.out.println("Array after concatenation : ");
        int newArr[]=cocatenate(arr);
        for (int i = 0; i < newArr.length; i++) {
            System.out.print(newArr[i]);
        }
}
}
