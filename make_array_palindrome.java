//Minimum no. of operations required to make an array palindrome
import java.util.Arrays;
public class make_array_palindrome
{
	public static int make_palindrome(int arr[], int n)
	{
		int ans = 0;
		for(int i=0, j=n-1; i<=j;)
		{
			if(arr[i] == arr[j])
			{
				i++;
				j--;
			}
			else if(arr[i] > arr[j])
			{
				j--;
				arr[j] += arr[j+1];
				ans++;
			}
			else{
				i++;
				arr[i]  += arr[i-1];
				ans++;
			}
		}
		//System.out.print(Arrays.toString(arr));
		//System.out.println();
		return ans;
	}
	public static void main(String[] args) {
		//int arr[] = {11, 14, 15, 99};
		int arr[] = {1,4,5,9,1};
		int n = arr.length;
		System.out.println("Minimum steps required to make array palindrome is: "+make_palindrome(arr, n));
	}
}
