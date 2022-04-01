//Find the triplet that sum to a given value
import java.util.Arrays;
public class triplet_of_sum
{
	public static boolean find_triplet(int arr[], int sum)
	{
		Arrays.sort(arr);
		int l,r;


		for(int i=0; i<arr.length; i++)
		{
			l = i+1;
			r = arr.length-1;
			while(l<r)
			{
				if(arr[i]+arr[l]+arr[r] == sum)
				{
					System.out.print("Triplet is " + arr[i] + ", " + arr[l] + ", " + arr[r]);
                    return true;
				}
				else if(arr[i]+arr[l]+arr[r] > sum)
					r--;
				else
					l++;
			}
		}
		return false;
	}
	public static void main(String[] args) {
		int arr[] = {12,3,4,1,6,9};
		int sum = 8;

		find_triplet(arr,sum);
	}
}