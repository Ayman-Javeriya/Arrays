//Maximum profit by buying and selling a share atmost twice
public class max_profit_buy_sell
{
	static int maxProfit(int price[], int n)
    {
        // Create profit array
        // and initialize it as 0
        int profit[] = new int[n];
        for (int i = 0; i < n; i++)
            profit[i] = 0;
 
        int max_price = price[n - 1];
        //System.out.println(max_price);

        for (int i = n - 2; i >= 0; i--) {
            if (price[i] > max_price)
                max_price = price[i];
 
            profit[i] = Math.max(profit[i + 1],max_price - price[i]);
            System.out.println(i+" "+profit[i]);
        }
 
        int min_price = price[0];
        for (int i = 1; i < n; i++) {
            if (price[i] < min_price)
                min_price = price[i];
            System.out.println(i+" "+"min_price: "+min_price);
 
            profit[i] = Math.max(profit[i - 1],profit[i] + (price[i] - min_price));
            System.out.println(i+" "+profit[i]);
            System.out.println();
        }
        int result = profit[n - 1];
        return result;
    }
 
    // Driver Code
    public static void main(String args[])
    {
        int price[] = { 2, 30, 15, 10, 8, 25, 80 };
        int n = price.length;
        System.out.println("Maximum Profit = "+ maxProfit(price, n));
    }
 
}