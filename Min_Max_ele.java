//Find the maximum and minimum element in an array

public class Min_Max_ele
{
	public static void main(String[] args) {

		//declaring array
		int arr[] = {56,90,21,55,87};
		int temp = 0;

		//loops for sorting arrays
		System.out.println("Sorted Array: ");
		for(int i=0; i<arr.length; i++)
		{
			for(int j=i+1; j<arr.length; j++)
			{
				if(arr[i]>arr[j])
				{
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
			System.out.print(arr[i]+" ");
		}

		//printing min & max elements
		System.out.println();
		System.out.println("MIN Element: "+arr[0]);
		System.out.println("MAX Element: "+arr[arr.length-1]);
	}
}