//Median of 2 sorted arrays of equal size
import java.util.Arrays;
public class median_of_two_sorted_arrays
{
	public static int find_median(int arr1[], int arr2[], int n)
	{
		int i = n-1;
		int j = 0;

		while(arr1[i] > arr2[j] && j<n && i > -1)
		{
			int temp = arr1[i];
			arr1[i] = arr2[j];
			arr2[j] = temp;
			i--;
			j++;
		}
		Arrays.sort(arr1);
		Arrays.sort(arr2);

		return(arr1[n-1] + arr2[0]) / 2;

	}
	public static void main(String[] args) {
		int arr1[] = {1,12,15,26,38};
		int arr2[] = {2,13,17,30,45};
		int n1 = 5;
		int n2 = 5;

		if(n1 == n2){
			System.out.println("Median is: "+find_median(arr1,arr2,n1));
		}
		else{
			System.out.println("Does not work for unequal size of array.");
		}

	}
}