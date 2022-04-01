//Reverse the array

public class Reverse_Array
{
	public static void main(String[] args) {

		int arr[] = {5,1,6,8,3};

		//loop in reverse order
		System.out.println("Array in reverse order: ");
		for(int i=arr.length-1; i>=0; i--)
		{
			System.out.print(arr[i]+" ");
		}		
	}
}