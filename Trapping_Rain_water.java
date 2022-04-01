//Trapping Rain water problem
public class Trapping_Rain_water
{
	public static void main(String[] args) {
		int arr[] = {0,1,2,0,0,3,1,0,3};
		int n = arr.length;
		int left[] = new int[n];
		int right[] = new int[n];
		int water = 0;

		left[0] = arr[0];
		//finding max of lefts
		for(int i=1; i<n; i++)
			left[i] = Math.max(left[i-1],arr[i]);

		right[n-1] = arr[n-1];
		//finding max all rights
		for(int i=n-2; i>=0; i--)
			right[i] = Math.max(right[i+1],arr[i]);

		//calculating water 
		for(int i=0; i<n; i++)
			water += Math.min(left[i],right[i]) - arr[i];

		System.out.println("Water Quantity: "+water);




	}
}