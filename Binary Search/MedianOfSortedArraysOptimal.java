
import java.util.Scanner;

public class MedianOfSortedArraysOptimal {

    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {

        int n1 = nums1.length;
        int n2 = nums2.length;

        // Binary search must be performed on the smaller array
        if (n1 > n2) {
            return findMedianSortedArrays(nums2, nums1);
        }

        int n = n1 + n2;
        int low = 0;
        int high = n1;

        while (low <= high) {

            int mid1 = low + (high - low) / 2;
            int mid2 = (n + 1) / 2 - mid1;

            int l1 = (mid1 == 0)
                    ? Integer.MIN_VALUE : nums1[mid1 - 1];

            int r1 = (mid1 == n1)
                    ? Integer.MAX_VALUE : nums1[mid1];

            int l2 = (mid2 == 0)
                    ? Integer.MIN_VALUE : nums2[mid2 - 1];

            int r2 = (mid2 == n2)
                    ? Integer.MAX_VALUE : nums2[mid2];

            // Valid partition
            if (l1 <= r2 && l2 <= r1) {

                // Odd total number of elements
                if (n % 2 == 1) {
                    return Math.max(l1, l2);
                }

                // Even total number of elements
                return ((double) Math.max(l1, l2)
                        + Math.min(r1, r2)) / 2.0;
            }

            // Move left
            else if (l1 > r2) {
                high = mid1 - 1;
            }

            // Move right
            else {
                low = mid1 + 1;
            }
        }

        return 0.0;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of first array: ");
        int n1 = sc.nextInt();

        int[] nums1 = new int[n1];

        System.out.println("Enter sorted elements of first array:");
        for (int i = 0; i < n1; i++) {
            nums1[i] = sc.nextInt();
        }

        System.out.print("Enter size of second array: ");
        int n2 = sc.nextInt();

        int[] nums2 = new int[n2];

        System.out.println("Enter sorted elements of second array:");
        for (int i = 0; i < n2; i++) {
            nums2[i] = sc.nextInt();
        }

        double median = findMedianSortedArrays(nums1, nums2);

        System.out.println("Median = " + median);

        sc.close();
    }
}
