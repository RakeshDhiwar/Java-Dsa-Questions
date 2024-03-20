public class buyAndSellStock {
    public static void main(String[] args) {
        int[] prices = {7,1,5,3,6,4};
        buyandSell(prices);
    }

    private static void buyandSell(int[] prices) {
        int buyPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for (int i = 0; i < prices.length; i++) {
            if (buyPrice<prices[i]){
                maxProfit = Math.max(maxProfit,prices[i]-buyPrice);
            } else if (buyPrice>prices[i]) {
                buyPrice = prices[i];
            }
        }
        System.out.println(maxProfit);

    }
}
