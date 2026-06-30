import java.util.*;

public class LeftRotateByOne {
    static void leftRotate(int[] arr, int n) {
        int temp = arr[0];
        for (int i = 1; i < n; i++) {
            arr[i - 1] = arr[i];
        }
        arr[n - 1] = temp;
        System.out.println("Array after rotating left by one place : ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "  ");
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Size of Array : ");
        int n = s.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter array elements");
        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }
        leftRotate(arr, n);
    }
}