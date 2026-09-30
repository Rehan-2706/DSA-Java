import java.util.*;

public class KthMissingPositiveBrute {

    public static int findKthPositive(int[] arr, int k) {

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] <= k) {
                k++;
            }
        }

        return k;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input array size
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        // Input array
        int[] arr = new int[n];

        System.out.println("Enter sorted array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Input k
        System.out.print("Enter k: ");
        int k = sc.nextInt();

        // Find kth missing positive
        int answer = findKthPositive(arr, k);

        System.out.println("Kth missing positive number: " + answer);

        sc.close();
    }
}