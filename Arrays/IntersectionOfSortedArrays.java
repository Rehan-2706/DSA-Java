import java.util.ArrayList;
import java.util.Scanner;

public class IntersectionOfSortedArrays {
    static ArrayList<Integer> intersection(int[] arr1, int[] arr2) {
        int n = arr1.length;
        int m = arr2.length;
        ArrayList<Integer> list = new ArrayList<>();
        int i = 0;
        int j = 0;
        while (i < n && j < m) {
            if (arr1[i] < arr2[j]) {
                i++;
            } else if (arr1[i] > arr2[j]) {
                j++;
            } else {
                list.add(arr1[i]);
                i++;
                j++;
            }
        }
        return list;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter size of first array: ");
        int n = s.nextInt();

        System.out.print("Enter size of second array: ");
        int m = s.nextInt();

        int[] arr1 = new int[n];
        int[] arr2 = new int[m];

        System.out.println("Enter first array elements (sorted):");
        for (int i = 0; i < n; i++) {
            arr1[i] = s.nextInt();
        }

        System.out.println("Enter second array elements (sorted):");
        for (int i = 0; i < m; i++) {
            arr2[i] = s.nextInt();
        }
        ArrayList<Integer> list = intersection(arr1, arr2);

        System.out.println("Intersection of sorted arrays is : ");
        for (int x : list) {
            System.out.print(x + " ");
        }

    }
}
