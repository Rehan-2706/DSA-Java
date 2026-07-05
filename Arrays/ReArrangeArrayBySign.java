import java.util.*;

public class ReArrangeArrayBySign {
    static int[] arrangeArray(int[] arr) {
        int temp[] = new int[arr.length];
        int positive = 0;
        int negetive = 1;
        for (int i : arr) {
            if (i > 0) {
                temp[positive] = i;
                positive += 2;
            }
            if (i < 0) {
                temp[negetive] = i;
                negetive += 2;
            }
        }
        return temp;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter size of the array");
        int n = s.nextInt();
        System.out.println("Enter array elements ");
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }
        int temp[] = arrangeArray(arr);
        System.out.println("Array after arrangement : ");
        for (int i = 0; i < temp.length; i++) {
            System.out.print(temp[i] + " ");
        }
    }
}