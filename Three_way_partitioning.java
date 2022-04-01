//Three way partitioning of an array around a given value
public class Three_way_partitioning
{
	public static void partitioning(int arr[], int low_vale, int high_value)
	{
		int start = 0;
		int n = arr.length;
		int end = n-1;

		for(int i=0; i<=end;)
		{
			if(arr[i] < low_vale)
			{
				int temp = arr[start];
				arr[start] = arr[i];
				arr[i] = temp;
				i++;
				start++;
			}
			else if(arr[i] > high_value)
			{
				int temp = arr[end];
				arr[end] = arr[i];
				arr[i] = temp;
				end--;
			}
			else{
				i++;
			}
		}
	}
	public static void main(String[] args) {
		int arr[] = {1, 14, 5, 20, 4, 2, 54, 20, 87, 98, 3, 1, 32};
		partitioning(arr, 10, 20);

		System.out.print("After partitioning Array: ");
		for(int i=0; i<arr.length; i++)
		{
			System.out.print(arr[i]+" ");
		}
	}
}