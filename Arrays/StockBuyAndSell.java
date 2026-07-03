import java.util.*;

public class StockBuyAndSell {

    static int findProfit(int[] profit) {
        int maxprofit = 0;
        int mini = profit[0];
        for (int i = 1; i < profit.length - 1; i++) {
            int difference = profit[i] - mini;
            maxprofit = Math.max(maxprofit, difference);
            mini = Math.min(mini, profit[i]);
        }
        return maxprofit;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter size of array");
        int n = s.nextInt();
        System.out.println("Enter Price array");
        int profit[] = new int[n];
        for (int i = 0; i < n; i++) {
            profit[i] = s.nextInt();
        }
        int p = findProfit(profit);
        System.out.println("Maximum Profit : " + p);
    }
}
