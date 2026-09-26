import java.util.*;

public class RotationCount {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter size of array");
        int n = s.nextInt();

        System.out.println("Enter array elements");
        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }

        int count = getCount(arr);

        System.out.println("The array is rotated this no. of times: " + count);
    }

    static int getCount(int arr[]) {

        int low = 0;
        int high = arr.length - 1;
        int mini = Integer.MAX_VALUE;
        int index=-1;

        while (low <= high) {

            int mid = low + (high - low) / 2;

            if (arr[low] < arr[high]) {
                if (arr[low]<mini) {
                    mini=arr[low];
                    index=low;
                }
                break;
            }

            if (arr[low] <= arr[mid]) {
                    if (arr[low]<mini) {
                        mini=arr[low];
                        index=low;
                    }
                low = mid + 1;

            }

            else {
                if (arr[mid]<mini) {
                    mini=arr[mid];
                    index=mid;
                }
                high = mid - 1;
            }
        }

        return index;
    }
}