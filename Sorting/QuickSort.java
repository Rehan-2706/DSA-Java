import java.util.*;

public class QuickSort {

    static void quicksort(int[] arr, int low, int high) {
        if (low < high) {
            int partitionindex = partition(arr, low, high);
            quicksort(arr, low, partitionindex - 1);
            quicksort(arr, partitionindex + 1, high);
        }
    }

    static int partition(int[] arr, int low, int high) {
        int pivot = arr[low];
        int i = low;
        int j = high;
        while (i < j) {
            while (arr[i] <= pivot && i <= high - 1) {
                i++;
            }
            while (arr[j] > pivot && j >= low + 1) {
                j--;
            }
            if (i < j) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        int temp = arr[j];
        arr[j] = arr[low];
        arr[low] = temp;

        return j;

    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Size of Array : ");
        int n = s.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter Array elements ");
        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }
        System.out.println("Original Array : ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.println("Array After Sorting : ");
        quicksort(arr, 0, n - 1);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
