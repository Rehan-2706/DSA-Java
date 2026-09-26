import java.util.*;

public class MinimumInRotatedSortedArray1 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter size of array");
        int n = s.nextInt();

        System.out.println("Enter array elements");
        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }

        int minimum = getMinimum(arr);

        System.out.println("Minimum element is: " + minimum);
    }

    static int getMinimum(int arr[]) {

        int low = 0;
        int high = arr.length - 1;
        int mini = Integer.MAX_VALUE;

        while (low <= high) {

            int mid = low + (high - low) / 2;

            // Case 1: current search space is already sorted
            if (arr[low] < arr[high]) {
                mini = Math.min(mini, arr[low]);
                break;
            }


            // Case 2: left half is sorted
            if (arr[low] <= arr[mid]) {

                mini = Math.min(mini, arr[low]);

                // Minimum must be in right half
                low = mid + 1;

            }

            // Case 3: right half is sorted
            else {

                mini = Math.min(mini, arr[mid]);

                // Minimum can be mid or in left half
                high = mid - 1;
            }
        }

        return mini;
    }
}