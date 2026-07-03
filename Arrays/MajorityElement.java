import java.util.Scanner;

public class MajorityElement {

    static int findMajority(int[] arr) {
        int n = arr.length;
        int count = 0;
        int candidate = 0;
        for (int i = 0; i < arr.length; i++) {
            if (count == 0) {
                candidate = arr[i];
            }
            if (arr[i] == candidate) {
                count++;
            } else {
                count--;
            }
        }

        count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == candidate) {
                count++;
            }
        }
        if (count > n / 2) {
            return candidate;
        } else {
            return -1;

        }
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

        int majority = findMajority(arr);

        if (majority != -1)
            System.out.println("Majority Element is: " + majority);
        else
            System.out.println("No Majority Element");

        s.close();
    }
}