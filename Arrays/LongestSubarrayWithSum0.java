
//This code will work for positives,negetives and zeros as well
import java.util.HashMap;
import java.util.Scanner;

public class LongestSubarrayWithSum0 {

    static int findSubArray(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int longest = 0;
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            if (sum == 0) {
                longest = i + 1;
            }
            if (map.containsKey(sum)) {
                longest = Math.max(longest, i - map.get(sum));
            }
            if (!map.containsKey(sum)) {
                map.put(sum, i);
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
        int l = findSubArray(arr);
        System.out.println("Longest SubArray with sum 0 : " + l);
    }

}
