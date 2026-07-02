import java.util.Scanner;

public class SortArraysOf0_1_2 {
    static void sortArray(int []arr)
    {
        int low=0;
        int mid=0;
        int high=arr.length-1;

        while(mid<=high)
        {
            if(arr[mid]==0)
            {
                int temp=arr[mid];
                arr[mid]=arr[low];
                arr[low]=temp;
                low++;
                mid++;
            }
            else if(arr[mid]==1)
            {
                mid++;
            }
            else
            {
                int temp=arr[mid];
                arr[mid]=arr[high];
                arr[high]=temp;
                high--;
            }
        }
    }
    public static void main(String[] args) {
         Scanner s = new Scanner(System.in);
        System.out.println("Enter size of Array");
        int n = s.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter Array Elements : ");
        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }
        sortArray(arr);
        System.out.println("Array After Sorting : ");
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}
