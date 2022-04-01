//Write a program to cyclically rotate an array by one.
public class cyclically_rotate_array
{
	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5};
		int j = arr.length-1;
		int temp=0;

		//printing original array
		System.out.print("Orioganl Array: ");
		for(int i=0; i<arr.length; i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();


		//making j as constant 
		//increamenting only i++ and swapping of i and j
		for(int i=0; i<arr.length; i++)
		//or(for i=0; i<arr.length-1;i++)both gives same output
		{
			//swapping of i and j
			temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
		}

		//printing rotational array
		System.out.print("Cyclic Rotational Array: ");
		for(int i=0; i<arr.length; i++)
		{
			System.out.print(arr[i]+" ");
		}
	}
}
