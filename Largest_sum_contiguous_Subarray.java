//find Largest sum contiguous Subarray [V. IMP]
public class Largest_sum_contiguous_Subarray
{
	public static void main(String[] args) {
		int arr[] = {-2, -3, 4, -1, -2, 1, 5, -3};
		int max_sum=0;
		
		for(int i=0; i<arr.length; i++)
		{
			int sum=0;
			for(int j=i; j<arr.length; j++)
			{
				sum += arr[j];
				//System.out.println(sum);
				if(max_sum < sum)
				{
					max_sum = sum;
					//System.out.println(max_sum);
					
				}
			}
		}
		System.out.println("Largest sum of contiguous Subarray is: "+max_sum);
	}
}

