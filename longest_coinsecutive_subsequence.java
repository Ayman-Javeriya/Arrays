//Find longest coinsecutive subsequence
import java.io.*;
import java.util.*;
public class longest_coinsecutive_subsequence
{

	public static int find_coinsecutive(int arr[], int size)
	{
		HashSet<Integer> hs = new HashSet<Integer>();
		int ans = 0;

		//insert array elements in set
		for(int i=0; i<size; i++)
		{
			hs.add(arr[i]);
		}

		//check wther prevoius element is present or not
		for(int i=0; i<size; i++)
		{
			if(!hs.contains(arr[i]-1))
			{
				int j = arr[i];
				while(hs.contains(j))
					j++;

				System.out.println(j);

				if(ans < j-arr[i])
					ans = j-arr[i];
					//System.out.println(ans);
					//System.out.println(j-arr[i]); //as j will increment one more extra time thatswhy we need to - it.


			}

		}
		return ans;


	}
	public static void main(String[] args) {
		int arr[] = {1,9,3,10,4,20,2};
		int size = arr.length;

		System.out.println("Longest Coinsecutive Subsequence: "+find_coinsecutive(arr, size));
	}

}