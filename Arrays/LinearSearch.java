import java.util.*;

public class LinearSearch {
    static int linearSearch(int[] arr, int key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter size of array ");
        int n = s.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter array elements");
        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }
        System.out.println("Enter element to search");
        int key = s.nextInt();
        int index = linearSearch(arr, key);
        if (index != -1) {
            System.out.println("Element is present at index " + index);
        } else {
            System.out.println("Element is not present");
        }
    }
}
