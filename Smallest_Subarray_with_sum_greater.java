//Smallest Subarray with sum greater than a given value
public class Smallest_Subarray_with_sum_greater
{
	static int smallestSubWithSum(int arr[], int n, int x)
    {
        int curr_sum = 0, min_len = n + 1;
 
        int start = 0, end = 0;
        while (end < n) {
            while (curr_sum <= x && end < n)
                curr_sum += arr[end++];
 
            while (curr_sum > x && start < n) {
                if (end - start < min_len)
                    min_len = end - start;
 
                curr_sum -= arr[start++];
            }
        }
        return min_len;
    }
    public static void main(String[] args)
    {
        int arr1[] = { 1, 4, 45, 6, 10, 19 };
        int x = 51;
        int n1 = arr1.length;
        int res1 = smallestSubWithSum(arr1, n1, x);
        if (res1 == n1 + 1)
            System.out.println("Not Possible");
        else
            System.out.println(res1);
 
        
    }
	/*public static int find_subarray(int arr[], int n, int x)
	{
		int start = 0, end = 0;
		int min_length = n+1;
		int currnt_sum = 0;

		while(end < n)
		{
			while(currnt_sum <= x && end < n)
				currnt_sum += arr[end++];

			while(currnt_sum > x && start < n)
				if(end - start < min_length)
					min_length = end - start;

				currnt_sum -= arr[start++];
		}
		//System.out.println(min_length);
		return min_length;
	}
	public static void main(String[] args) {
		int arr[] = {1,4,45,6,10,19};
		int n = arr.length;
		int x = 51;
		int res = find_subarray(arr, n, x);
		System.out.println(res);
	}*/
}
