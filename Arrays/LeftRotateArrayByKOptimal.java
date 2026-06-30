import java.util.*;

public class LeftRotateArrayByKOptimal {
    static void leftRotateByk(int[] arr, int n, int k) {

        k = k % n;
        reverse(arr, 0, k - 1);
        reverse(arr, k, n - 1);
        reverse(arr, 0, n - 1);
        System.out.println("Array after shifting to left by k places : ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "  ");
        }

    }

    static void reverse(int[] arr, int start, int end) {
        while (start <= end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter size of array ");
        int n = s.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter array elements ");
        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }
        System.out.println("Enter number of positions to shift left ");
        int k = s.nextInt();
        leftRotateByk(arr, n, k);
    }
}
