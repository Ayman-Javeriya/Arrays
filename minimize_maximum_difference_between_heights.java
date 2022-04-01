//Minimise the maximum difference between heights [V.IMP]
import java.util.*;
public class minimize_maximum_difference_between_heights
{
	public static void main(String[] args) {
		int arr[] = {8, 1, 5, 4, 7, 5, 7, 9, 4, 6 };
		Arrays.sort(arr);
		System.out.print(Arrays.toString(arr));
		System.out.println();

		int n = arr.length;
		int k=3;
		int temp =0;

		int initial_diff = arr[n-1] - arr[0];
		int min = arr[0]+ k;
		int max = arr[n-1] - k;

		if(min>max)
		{
			temp = min;
			min = max;
			max = temp;
		}

		for(int i=1; i<n-1; i++)
		{
			int diff = arr[i] - k;
			int sum = arr[i] + k;

			if(diff >= min || sum <= max)
			{
				continue;
			}

			if(max - diff <= sum - min)
			{
				min = diff;
			}
			else{
				max = sum;
			}
		}
		System.out.println("Maximum Difference: "+Math.min(initial_diff,max));

	}
}