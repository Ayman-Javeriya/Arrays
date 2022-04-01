//Next Permutation
import java.util.Arrays;
import java.util.Collections;
public class Next_Permutation

{
	public static void main(String[] args) {
		
		int arr[] = {4,2,5,3,1};
		int size = arr.length;
		int index1;
		int index2;

		for(int i=size-2; i>=0; i--)
		{
			if(arr[i] < arr[i+1])
			{
				index1 = i;
			}			

		}

		if(index1 < 0)
		{
			Arrays.sort(arr);
		}
		else{
			for(int j=size-1; j>=0; j--)
			{
				if(arr[j] > arr[index1])
				{
					index2 = j;
				}
			}
		}

		int temp = 0;
		arr[index1] = temp;
		arr[index2] = arr[index1];
		temp = arr[index2];

		//Arrays.sort(arr[index1+1],arr[size-1]);

		for (int i = index1+1; i < arr.length; i++)   
		{  
			for (int j = i + 1; j < arr.length; j++)
			{
				int tmp = 0;
				if (arr[i] > arr[j])   
				{
					tmp = arr[i];  
					arr[i] = arr[j];
					arr[j] = tmp;
				} 
			}
		} 
		System.out.println(Arrays.toString(arr));

	}
}