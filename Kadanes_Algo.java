//Kadane's Algo
public class Kadanes_Algo
{
	public static void main(String[] args) {
		int arr[] = {-2, -3, 4, -1, -2, 1, 5, -3};
		int max_so_far = arr[0];
		int max = arr[0];

		for(int i=1; i<arr.length; i++)
		{
			max_so_far = max_so_far+arr[i];
			System.out.println("max_so_far: "+max_so_far);
			System.out.println("max: "+max);

			if(max_so_far > max){
				max = max_so_far;
				//System.out.println("max: "+max);
			}
			if(max_so_far < 0)
			{
				max_so_far=0;
			}
		}
		System.out.println("Largest sum of contiguous Subarray is: "+max);
	}
}