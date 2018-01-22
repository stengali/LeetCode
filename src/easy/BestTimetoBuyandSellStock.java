package easy;

/**
 * Created by stengali on 1/21/18.
 */
public class BestTimetoBuyandSellStock {

    public int maxProfit(int[] prices) {
        int maxSoFar = 0;
        int maxEndingHere = 0;
        for (int i=1;i<prices.length;i++) {
            maxEndingHere += prices[i] - prices[i-1];
            maxEndingHere = Math.max(0, maxEndingHere);
            maxSoFar = Math.max(maxEndingHere, maxSoFar);
        }
        return maxSoFar;
    }
    public static void main(String[] args) {
        BestTimetoBuyandSellStock obj = new BestTimetoBuyandSellStock();
        System.out.println(obj.maxProfit(new int[]{7, 1, 5, 3, 6, 4}));
    }
}
