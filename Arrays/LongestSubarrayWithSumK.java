import java.util.Scanner;

public class LongestSubarrayWithSumK {

    static int findSubArray(int[] arr, int k) {
        int longest = 0;
        int sum = arr[0];
        int left = 0;
        int right = 0;
        while (right < arr.length) {
            while (left <= right && sum > k) {
                sum = sum - arr[left];
                left++;
            }
            if (sum == k) {
                longest = Math.max(longest, right - left + 1);
            }
            right++;
            if (right < arr.length) {
                sum += arr[right];
            }
        }
        return longest;
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
        System.out.println("Enter the value of k ");
        int k = s.nextInt();
        int l = findSubArray(arr, k);
        System.out.println("Longest SubArray with sum K : " + l);
    }

}
