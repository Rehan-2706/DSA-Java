import java.lang.reflect.Array;
import java.util.*;

public class MajorityElement2 {

    static ArrayList<Integer> findMajority(int[] arr) {
        int count1 = 0;
        int count2 = 0;
        int candidate1 = 0;
        int candidate2 = 0;

        for (int num : arr) {
            if (num == candidate1) {
                count1++;
            } else if (num == candidate2) {
                count2++;
            } else if (count1 == 0) {
                candidate1 = num;
                count1 = 1;
            } else if (count2 == 0) {
                candidate2 = num;
                count2 = 1;
            } else {
                count1--;
                count2--;
            }
        }
        count1 = 0;
        count2 = 0;
        for (int num : arr) {
            if (num == candidate1) {
                count1++;
            } else if (num == candidate2) {
                count2++;
            }
        }
        ArrayList<Integer> list = new ArrayList<>();

        if (count1 > arr.length / 3) {
            list.add(candidate1);
        }
        if (count2 > arr.length / 3) {
            list.add(candidate2);
        }

        return list;
    }

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = s.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter array elements:");

        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }

        ArrayList<Integer> ans = findMajority(arr);

        System.out.println("Majority Elements are : ");
        for (int i = 0; i < ans.size(); i++) {
            System.out.print(ans.get(i) + " ");
        }
    }
}