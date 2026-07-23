import java.util.*;

public class MergeWithoutExtraSpace {

    static void swap(int arr1[],int arr2[],int index1,int index2)
    {
        if(arr1[index1]>arr2[index2])
        {
            int temp=arr1[index1];
            arr1[index1]=arr2[index2];
            arr2[index2]=temp;
        }
    }

    static void merge(int arr1[],int arr2[])
    {
        int n=arr1.length;
        int m=arr2.length;

        int total=n+m;

        int gap=(total/2)+(total%2);

        while(gap>0)
        {
            int left=0;
            int right=left+gap;

            while(right<total)
            {
                if(left<n && right<n)
                {
                    swap(arr1,arr1,left,right);
                }
                else if(left<n && right>=n)
                {
                    swap(arr1,arr2,left,right-n);
                }
                else 
                {
                    swap(arr2,arr2,left-n,right-n);
                }
                left++;
                right++;
            }
            if(gap==1)
            {
                break;
            }
            gap=(gap/2)+(gap%2);
        }
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of first array: ");
        int n = sc.nextInt();

        System.out.print("Enter size of second array: ");
        int m = sc.nextInt();

        int[] arr1 = new int[n];
        int[] arr2 = new int[m];

        System.out.println("Enter elements of first sorted array:");
        for (int i = 0; i < n; i++) {
            arr1[i] = sc.nextInt();
        }

        System.out.println("Enter elements of second sorted array:");
        for (int i = 0; i < m; i++) {
            arr2[i] = sc.nextInt();
        }

        merge(arr1, arr2);

        System.out.println("First Array:");
        System.out.println(Arrays.toString(arr1));

        System.out.println("Second Array:");
        System.out.println(Arrays.toString(arr2));

        sc.close();
    }
}