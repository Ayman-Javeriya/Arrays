/*Best time to buy and Sell stock
You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock.

Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.

Example 1:

Input: prices = [7,1,5,3,6,4]
Output: 5
Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.
Note that buying on day 2 and selling on day 1 is not allowed because you must buy before you sell.
*/
public class buy_sell_stock
{

	//defining actual function
	public static int maxprofit_return(int stock[], int max_profit)
	{
		for(int i=1; i<stock.length; i++)
		{
			if(stock[i] > stock[i-1])
			{
				max_profit += stock[i] - stock[i-1];
				//System.out.println("Max Profit: "+max_profit);
			}
		}
		return max_profit;
	}

	public static void main(String[] args) {
		//int stock[] = {100, 180, 260, 310, 40, 535, 695};
		int stock[] ={7,1,5,3,6,4};
		int max_profit = 0;
		int res = maxprofit_return(stock,max_profit);
		System.out.println("Maximum profit of stocks: "+res);
	}
}