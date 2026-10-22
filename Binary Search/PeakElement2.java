
import java.util.*;

public class PeakElement2 {
    public static int[] findPeakGrid(int[][] mat) {
        int rows = mat.length;
        int cols = mat[0].length;

        int low = 0;
        int high = cols - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            int maxRow = 0;

            // Find the maximum element in the middle column
            for (int i = 0; i < rows; i++) {
                if (mat[i][mid] > mat[maxRow][mid]) {
                    maxRow = i;
                }
            }

            int current = mat[maxRow][mid];

            int left = -1;
            int right = -1;

            if (mid > 0) {
                left = mat[maxRow][mid - 1];
            }

            if (mid < cols - 1) {
                right = mat[maxRow][mid + 1];
            }

            // Check whether the current element is a peak
            if (current > left && current > right) {
                return new int[]{maxRow, mid};
            } else if (left > current) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return new int[]{-1, -1};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of rows:");
        int rows = sc.nextInt();

        System.out.println("Enter number of columns:");
        int cols = sc.nextInt();

        int[][] mat = new int[rows][cols];

        System.out.println("Enter matrix elements:");

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                mat[i][j] = sc.nextInt();
            }
        }

        int[] result = findPeakGrid(mat);

        System.out.println("Peak element: " + mat[result[0]][result[1]]);
        System.out.println("Peak position (row, column): ("
                + result[0] + ", " + result[1] + ")");

        sc.close();
    }
}
