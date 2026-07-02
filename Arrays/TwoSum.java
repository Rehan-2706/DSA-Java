import java.util.HashMap;
import java.util.Scanner;

public class TwoSum {

    static int[] findIndices(int[] arr, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            int compliment = target - arr[i];
            if (map.containsKey(compliment)) {
                return new int[] { map.get(compliment), i };
            } else {
                map.put(arr[i], i);
            }
        }
        return new int[] { -1, -1 };
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter size of Array");
        int n = s.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter Array Elements : ");
        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }
        System.out.println("Enter target Value");
        int target = s.nextInt();
        int arr2[] = findIndices(arr, target);
        System.out.println("The two indices that sums up to the target are " + arr2[0] + " and " + arr2[1]);
    }
}
