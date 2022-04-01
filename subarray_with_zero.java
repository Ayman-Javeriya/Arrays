//Find if there is any subarray with sum equal to 0
import java.util.HashSet;
import java.util.Set;
public class subarray_with_zero
{
	public static boolean sub_array(int arr[])
	{
		Set<Integer> hs = new HashSet<Integer>();

		int sum = 0;
		for(int i=0; i<arr.length; i++)
		{
			sum += arr[i];

			if(arr[i] == 0 || sum == 0 || hs.contains(sum))
				return true;

			hs.add(sum);
		}
		return false;
	}
	public static void main(String[] args) {
		int arr[] = {-3, 2, -1, 1, 6};
		if(sub_array(arr))
			System.out.println("Found a subarray with 0 sum");

		else
			System.out.println("Not Found a subarray with 0 sum");
	}
}