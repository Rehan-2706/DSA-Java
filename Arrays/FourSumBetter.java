import java.util.*;

public class FourSumBetter {

    static List<List<Integer>> getQuads(int[] arr, int target) {

        int n = arr.length;
        Set<List<Integer>> answer = new HashSet<>();

        for (int i = 0; i < n - 3; i++) {

            for (int j = i + 1; j < n - 2; j++) {

                HashSet<Long> seen = new HashSet<>();

                for (int k = j + 1; k < n; k++) {

                    long required = (long) target
                            - arr[i]
                            - arr[j]
                            - arr[k];

                    if (seen.contains(required)) {

                        List<Integer> quad = Arrays.asList(
                                arr[i],
                                arr[j],
                                arr[k],
                                (int) required
                        );

                        Collections.sort(quad);
                        answer.add(quad);
                    }

                    // Store the current element for future iterations
                    seen.add((long) arr[k]);
                }
            }
        }

        return new ArrayList<>(answer);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter target: ");
        int target = sc.nextInt();

        List<List<Integer>> ans = getQuads(arr, target);

        if (ans.isEmpty()) {
            System.out.println("No quadruplets found.");
        } else {
            System.out.println("Unique quadruplets:");
            for (List<Integer> quad : ans) {
                System.out.println(quad);
            }
        }

        sc.close();
    }
}