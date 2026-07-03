import java.util.Scanner;

public class PrintSubarrayWithMaxSum {
    static void findSubArray(int[] arr) {
        int max = Integer.MIN_VALUE;
        int sum = 0;
        int start = 0;
        int ansstart = 0;
        int ansend = 0;
        for (int i = 0; i < arr.length; i++) {
            if (sum == 0) {
                start = i;
            }
            sum += arr[i];
            if (sum > max) {
                max = sum;
                ansstart = start;
                ansend = i;
            }

            if (sum < 0) {
                sum = 0;
            }
        }
        System.out.println(" Subarray wit maximum sum : ");
        for (int i = ansstart; i <= ansend; i++) {
            System.out.print(arr[i] + " ");
        }
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
        findSubArray(arr);

    }
}
