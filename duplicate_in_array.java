//find duplicate in an array of N+1 Integers
public class duplicate_in_array
{
	public static void main(String[] args) {
		int arr[] = {0,4,3,2,7,8,2,3,1,8,0,0};
		int size = arr.length;

		for(int i=0; i<size; i++)
		{
			arr[arr[i]%size] = arr[arr[i]%size] + size;
			//System.out.println(i+":"+arr[i]+":"+arr[arr[i]%size]);
		}

		System.out.print("Duplicate Elements of Array: ");
		for(int i=0; i<size; i++)
		{
			if(arr[i]/size > 1)
			{
				System.out.print(i+" ");
			}
		}
	}
	
}