import java.util.*;

public class UnionOfSortedArrays {

    static ArrayList<Integer> findUnion(int[] arr1, int[] arr2) {

        ArrayList<Integer> list = new ArrayList<>();

        int n = arr1.length;
        int m = arr2.length;

        int i = 0;
        int j = 0;

        while (i < n && j < m) {

            if (arr1[i] < arr2[j]) {

                if (list.isEmpty() || list.get(list.size() - 1) != arr1[i]) {
                    list.add(arr1[i]);
                }
                i++;

            } else if (arr2[j] < arr1[i]) {

                if (list.isEmpty() || list.get(list.size() - 1) != arr2[j]) {
                    list.add(arr2[j]);
                }
                j++;

            } else { // arr1[i] == arr2[j]

                if (list.isEmpty() || list.get(list.size() - 1) != arr1[i]) {
                    list.add(arr1[i]);
                }
                i++;
                j++;
            }
        }

        // Add remaining elements from arr1
        while (i < n) {
            if (list.isEmpty() || list.get(list.size() - 1) != arr1[i]) {
                list.add(arr1[i]);
            }
            i++;
        }

        // Add remaining elements from arr2
        while (j < m) {
            if (list.isEmpty() || list.get(list.size() - 1) != arr2[j]) {
                list.add(arr2[j]);
            }
            j++;
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

        ArrayList<Integer> union = findUnion(arr1, arr2);

        System.out.println("Union of the arrays:");
        for (int num : union) {
            System.out.print(num + " ");
        }

        s.close();
    }
}