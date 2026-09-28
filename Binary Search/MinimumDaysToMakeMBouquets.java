import java.util.*;

public class MinimumDaysToMakeMBouquets {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] bloomDay = new int[n];

        System.out.println("Enter bloom days:");
        for (int i = 0; i < n; i++) {
            bloomDay[i] = sc.nextInt();
        }

        System.out.print("Enter number of bouquets (m): ");
        int m = sc.nextInt();

        System.out.print("Enter flowers per bouquet (k): ");
        int k = sc.nextInt();

        int answer = minDays(bloomDay, m, k);

        System.out.println("Minimum number of days: " + answer);

        sc.close();
    }

    static int minDays(int[] bloomDay, int m, int k) {

        int n = bloomDay.length;

        // Check if we have enough flowers
        // Use long to avoid integer overflow
        if ((long) m * k > n) {
            return -1;
        }

        int low = getMinimum(bloomDay);
        int high = getMaximum(bloomDay);

        while (low <= high) {

            int mid = low + (high - low) / 2;

            if (isPossible(bloomDay, mid, m, k)) {

                // We can make m bouquets
                // Try to find an even smaller number of days
                high = mid - 1;

            } else {

                // Not enough flowers have bloomed
                // Need more days
                low = mid + 1;
            }
        }

        return low;
    }

    static boolean isPossible(int[] bloomDay, int mid, int m, int k) {

        int bouquetCount = 0;
        int count = 0;

        for (int i = 0; i < bloomDay.length; i++) {

            if (bloomDay[i] <= mid) {

                // Flower has bloomed
                count++;

            } else {

                // Consecutive group has ended
                bouquetCount += count / k;

                count = 0;
            }
        }

        // Process the remaining consecutive flowers
        bouquetCount += count / k;

        return bouquetCount >= m;
    }

    static int getMinimum(int[] bloomDay) {

        int min = bloomDay[0];

        for (int i = 1; i < bloomDay.length; i++) {

            if (bloomDay[i] < min) {
                min = bloomDay[i];
            }
        }

        return min;
    }

    static int getMaximum(int[] bloomDay) {

        int max = bloomDay[0];

        for (int i = 1; i < bloomDay.length; i++) {

            if (bloomDay[i] > max) {
                max = bloomDay[i];
            }
        }

        return max;
    }
}