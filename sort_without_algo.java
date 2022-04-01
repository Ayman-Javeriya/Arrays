//Given an array which consists of only 0, 1 and 2. Sort the array without using any sorting algo
import java.util.*;
public class sort_without_algo
{
	public static void main(String[] args) {
		int arr[] = {0,1,2,0,1,2};

		int count0 = 0;
		int count1 = 0;
		int count2 = 0;

		//loop for counting 0,1 and 2
		for(int i=0; i<arr.length; i++)
		{
			if(arr[i] == 0)
			{
				count0++;
			}
			if(arr[i] == 1)
			{
				count1++;
			}
			if(arr[i] == 2){
				count2++;
			}
		}

		for(int i=0; i<count0; i++)
		{
			arr[i] = 0;
		}

		for(int i=count0; i<(count0+count1); i++)
		{
			arr[i] = 1;
		}

		for(int i=(count0+count1); i<arr.length; i++)
		{
			arr[i] = 2;
		}

		for(int i=0; i<arr.length; i++)
		{
			System.out.print(arr[i]+" ");
		}
	}
}