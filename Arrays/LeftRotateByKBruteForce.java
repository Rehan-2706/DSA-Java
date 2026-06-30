import java.util.*;

public class LeftRotateByKBruteForce {
    static void lefRotateByk(int[] arr, int n, int k) {

        int temp[] = new int[n];
        k = k % n;
        for (int i = 0; i < k; i++) {
            temp[i] = arr[i];
        }
        for (int i = k; i < arr.length; i++) {
            arr[i - k] = arr[i];
        }
        int j = 0;
        for (int i = n - k; i < n; i++) {
            arr[i] = temp[j];
            j++;
        }
        System.out.println("Array after shifting to left by k places : ");
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
        System.out.println("Enter number of positions to shift left ");
        int k = s.nextInt();
        lefRotateByk(arr, n, k);
    }
}
