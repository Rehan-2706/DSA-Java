import java.util.*;

public class KokoEatingBananas {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input array size
        System.out.print("Enter number of piles: ");
        int n = sc.nextInt();

        int[] piles = new int[n];

        // Input piles
        System.out.println("Enter bananas in each pile:");
        for (int i = 0; i < n; i++) {
            piles[i] = sc.nextInt();
        }

        // Input maximum allowed hours
        System.out.print("Enter maximum hours: ");
        int h = sc.nextInt();

        int answer = minEatingSpeed(piles, h);

        System.out.println("Minimum eating speed: " + answer);

        sc.close();
    }

    static int minEatingSpeed(int[] piles, int h) {

        int low = 1;
        int high = getMax(piles);
        int answer = -1;

        while (low <= high) {

            int mid = low + (high - low) / 2;

            int calculatedHours = getHours(piles, mid);

            if (calculatedHours <= h) {

                // This speed works, so try a smaller speed
                answer = mid;
                high = mid - 1;

            } else {

                // This speed is too slow, so increase speed
                low = mid + 1;
            }
        }

        return answer;
    }

    static int getMax(int[] piles) {

        int max = piles[0];

        for (int i = 1; i < piles.length; i++) {

            if (piles[i] > max) {
                max = piles[i];
            }
        }

        return max;
    }

    static int getHours(int[] piles, int speed) {

        int hours = 0;

        for (int i = 0; i < piles.length; i++) {

            // Ceiling(piles[i] / speed)
            hours += (piles[i] + speed - 1) / speed;
        }

        return hours;
    }
}