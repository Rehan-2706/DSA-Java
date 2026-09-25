import java.util.*;

public class SearchInRotatedSortedArray2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter size of array ");
        int n = s.nextInt();
        System.out.println("Enter array elements");
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }
        System.out.println("Enter element to find");
        int target = s.nextInt();
        boolean index = getIndex(arr, target);

        if (index) {
            System.out.println("Element is  present in the array ");
        } else {
            System.out.println("Element is not present in the array ");
        }
    }

    static boolean getIndex(int arr[], int target) {
        int low = 0;
        int high = arr.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;

            if (arr[mid] == target) {
                return true;
            }

            if (arr[low]==arr[mid] && arr[mid]==arr[high]) {

                low+=1;
                high-=1;
                continue;
                
            }
            if (arr[low] <= arr[mid]) {
                if (arr[low] <= target && arr[mid] >= target) {

                    high = mid - 1;

                } else {
                    low = mid + 1;
                }
            } else {
                if (target >= arr[mid] && target <= arr[high]) {

                    low = mid + 1;

                } else {
                    high = mid - 1;
                }
            }

        }
        return false;
    }
}
