import java.util.*;

public class RemoveDuplicates {
    static int removeduplicate(int[] arr) {
        int i = 0;
        for (int j = 1; j < arr.length; j++) {
            if (arr[i] != arr[j]) {
                arr[i + 1] = arr[j];
                i++;
            }
        }
        return i + 1;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter size of array ");
        int n = s.nextInt();
        System.out.println("Enter Array elements ");
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }
        int x = removeduplicate(arr);
        System.out.println("No. Of Unique elements are : " + x);
        System.out.println("Array After Shifting Duplicates : ");
        for (int i = 0; i < x; i++) {
            System.out.print(arr[i] + "  ");
        }
    }
}
