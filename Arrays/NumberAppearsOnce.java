
// This approach works only when every element appears exactly twice
// except one element, which appears only once.import java.util.Scanner;
import java.util.*;

public class NumberAppearsOnce {
    static int findNumber(int[] arr) {
        int xor = 0;
        for (int i = 0; i < arr.length; i++) {
            xor = xor ^ arr[i];
        }
        return xor;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter length of array");
        int n = s.nextInt();
        int arr[] = new int[n];
        System.out.println("enter array elements");
        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }
        int element = findNumber(arr);
        System.out.println("The number that appears only once is : " + element);
    }
}
