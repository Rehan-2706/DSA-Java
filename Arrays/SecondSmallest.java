import java.util.*;

public class SecondSmallest {
    static void secSmallest(int[] arr) {
        int smallest = arr[0];
        int sSmallest = Integer.MAX_VALUE;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < smallest) {
                sSmallest = smallest;
                smallest = arr[i];
            } else if (arr[i]>smallest && arr[i] < sSmallest) {
                sSmallest = arr[i];
            }
        }
        if (sSmallest == Integer.MAX_VALUE) {
            System.out.println("No Second smallest element present");
        } else {
            System.out.println("Second smallest : " + sSmallest);

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
        secSmallest(arr);
    }
}
