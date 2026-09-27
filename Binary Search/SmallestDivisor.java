import java.util.*;

public class SmallestDivisor {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        // Input size
        System.out.println("Enter size of array:");
        int n = s.nextInt();

        // Input array
        int nums[] = new int[n];

        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            nums[i] = s.nextInt();
        }

        // Input threshold
        System.out.println("Enter threshold:");
        int threshold = s.nextInt();

        // Find smallest divisor
        int answer = smallestDivisor(nums, threshold);

        System.out.println("Smallest Divisor: " + answer);

        s.close();
    }

    static int smallestDivisor(int[] nums, int threshold) {

        int low = 1;
        int high = getMaxElement(nums);
        int answer = -1;

        while (low <= high) {

            int mid = low + (high - low) / 2;

            int value = getDivisor(nums, mid);

            if (value <= threshold) {

                // mid is a valid divisor
                answer = mid;

                // Try to find a smaller divisor
                high = mid - 1;

            } else {

                // Divisor is too small
                low = mid + 1;
            }
        }

        return answer;
    }

    static int getMaxElement(int nums[]) {

        int max = nums[0];

        for (int i = 1; i < nums.length; i++) {

            if (nums[i] > max) {
                max = nums[i];
            }
        }

        return max;
    }

    static int getDivisor(int nums[], int mid) {

        int sum = 0;

        for (int i = 0; i < nums.length; i++) {

            sum += (int) Math.ceil((double) nums[i] / mid);
        }

        return sum;
    }
}