import java.util.*;

public class BookAllocation {

    public static int allocateBooks(int[] pages, int students) {

        int n = pages.length;

        // More students than books -> impossible
        if (students > n) {
            return -1;
        }

        int low = getMax(pages);
        int high = getSum(pages);

        while (low <= high) {

            int mid = low + (high - low) / 2;

            if (isPossible(pages, students, mid)) {
                // mid is possible
                // Try to find an even smaller maximum
                high = mid - 1;
            } else {
                // mid is not possible
                // Need a larger maximum
                low = mid + 1;
            }
        }

        return low;
    }

    // Checks whether books can be allocated to
    // students such that no student gets > maxPages
    static boolean isPossible(int[] pages, int students, int maxPages) {

        int studentCount = 1;
        int currentPages = 0;

        for (int page : pages) {

            if (currentPages + page <= maxPages) {
                currentPages += page;
            } else {

                // Give books to next student
                studentCount++;
                currentPages = page;

                if (studentCount > students) {
                    return false;
                }
            }
        }

        return true;
    }

    static int getMax(int[] pages) {

        int max = Integer.MIN_VALUE;

        for (int page : pages) {
            max = Math.max(max, page);
        }

        return max;
    }

    static int getSum(int[] pages) {

        int sum = 0;

        for (int page : pages) {
            sum += page;
        }

        return sum;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of books: ");
        int n = sc.nextInt();

        int[] pages = new int[n];

        System.out.println("Enter pages of books:");

        for (int i = 0; i < n; i++) {
            pages[i] = sc.nextInt();
        }

        System.out.print("Enter number of students: ");
        int students = sc.nextInt();

        int answer = allocateBooks(pages, students);

        System.out.println("Minimum maximum pages = " + answer);

        sc.close();
    }
}