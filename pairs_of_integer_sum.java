//find all pairs on integer array whose sum is equal to given number
import java.util.HashMap;
public class pairs_of_integer_sum
{
	static int arr[] = new int[] { 1, 5, 7, -1, 5 };
	public static int count_pairs(int size, int sum)
	{
		HashMap<Integer, Integer> hm = new HashMap<>();

		//store all the elements in hashmap
		for(int i=0; i<size; i++)
		{
			//if key not found then enter 0
			if (!hm.containsKey(arr[i]))
                hm.put(arr[i], 0);
 			
 			//hm.put(arr[i])++; same as this inserting array values in map
            hm.put(arr[i], hm.get(arr[i]) + 1);
            System.out.println(arr[i]);
		}

		int twice_count = 0;
		for(int i=0; i<size; i++)
		{
			//twice_count += hm.get(sum - arr[i]);
			//same as above line
			if (hm.get(sum - arr[i]) != null)
                twice_count += hm.get(sum - arr[i]);
		}

		return twice_count/2;


	}

	public static void main(String[] args) {
		//int arr[] = {1,5,7,-1,5};
		int size = arr.length;
		int sum = 6;

		int res = count_pairs(size, sum);
		System.out.println("Counts of pairs for required sum: "+res);
		
	}
}