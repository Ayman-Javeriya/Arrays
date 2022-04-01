//Rearrange the array in alternating positive and negative items with O(1) extra space
import java.util.Arrays;
public class alternate_pos_neg
{

	public static void rearrange_array(int arr[], int n)
	{
		int i=-1; 
		int j=n;
		int temp = 0;

		while(i<j)
		{
			while(i< n && arr[i]>0)
				i+=1;

			while(j>=0 && arr[j]<0)
				j-=1;

			if(i<j)
			{
				arr[i] = temp;
				arr[i] = arr[j];
				temp = arr[j];
			}
		}

		if(i == 0 || i == n)
			return;

		System.out.println(i);

		int k = 0;
		while(k < n && i < n)
		{
			arr[k] = temp;
			arr[k] = arr[i];
			temp = arr[i];

			i = i+1;
			k = k+2;

		}

		//System.out.print("Array: "+Arrays.toString(arr));
		for(int p=0; p<n; p++)
		{
			System.out.println(arr[p]);
		}

	}

	public static void main(String[] args) {
		int arr[] = {2,3,-4,-1,6,-9};
		int n = 6;

		rearrange_array(arr, n);
	}
}