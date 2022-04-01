//Median of 2 sorted arrays of different size
import java.util.Arrays;
public class media_of_diff_size_array
{
	public static int find_median(int arr3[])
	{
		int n = arr3.length;

		if(n % 2 == 0)
		{
			int mid = n/2;
			int mid1 = arr3[mid];
			int mid2 = arr3[mid - 1];
			int ans = (mid1 + mid2) / 2;
			return ans;
		}
		else{
			int mid = Math.round(n/2);
			return arr3[mid];
		}

	}

	public static void main(String[] args) {
		int arr1[] = {2,3,5,8};
		int arr2[] = {10,12,14,16,18};

		int i = arr1.length;
		int j = arr2.length;

		int[] arr3 = new int[i+j];

		System.arraycopy(arr1, 0, arr3, 0, i);
		System.arraycopy(arr2, 0, arr3, i, j);

		Arrays.sort(arr3);

		System.out.println("Median is: "+find_median(arr3));

	}
}