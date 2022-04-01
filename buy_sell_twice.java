//Maximum profit by buying and selling a share atmost twice
import java.util.*;
public class buy_sell_twice
{
	public static int find_profit(int arr[], int n)
	{
		int first_buy = Integer.MIN_VALUE;
		int first_sell = 0;
		int second_buy = Integer.MIN_VALUE;
		int second_sell = 0;

		for(int i=0; i<n; i++)
		{
			first_buy = Math.max(first_buy, -arr[i]);
			first_sell = Math.max(first_sell, first_buy+arr[i]);
			second_buy = Math.max(second_buy, first_sell-arr[i]);
			second_sell = Math.max(second_sell, second_buy+arr[i]);
		}
		return second_sell;
	}
	public static void main(String[] args) {
		int arr[] = {2,30,15,10,8,25,80};
		int n = arr.length;

		System.out.print("Maximum profit by buying and selling a share atmost twice: "+find_profit(arr,n));
	}
}