import java.util.*;

public class PeakElement {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int peakIndex = findPeak(arr);

        System.out.println("Peak element = " + arr[peakIndex]);
        System.out.println("Peak index = " + peakIndex);

        sc.close();
    }

    static int findPeak(int[] arr) {

        int n = arr.length;

        // Only one element
        if (n == 1) {
            return 0;
        }

        // Check first element
        if (arr[0] > arr[1]) {
            return 0;
        }

        // Check last element
        if (arr[n - 1] > arr[n - 2]) {
            return n - 1;
        }

        int low = 1;
        int high = n - 2;

        while (low <= high) {

            int mid = low + (high - low) / 2;

            // mid is a peak
            if (arr[mid] > arr[mid - 1] &&
                arr[mid] > arr[mid + 1]) {

                return mid;
            }

            // We are on the increasing slope
            if (arr[mid] < arr[mid + 1]) {
                low = mid + 1;
            }

            // We are on the decreasing slope
            else {
                high = mid - 1;
            }
        }

        return -1;
    }
}