import java.util.*;

public class RightRotateBykBruteForce {
    static void rightRotateByk(int[] arr, int n, int k) {
        k = k % n;
        int temp[] = new int[k];
        for (int i = n - k; i < n; i++) {
            temp[i - (n - k)] = arr[i];
        }
        for (int i = n - k - 1; i >= 0; i--) {
            arr[i + k] = arr[i];
        }
        for (int i = 0; i < k; i++) {
            arr[i] = temp[i];
        }
        System.out.println("Array after shifting to right by k places : ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "  ");
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
        System.out.println("Enter number of positions to shift right ");
        int k = s.nextInt();
        rightRotateByk(arr, n, k);
    }
}
