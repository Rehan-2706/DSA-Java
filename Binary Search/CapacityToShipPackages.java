import java.util.*;

public class CapacityToShipPackages {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input array size
        System.out.print("Enter number of packages: ");
        int n = sc.nextInt();

        // Input weights
        int[] weights = new int[n];

        System.out.println("Enter package weights:");
        for (int i = 0; i < n; i++) {
            weights[i] = sc.nextInt();
        }

        // Input number of days
        System.out.print("Enter number of days: ");
        int days = sc.nextInt();

        int answer = shipWithinDays(weights, days);

        System.out.println("Minimum required capacity: " + answer);

        sc.close();
    }

    static int shipWithinDays(int[] weights, int days) {

        // Minimum possible capacity = maximum single package
        int low = getMaximum(weights);

        // Maximum possible capacity = sum of all packages
        int high = getSum(weights);

        while (low <= high) {

            int mid = low + (high - low) / 2;

            int calculatedDays = getDays(weights, mid);

            if (calculatedDays <= days) {

                // Capacity is sufficient.
                // Try to find a smaller capacity.
                high = mid - 1;

            } else {

                // Capacity is insufficient.
                // Increase the capacity.
                low = mid + 1;
            }
        }

        return low;
    }

    // Find maximum weight
    static int getMaximum(int[] weights) {

        int max = weights[0];

        for (int i = 1; i < weights.length; i++) {

            if (weights[i] > max) {
                max = weights[i];
            }
        }

        return max;
    }

    // Find sum of all weights
    static int getSum(int[] weights) {

        int sum = 0;

        for (int i = 0; i < weights.length; i++) {
            sum += weights[i];
        }

        return sum;
    }

    // Calculate number of days required
    // for a given capacity
    static int getDays(int[] weights, int capacity) {

        int load = 0;
        int days = 1;

        for (int i = 0; i < weights.length; i++) {

            if (load + weights[i] > capacity) {

                // Current package cannot fit,
                // so start a new day.
                days++;

                load = weights[i];

            } else {

                load += weights[i];
            }
        }

        return days;
    }
}