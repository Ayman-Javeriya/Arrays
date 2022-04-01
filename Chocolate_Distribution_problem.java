//Chocolate Distribution problem
import java.util.Arrays;
public class Chocolate_Distribution_problem
{
	public static int findMinDiff(int arr[], int m, int n)
	{
		int min_diff = Integer.MAX_VALUE;

		if(m == 0 || n == 0)
			return 0;
 
		if(n<m)
			return 0;

		Arrays.sort(arr);

		//loop for finding min diff of disrribution
		for(int i=0; i+m-1<n; i++)
		{
			int diff = arr[i+m-1] - arr[i];
			if(diff < min_diff)
				min_diff = diff;
		}
		return min_diff;

	}
	public static void main(String[] args) {
		//int arr[] = {12, 4, 7, 9, 2, 23,25, 41, 30, 40, 28,42, 30, 44, 48, 43,50};
		int arr[] = {7,3,2,4,9,12,56};
		int m = 3; //no of students
		int n = arr.length; //total no of packets
		System.out.println("Minimum difference is "+ findMinDiff(arr, m, n));
	}
}