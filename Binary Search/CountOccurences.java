import java.util.Scanner;
public class CountOccurences {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("Enter size of array:");
        int n = s.nextInt();

        int[] nums = new int[n];

        System.out.println("Enter sorted array elements:");
        for (int i = 0; i < n; i++) {
            nums[i] = s.nextInt();
        }

        System.out.println("Enter target:");
        int target = s.nextInt();
        int ans=searchRange(nums, target);
        System.out.println("Count : "+ans);

        s.close();
    }

    static int searchRange(int[] nums, int target) {

        int getFirst = lowerBound(nums, target);

        // Target does not exist
        if (getFirst == nums.length || nums[getFirst] != target) {
            return -1;
        }

        int getSecond = upperBound(nums, target)-1;

        return (getSecond-getFirst) +1;
    }

    // First index where arr[index] >= target
    static int lowerBound(int[] arr, int target) {

        int low = 0;
        int high = arr.length - 1;
        int lowBound = arr.length;

        while (low <= high) {

            int mid = low + (high - low) / 2;

            if (arr[mid] >= target) {
                lowBound = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return lowBound;
    }

    // First index where arr[index] > target
    static int upperBound(int[] arr, int target) {

        int low = 0;
        int high = arr.length - 1;
        int upperBound = arr.length;

        while (low <= high) {

            int mid = low + (high - low) / 2;

            if (arr[mid] > target) {
                upperBound = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return upperBound;
    }
}

