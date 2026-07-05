import java.util.Scanner;
import java.util.HashSet;

public class LongestConsecutiveSequence {

    static int findSequence(int[] arr) {
        if (arr.length == 0)
            return 0;
        HashSet<Integer> set = new HashSet<>();
        int longest = 1;
        int count = 0;
        for (int x : arr) {
            set.add(x);
        }

        for (int x : set) {
            if (!set.contains(x - 1)) {
                count = 1;
                int temp = x;
                while (set.contains(temp + 1)) {
                    temp += 1;
                    count++;
                }
            }
            longest = Math.max(longest, count);
        }
        return longest;

    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter size of array ");
        int n = s.nextInt();
        System.out.println("Enter array elements ");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }
        int l = findSequence(arr);
        System.out.println("Length of longest consecutive sequence in array is : " + l);
    }
}
