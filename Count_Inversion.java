//Count Inversion 
public class Count_Inversion
{

	public static int countInversion(int arr[])
	{
		int count = 0;
		for(int i=0; i<arr.length; i++)
		{
			for(int j= i+1; j<arr.length; j++)
			{
				if(arr[i] > arr[j])
				{
					count++;
				}
			}
		}
		return count;
	}
	public static void main(String[] args) {
		int arr[] = {8,4,3,1,2};

		int res = countInversion(arr);
		System.out.print("Count Inversion require to sort array:  "+res);

	}
}