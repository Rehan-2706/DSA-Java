import java.util.*;

public class MaxAndMinInArrayOptimal {
    static void countFreq(int[] arr, int n) {
        int minele = 0;
        int maxele = 0;
        int maxfreq = 0;
        int minfreq = n;
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int x : arr) {
            map.put(x, map.getOrDefault(x, 0) + 1);
        }
        for (Map.Entry<Integer, Integer> m : map.entrySet()) {
            int key = m.getKey();
            int val = m.getValue();

            if (val > maxfreq) {
                maxele = key;
                maxfreq = val;
            }
            if (val < minfreq) {
                minele = key;
                minfreq = val;
            }
        }
        System.out.println("Minimum Frequency : " + minfreq + "  Minimum frequency Element : " + minele);
        System.out.println("Maximum Frequency : " + maxfreq + "  Maximum frequency Element : " + maxele);
    }

    public static void main(String[] args) {
        int[] arr = { 10, 5, 10, 15, 10, 5 };
        int n = arr.length;
        countFreq(arr, n);
    }
}
