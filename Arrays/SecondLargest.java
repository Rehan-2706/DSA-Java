import java.util.*;

public class SecondLargest {
    static void secLargest(int[] arr) {
        int largest = arr[0];
        int slargest = Integer.MIN_VALUE;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > largest) {
                slargest = largest;
                largest = arr[i];
            } else if (arr[i] < largest && arr[i] > slargest) {
                slargest = arr[i];
            }
        }
        if (slargest == Integer.MIN_VALUE) {
            System.out.println("No Second largest element present");
        } else {
            System.out.println("Second Largest : " + slargest);

        }

    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter size of an array : ");
        int n = s.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter array elements : ");
        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }
        secLargest(arr);
    }
}
